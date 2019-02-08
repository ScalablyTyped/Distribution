package typings
package jscodeshiftLib.srcCollectionsJSXElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalMethods extends js.Object {
  /**
    * Finds all JSXElements optionally filtered by name
    */
  def findJSXElements(): jscodeshiftLib.srcCollectionMod.Collection[JSXElement] = js.native
  def findJSXElements(name: java.lang.String): jscodeshiftLib.srcCollectionMod.Collection[JSXElement] = js.native
  /**
    * Finds all JSXElements by module name. Given
    *
    *     var Bar = require('Foo');
    *     <Bar />
    *
    * findJSXElementsByModuleName('Foo') will find <Bar />, without having to
    * know the variable name.
    */
  def findJSXElementsByModuleName(moduleName: java.lang.String): jscodeshiftLib.srcCollectionMod.Collection[JSXElement] = js.native
}

