package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Testers extends StObject {
  
  /** All testing Google Groups, as email addresses. */
  var googleGroups: js.UndefOr[js.Array[String]] = js.undefined
}
object Testers {
  
  inline def apply(): Testers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Testers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Testers] (val x: Self) extends AnyVal {
    
    inline def setGoogleGroups(value: js.Array[String]): Self = StObject.set(x, "googleGroups", value.asInstanceOf[js.Any])
    
    inline def setGoogleGroupsUndefined: Self = StObject.set(x, "googleGroups", js.undefined)
    
    inline def setGoogleGroupsVarargs(value: String*): Self = StObject.set(x, "googleGroups", js.Array(value*))
  }
}
