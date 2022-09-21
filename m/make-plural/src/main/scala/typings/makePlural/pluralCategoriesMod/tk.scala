package typings.makePlural.pluralCategoriesMod

import typings.makePlural.makePluralStrings.few
import typings.makePlural.makePluralStrings.one
import typings.makePlural.makePluralStrings.other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tk {
  
  @JSImport("make-plural/pluralCategories", "tk")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/pluralCategories", "tk.cardinal")
  @js.native
  def cardinal: js.Tuple2[one, other] = js.native
  inline def cardinal_=(x: js.Tuple2[one, other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/pluralCategories", "tk.ordinal")
  @js.native
  def ordinal: js.Tuple2[few, other] = js.native
  inline def ordinal_=(x: js.Tuple2[few, other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
