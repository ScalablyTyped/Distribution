package typings.javascriptObfuscator.icustomnodegroupMod

import typings.javascriptObfuscator.icustomnodeMod.ICustomNode
import typings.javascriptObfuscator.iinitializableMod.IInitializable
import typings.javascriptObfuscator.istacktracedataMod.IStackTraceData
import typings.javascriptObfuscator.tnodewithstatementsMod.TNodeWithStatements
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomNodeGroup
  extends IInitializable[js.Array[scala.Nothing]] {
  /**
    * @param nodeWithStatements
    * @param stackTraceData
    */
  def appendCustomNodes(nodeWithStatements: TNodeWithStatements, stackTraceData: js.Array[IStackTraceData]): Unit
  /**
    * @returns {ObfuscationEvent}
    */
  def getAppendEvent(): js.Any
  /**
    * @type {Map <CustomNode, ICustomNode>}
    */
  def getCustomNodes(): Map[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomNode */ _, 
    ICustomNode
  ]
  def initialize(): Unit
}

object ICustomNodeGroup {
  @scala.inline
  def apply(
    appendCustomNodes: (TNodeWithStatements, js.Array[IStackTraceData]) => Unit,
    getAppendEvent: () => js.Any,
    getCustomNodes: () => Map[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomNode */ _, 
      ICustomNode
    ],
    initialize: () => Unit
  ): ICustomNodeGroup = {
    val __obj = js.Dynamic.literal(appendCustomNodes = js.Any.fromFunction2(appendCustomNodes), getAppendEvent = js.Any.fromFunction0(getAppendEvent), getCustomNodes = js.Any.fromFunction0(getCustomNodes), initialize = js.Any.fromFunction0(initialize))
  
    __obj.asInstanceOf[ICustomNodeGroup]
  }
}

