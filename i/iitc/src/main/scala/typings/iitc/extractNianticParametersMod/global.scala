package typings.iitc.extractNianticParametersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  /**
    * as of 2014-08-14, Niantic have returned to minifying the javascript. This means we no longer get the nemesis object
    * and it's various member objects, functions, etc.
    * so we need to extract some essential parameters from the code for IITC to use
    */
  def extractFromStock(): Unit = js.native
}
