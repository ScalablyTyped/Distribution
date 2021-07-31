package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metaphoneMod {
  
  @scala.inline
  def apply(): js.Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Any]
  @scala.inline
  def apply(word: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].apply(word.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def apply(word: js.Any, maxPhonemes: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].apply(word.asInstanceOf[js.Any], maxPhonemes.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def apply(word: Unit, maxPhonemes: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].apply(word.asInstanceOf[js.Any], maxPhonemes.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("locutus/php/strings/metaphone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
