package typings.marko

import typings.marko.taglibMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marko/src/compiler/taglib-finder", JSImport.Namespace)
@js.native
object taglibFinderMod extends js.Object {
  
  def clearCache(): Unit = js.native
  
  def excludeDir(dir: String): Unit = js.native
  
  def excludePackage(name: String): Unit = js.native
  
  def find(dirname: String, registeredTaglibs: js.Array[default]): js.Array[default] = js.native
  
  def reset(): Unit = js.native
}
