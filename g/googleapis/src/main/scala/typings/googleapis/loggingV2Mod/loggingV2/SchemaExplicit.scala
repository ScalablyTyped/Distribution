package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies a set of buckets with arbitrary widths.There are size(bounds) + 1
  * (= N) buckets. Bucket i has the following boundaries:Upper bound (0 &lt;= i
  * &lt; N-1): boundsi  Lower bound (1 &lt;= i &lt; N); boundsi - 1The bounds
  * field must contain at least one element. If bounds has only one element,
  * then there are no finite buckets, and that single element is the common
  * boundary of the overflow and underflow buckets.
  */
trait SchemaExplicit extends StObject {
  
  /**
    * The values must be monotonically increasing.
    */
  var bounds: js.UndefOr[js.Array[Double]] = js.undefined
}
object SchemaExplicit {
  
  @scala.inline
  def apply(): SchemaExplicit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExplicit]
  }
  
  @scala.inline
  implicit class SchemaExplicitMutableBuilder[Self <: SchemaExplicit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: js.Array[Double]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setBoundsVarargs(value: Double*): Self = StObject.set(x, "bounds", js.Array(value :_*))
  }
}
