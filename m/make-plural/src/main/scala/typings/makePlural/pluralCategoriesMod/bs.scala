package typings.makePlural.pluralCategoriesMod

import typings.makePlural.makePluralStrings.few
import typings.makePlural.makePluralStrings.one
import typings.makePlural.makePluralStrings.other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bs {
  
  @JSImport("make-plural/pluralCategories", "bs")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/pluralCategories", "bs.cardinal")
  @js.native
  def cardinal: js.Tuple3[one, few, other] = js.native
  inline def cardinal_=(x: js.Tuple3[one, few, other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/pluralCategories", "bs.ordinal")
  @js.native
  def ordinal: js.Array[other] = js.native
  inline def ordinal_=(x: js.Array[other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
