package typings.jestSinon

import typings.sinon.mod.SinonMatch
import typings.sinon.mod.SinonSpy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("jest")
@js.native
object jest extends js.Object {
  
  @js.native
  trait Matchers[R, T] extends js.Object {
    
    def toAlwaysReturnWith(obj: js.Any): R = js.native
    
    def toAlwaysThrow(): R = js.native
    def toAlwaysThrow(error: js.Any): R = js.native
    
    def toAlwaysThrowError(): R = js.native
    def toAlwaysThrowError(error: js.Any): R = js.native
    
    def toBeAlwaysCalledOn(`object`: js.Object): R = js.native
    
    def toBeAlwaysCalledWith(args: js.Any*): R = js.native
    
    def toBeAlwaysCalledWithExactly(args: js.Any*): R = js.native
    
    def toBeAlwaysCalledWithMatch(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Array<sinon.SinonMatch> | Array<any> is not an array type */ args: js.Array[_ | SinonMatch]
    ): R = js.native
    
    def toBeAlwaysCalledWithNew(): R = js.native
    
    def toBeCalled(): R = js.native
    
    def toBeCalledAfter(spy: SinonSpy[js.Array[_], _]): R = js.native
    
    def toBeCalledBefore(spy: SinonSpy[js.Array[_], _]): R = js.native
    
    def toBeCalledImmediatelyAfter(spy: SinonSpy[js.Array[_], _]): R = js.native
    
    def toBeCalledImmediatelyBefore(spy: SinonSpy[js.Array[_], _]): R = js.native
    
    def toBeCalledOn(`object`: js.Object): R = js.native
    
    def toBeCalledOnce(): R = js.native
    
    def toBeCalledOnceWith(args: js.Any*): R = js.native
    
    def toBeCalledOnceWithExactly(args: js.Any*): R = js.native
    
    def toBeCalledThrice(): R = js.native
    
    def toBeCalledTimes(callCount: Double): R = js.native
    
    def toBeCalledTwice(): R = js.native
    
    def toBeCalledWith(args: js.Any*): R = js.native
    
    def toBeCalledWithExactly(args: js.Any*): R = js.native
    
    def toBeCalledWithMatch(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Array<sinon.SinonMatch> | Array<any> is not an array type */ args: js.Array[_ | SinonMatch]
    ): R = js.native
    
    def toBeCalledWithNew(): R = js.native
    
    def toHaveAlwaysReturnedWith(obj: js.Any): R = js.native
    
    def toHaveAlwaysThrown(): R = js.native
    def toHaveAlwaysThrown(error: js.Any): R = js.native
    
    def toHaveAlwaysThrownError(): R = js.native
    def toHaveAlwaysThrownError(error: js.Any): R = js.native
    
    def toHaveBeenAlwaysCalledOn(`object`: js.Object): R = js.native
    
    def toHaveBeenAlwaysCalledWith(args: js.Any*): R = js.native
    
    def toHaveBeenAlwaysCalledWithExactly(args: js.Any*): R = js.native
    
    def toHaveBeenAlwaysCalledWithMatch(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Array<sinon.SinonMatch> | Array<any> is not an array type */ args: js.Array[_ | SinonMatch]
    ): R = js.native
    
    def toHaveBeenAlwaysCalledWithNew(): R = js.native
    
    def toHaveBeenCalled(): R = js.native
    
    def toHaveBeenCalledAfter(spy: SinonSpy[js.Array[_], _]): R = js.native
    
    def toHaveBeenCalledBefore(spy: SinonSpy[js.Array[_], _]): R = js.native
    
    def toHaveBeenCalledImmediatelyAfter(spy: SinonSpy[js.Array[_], _]): R = js.native
    
    def toHaveBeenCalledImmediatelyBefore(spy: SinonSpy[js.Array[_], _]): R = js.native
    
    def toHaveBeenCalledOn(`object`: js.Object): R = js.native
    
    def toHaveBeenCalledOnce(): R = js.native
    
    def toHaveBeenCalledOnceWith(args: js.Any*): R = js.native
    
    def toHaveBeenCalledOnceWithExactly(args: js.Any*): R = js.native
    
    def toHaveBeenCalledThrice(): R = js.native
    
    def toHaveBeenCalledTimes(callCount: Double): R = js.native
    
    def toHaveBeenCalledTwice(): R = js.native
    
    def toHaveBeenCalledWith(args: js.Any*): R = js.native
    
    def toHaveBeenCalledWithExactly(args: js.Any*): R = js.native
    
    def toHaveBeenCalledWithMatch(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Array<sinon.SinonMatch> | Array<any> is not an array type */ args: js.Array[_ | SinonMatch]
    ): R = js.native
    
    def toHaveBeenCalledWithNew(): R = js.native
    
    def toHaveCallCount(callCount: Double): R = js.native
    
    def toHaveReturned(obj: js.Any): R = js.native
    
    def toHaveReturnedWith(obj: js.Any): R = js.native
    
    def toHaveThrown(): R = js.native
    def toHaveThrown(error: js.Any): R = js.native
    
    def toReturn(obj: js.Any): R = js.native
    
    def toReturnWith(obj: js.Any): R = js.native
    
    def toThrow(): R = js.native
    def toThrow(error: js.Any): R = js.native
    
    def toThrowError(): R = js.native
    def toThrowError(error: js.Any): R = js.native
  }
}
