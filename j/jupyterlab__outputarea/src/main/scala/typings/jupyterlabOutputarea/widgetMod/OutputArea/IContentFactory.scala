package typings.jupyterlabOutputarea.widgetMod.OutputArea

import typings.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typings.jupyterlabOutputarea.widgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An output area widget content factory.
  *
  * The content factory is used to create children in a way
  * that can be customized.
  */
@js.native
trait IContentFactory extends js.Object {
  
  /**
    * Create an output prompt.
    */
  def createOutputPrompt(): IOutputPrompt = js.native
  
  /**
    * Create an stdin widget.
    */
  def createStdin(options: typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions): IStdin = js.native
}
object IContentFactory {
  
  @scala.inline
  def apply(
    createOutputPrompt: () => IOutputPrompt,
    createStdin: typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions => IStdin
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createOutputPrompt = js.Any.fromFunction0(createOutputPrompt), createStdin = js.Any.fromFunction1(createStdin))
    __obj.asInstanceOf[IContentFactory]
  }
  
  @scala.inline
  implicit class IContentFactoryOps[Self <: IContentFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateOutputPrompt(value: () => IOutputPrompt): Self = this.set("createOutputPrompt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateStdin(value: typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions => IStdin): Self = this.set("createStdin", js.Any.fromFunction1(value))
  }
}
