package typings.limiter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("limiter", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class RateLimiter protected () extends js.Object {
    def this(tokensPerInterval: Double, interval: Interval) = this()
    def this(tokensPerInterval: Double, interval: Interval, fireImmediately: Boolean) = this()
    
    def getTokensRemaining(): Double = js.native
    
    def removeTokens(count: Double, callback: RemoveTokensCallback): Unit = js.native
    
    def tryRemoveTokens(count: Double): Boolean = js.native
  }
  
  @js.native
  class TokenBucket protected () extends js.Object {
    def this(bucketSize: Double, tokensPerInterval: Double, interval: Interval) = this()
    def this(bucketSize: Double, tokensPerInterval: Double, interval: Interval, parentBucket: TokenBucket) = this()
    
    def drip(): Boolean = js.native
    
    def removeTokens(count: Double, callback: RemoveTokensCallback): Unit = js.native
    
    def tryRemoveTokens(count: Double): Boolean = js.native
  }
  
  trait _Interval extends js.Object
  
  type Fail[T] = js.Function1[/* error */ T, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.limiter.limiterStrings.second
    - typings.limiter.limiterStrings.sec
    - typings.limiter.limiterStrings.minute
    - typings.limiter.limiterStrings.min
    - typings.limiter.limiterStrings.hour
    - typings.limiter.limiterStrings.hr
    - typings.limiter.limiterStrings.day
  */
  type Interval = _Interval | Double
  
  type RemoveTokensCallback = Fail[TokenBucketError] | Success[Double]
  
  type Success[T] = js.Function2[/* error */ Null, /* data */ T, Unit]
  
  type TokenBucketError = String
}
