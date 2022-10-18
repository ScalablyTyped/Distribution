package typings.jupyterlabCells

import typings.jupyterlabCells.libCelldragutilsMod.CellDragUtils.ICellTargetArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jupyterlabCellsStrings {
  
  @js.native
  sealed trait bounded extends StObject
  inline def bounded: bounded = "bounded".asInstanceOf[bounded]
  
  @js.native
  sealed trait cell
    extends StObject
       with ICellTargetArea
  inline def cell: cell = "cell".asInstanceOf[cell]
  
  @js.native
  sealed trait code extends StObject
  inline def code: code = "code".asInstanceOf[code]
  
  @js.native
  sealed trait input
    extends StObject
       with ICellTargetArea
  inline def input: input = "input".asInstanceOf[input]
  
  @js.native
  sealed trait markdown extends StObject
  inline def markdown: markdown = "markdown".asInstanceOf[markdown]
  
  @js.native
  sealed trait off extends StObject
  inline def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait on extends StObject
  inline def on: on = "on".asInstanceOf[on]
  
  @js.native
  sealed trait prompt
    extends StObject
       with ICellTargetArea
  inline def prompt: prompt = "prompt".asInstanceOf[prompt]
  
  @js.native
  sealed trait raw extends StObject
  inline def raw: raw = "raw".asInstanceOf[raw]
  
  @js.native
  sealed trait unknown
    extends StObject
       with ICellTargetArea
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait wordWrapColumn extends StObject
  inline def wordWrapColumn: wordWrapColumn = "wordWrapColumn".asInstanceOf[wordWrapColumn]
}
