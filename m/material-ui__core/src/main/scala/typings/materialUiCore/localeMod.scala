package typings.materialUiCore

import typings.materialUiCore.anon.MuiAlert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeMod {
  
  @JSImport("@material-ui/core/locale", "azAZ")
  @js.native
  val azAZ: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "bgBG")
  @js.native
  val bgBG: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "caES")
  @js.native
  val caES: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "csCZ")
  @js.native
  val csCZ: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "deDE")
  @js.native
  val deDE: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "enUS")
  @js.native
  val enUS: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "esES")
  @js.native
  val esES: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "etEE")
  @js.native
  val etEE: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "faIR")
  @js.native
  val faIR: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "fiFI")
  @js.native
  val fiFI: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "frFR")
  @js.native
  val frFR: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "heIL")
  @js.native
  val heIL: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "hiIN")
  @js.native
  val hiIN: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "huHU")
  @js.native
  val huHU: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "hyAM")
  @js.native
  val hyAM: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "idID")
  @js.native
  val idID: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "isIS")
  @js.native
  val isIS: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "itIT")
  @js.native
  val itIT: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "jaJP")
  @js.native
  val jaJP: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "koKR")
  @js.native
  val koKR: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "nlNL")
  @js.native
  val nlNL: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "plPL")
  @js.native
  val plPL: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "ptBR")
  @js.native
  val ptBR: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "ptPT")
  @js.native
  val ptPT: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "roRO")
  @js.native
  val roRO: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "ruRU")
  @js.native
  val ruRU: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "skSK")
  @js.native
  val skSK: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "svSE")
  @js.native
  val svSE: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "trTR")
  @js.native
  val trTR: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "ukUA")
  @js.native
  val ukUA: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "viVN")
  @js.native
  val viVN: Localization = js.native
  
  @JSImport("@material-ui/core/locale", "zhCN")
  @js.native
  val zhCN: Localization = js.native
  
  trait Localization extends StObject {
    
    var props: js.UndefOr[MuiAlert] = js.undefined
  }
  object Localization {
    
    inline def apply(): Localization = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Localization]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Localization] (val x: Self) extends AnyVal {
      
      inline def setProps(value: MuiAlert): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
}
