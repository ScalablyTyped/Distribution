package typings.jupyterlabApplication.shellMod.ILabShell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A description of the application's user interface layout.
  */
@js.native
trait ILayout extends js.Object {
  
  /**
    * Indicates whether fetched session restore data was actually retrieved
    * from the state database or whether it is a fresh blank slate.
    *
    * #### Notes
    * This attribute is only relevant when the layout data is retrieved via a
    * `fetch` call. If it is set when being passed into `save`, it will be
    * ignored.
    */
  val fresh: js.UndefOr[Boolean] = js.native
  
  /**
    * The left area of the user interface.
    */
  val leftArea: ISideArea | Null = js.native
  
  /**
    * The main area of the user interface.
    */
  val mainArea: IMainArea | Null = js.native
  
  /**
    * The right area of the user interface.
    */
  val rightArea: ISideArea | Null = js.native
}
object ILayout {
  
  @scala.inline
  def apply(): ILayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILayout]
  }
  
  @scala.inline
  implicit class ILayoutOps[Self <: ILayout] (val x: Self) extends AnyVal {
    
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
    def setFresh(value: Boolean): Self = this.set("fresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFresh: Self = this.set("fresh", js.undefined)
    
    @scala.inline
    def setLeftArea(value: ISideArea): Self = this.set("leftArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftAreaNull: Self = this.set("leftArea", null)
    
    @scala.inline
    def setMainArea(value: IMainArea): Self = this.set("mainArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainAreaNull: Self = this.set("mainArea", null)
    
    @scala.inline
    def setRightArea(value: ISideArea): Self = this.set("rightArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightAreaNull: Self = this.set("rightArea", null)
  }
}
