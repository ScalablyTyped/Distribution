package typings.javascriptObfuscator.icustomnodeMod

import typings.javascriptObfuscator.iinitializableMod.IInitializable
import typings.javascriptObfuscator.tstatementMod.TStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomNode
  extends IInitializable[js.Array[js.Any]] {
  /**
    * @returns ESTree.Node[]
    */
  def getNode(): js.Array[TStatement]
}

object ICustomNode {
  @scala.inline
  def apply(getNode: () => js.Array[TStatement], initialize: js.Array[js.Any] => Unit): ICustomNode = {
    val __obj = js.Dynamic.literal(getNode = js.Any.fromFunction0(getNode), initialize = js.Any.fromFunction1(initialize))
  
    __obj.asInstanceOf[ICustomNode]
  }
}

