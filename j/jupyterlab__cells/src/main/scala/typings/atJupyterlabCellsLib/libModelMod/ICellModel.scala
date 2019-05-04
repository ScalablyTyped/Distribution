package typings
package atJupyterlabCellsLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait ICellModel extends js.Object {
  /**
    * A signal emitted when the content of the model changes.
    */
  val contentChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[ICellModel, scala.Unit]
  /**
    * A unique identifier for the cell.
    */
  val id: java.lang.String
  /**
    * The metadata associated with the cell.
    */
  val metadata: atJupyterlabObservablesLib.libObservablejsonMod.IObservableJSON
  /**
    * A signal emitted when a model state changes.
    */
  val stateChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[ICellModel, atJupyterlabCoreutilsLib.libInterfacesMod.IChangedArgs[_]]
  /**
    * Whether the cell is trusted.
    */
  var trusted: scala.Boolean
  /**
    * The type of the cell.
    */
  val `type`: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.CellType
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ICell
}

object ICellModel {
  @scala.inline
  def apply(
    contentChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[ICellModel, scala.Unit],
    id: java.lang.String,
    metadata: atJupyterlabObservablesLib.libObservablejsonMod.IObservableJSON,
    stateChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[ICellModel, atJupyterlabCoreutilsLib.libInterfacesMod.IChangedArgs[_]],
    toJSON: () => atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ICell,
    trusted: scala.Boolean,
    `type`: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.CellType
  ): ICellModel = {
    val __obj = js.Dynamic.literal(contentChanged = contentChanged, id = id, metadata = metadata, stateChanged = stateChanged, toJSON = js.Any.fromFunction0(toJSON), trusted = trusted)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICellModel]
  }
}

