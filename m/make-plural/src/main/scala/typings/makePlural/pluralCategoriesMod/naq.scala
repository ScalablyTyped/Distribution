package typings.makePlural.pluralCategoriesMod

import typings.makePlural.makePluralStrings.one
import typings.makePlural.makePluralStrings.other
import typings.makePlural.makePluralStrings.two
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object naq {
  
  @JSImport("make-plural/pluralCategories", "naq")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/pluralCategories", "naq.cardinal")
  @js.native
  def cardinal: js.Tuple3[one, two, other] = js.native
  inline def cardinal_=(x: js.Tuple3[one, two, other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/pluralCategories", "naq.ordinal")
  @js.native
  def ordinal: js.Array[other] = js.native
  inline def ordinal_=(x: js.Array[other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
