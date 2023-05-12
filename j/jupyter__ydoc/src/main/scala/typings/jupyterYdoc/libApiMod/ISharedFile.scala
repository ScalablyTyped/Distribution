package typings.jupyterYdoc.libApiMod

import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISharedFile
  extends StObject
     with ISharedDocument
     with ISharedText {
  
  /**
    * The changed signal.
    */
  /* InferMemberOverrides */
  override val changed: (ISignal[this.type, SourceChange]) & (ISignal[this.type, DocumentChange]) = js.native
  /**
    * The changed signal.
    */
  @JSName("changed")
  val changed_ISharedFile: ISignal[this.type, FileChange] = js.native
}
