package typings.jestRegexUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-regex-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def escapePathForRegex(dir: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapePathForRegex")(dir.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def escapeStrForRegex(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeStrForRegex")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def replacePathSepForRegex(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("replacePathSepForRegex")(string.asInstanceOf[js.Any]).asInstanceOf[String]
}
