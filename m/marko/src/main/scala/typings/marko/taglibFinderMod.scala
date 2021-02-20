package typings.marko

import typings.marko.taglibMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taglibFinderMod {
  
  @JSImport("marko/src/compiler/taglib-finder", "clearCache")
  @js.native
  def clearCache(): Unit = js.native
  
  @JSImport("marko/src/compiler/taglib-finder", "excludeDir")
  @js.native
  def excludeDir(dir: String): Unit = js.native
  
  @JSImport("marko/src/compiler/taglib-finder", "excludePackage")
  @js.native
  def excludePackage(name: String): Unit = js.native
  
  @JSImport("marko/src/compiler/taglib-finder", "find")
  @js.native
  def find(dirname: String, registeredTaglibs: js.Array[default]): js.Array[default] = js.native
  
  @JSImport("marko/src/compiler/taglib-finder", "reset")
  @js.native
  def reset(): Unit = js.native
}
