package typings.humanInterval

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.UndefOr[Double]]
  @scala.inline
  def apply(time: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].apply(time.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  @JSImport("human-interval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("human-interval", "languageMap")
  @js.native
  def languageMap: LanguageMap_ = js.native
  @scala.inline
  def languageMap_=(x: LanguageMap_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("languageMap")(x.asInstanceOf[js.Any])
  
  type LanguageMap_ = StringDictionary[Double]
}
