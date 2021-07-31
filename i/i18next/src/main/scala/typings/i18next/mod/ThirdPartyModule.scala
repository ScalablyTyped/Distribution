package typings.i18next.mod

import typings.i18next.i18nextStrings.`3rdParty`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThirdPartyModule
  extends StObject
     with Module {
  
  def init(i18next: i18n): Unit
  
  @JSName("type")
  var type_ThirdPartyModule: `3rdParty`
}
object ThirdPartyModule {
  
  @scala.inline
  def apply(init: i18n => Unit): ThirdPartyModule = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
    __obj.updateDynamic("type")("3rdParty")
    __obj.asInstanceOf[ThirdPartyModule]
  }
  
  @scala.inline
  implicit class ThirdPartyModuleMutableBuilder[Self <: ThirdPartyModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: i18n => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: `3rdParty`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
