package typings.leoProfanity

import typings.leoProfanity.leoProfanityStrings.en
import typings.leoProfanity.leoProfanityStrings.fr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("leo-profanity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(word: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(word.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def add(word: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(word.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def check(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def clean(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("clean")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def clean(text: String, replaceKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("clean")(text.asInstanceOf[js.Any], replaceKey.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def clearList(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearList")().asInstanceOf[Unit]
  
  inline def list(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Array[String]]
  
  inline def loadDictionary(lang: en | fr): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadDictionary")(lang.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def remove(word: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(word.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def remove(word: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(word.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
}
