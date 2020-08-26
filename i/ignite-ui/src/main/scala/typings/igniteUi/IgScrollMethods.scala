package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgScrollMethods extends js.Object {
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit = js.native
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit = js.native
  /**
    * This method overrides the base method and does nothing, because the scoll container shouldn't change the container locales
    * Note that this method is for rare scenarios, use [language](ui.igupload#options:language) or [locale](ui.igupload#options:locale) option setter
    */
  def changeLocale(): Unit = js.native
  def destroy(): Unit = js.native
  def option(optionName: js.Object, value: js.Object): Unit = js.native
  def refresh(): Unit = js.native
}

object IgScrollMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: () => Unit,
    destroy: () => Unit,
    option: (js.Object, js.Object) => Unit,
    refresh: () => Unit
  ): IgScrollMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction0(changeLocale), destroy = js.Any.fromFunction0(destroy), option = js.Any.fromFunction2(option), refresh = js.Any.fromFunction0(refresh))
    __obj.asInstanceOf[IgScrollMethods]
  }
  @scala.inline
  implicit class IgScrollMethodsOps[Self <: IgScrollMethods] (val x: Self) extends AnyVal {
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
    def setChangeGlobalLanguage(value: () => Unit): Self = this.set("changeGlobalLanguage", js.Any.fromFunction0(value))
    @scala.inline
    def setChangeGlobalRegional(value: () => Unit): Self = this.set("changeGlobalRegional", js.Any.fromFunction0(value))
    @scala.inline
    def setChangeLocale(value: () => Unit): Self = this.set("changeLocale", js.Any.fromFunction0(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setOption(value: (js.Object, js.Object) => Unit): Self = this.set("option", js.Any.fromFunction2(value))
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("refresh", js.Any.fromFunction0(value))
  }
  
}

