package typings.maximMazurokGapiClientAdsensehost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Family extends StObject {
  
  /** The family of the font. Possible values are: ACCOUNT_DEFAULT_FAMILY, ADSENSE_DEFAULT_FAMILY, ARIAL, TIMES and VERDANA. */
  var family: js.UndefOr[String] = js.undefined
  
  /** The size of the font. Possible values are: ACCOUNT_DEFAULT_SIZE, ADSENSE_DEFAULT_SIZE, SMALL, MEDIUM and LARGE. */
  var size: js.UndefOr[String] = js.undefined
}
object Family {
  
  @scala.inline
  def apply(): Family = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Family]
  }
  
  @scala.inline
  implicit class FamilyMutableBuilder[Self <: Family] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
