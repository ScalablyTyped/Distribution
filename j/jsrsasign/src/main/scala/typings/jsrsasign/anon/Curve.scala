package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Curve extends StObject {
  
  var curve: String = js.native
  
  var pub: js.UndefOr[String] = js.native
}
object Curve {
  
  @scala.inline
  def apply(curve: String): Curve = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Curve]
  }
  
  @scala.inline
  implicit class CurveMutableBuilder[Self <: Curve] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurve(value: String): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPub(value: String): Self = StObject.set(x, "pub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubUndefined: Self = StObject.set(x, "pub", js.undefined)
  }
}
