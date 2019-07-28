package typings.atJupyterlabCells.libModelMod

import typings.atJupyterlabCells.libModelMod.CodeCellModelNs.ContentFactory
import typings.atJupyterlabCells.libModelMod.CodeCellModelNs.IContentFactory
import typings.atJupyterlabOutputarea.libModelMod.IOutputAreaModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/model", "CodeCellModel")
@js.native
object CodeCellModelNs extends js.Object {
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory () extends IContentFactory {
    /**
      * Create an output area.
      */
    /* CompleteClass */
    override def createOutputArea(options: typings.atJupyterlabOutputarea.libModelMod.IOutputAreaModelNs.IOptions): IOutputAreaModel = js.native
  }
  
  /**
    * A factory for creating code cell model content.
    */
  trait IContentFactory extends js.Object {
    /**
      * Create an output area.
      */
    def createOutputArea(options: typings.atJupyterlabOutputarea.libModelMod.IOutputAreaModelNs.IOptions): IOutputAreaModel
  }
  
  /**
    * The options used to initialize a `CodeCellModel`.
    */
  trait IOptions
    extends typings.atJupyterlabCells.libModelMod.CellModelNs.IOptions {
    /**
      * The factory for output area model creation.
      */
    var contentFactory: js.UndefOr[IContentFactory] = js.undefined
  }
  
  /**
    * The shared `ContentFactory` instance.
    */
  val defaultContentFactory: ContentFactory = js.native
}

