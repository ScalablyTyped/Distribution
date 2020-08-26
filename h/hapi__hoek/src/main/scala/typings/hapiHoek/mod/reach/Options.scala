package typings.hapiHoek.mod.reach

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Value to return if the path or value is not present. No default value.
    *
    * @default false
    */
  val default: js.UndefOr[js.Any] = js.native
  /**
    * If true, allows traversing functions for properties. false will throw an error if a function is part of the chain.
    *
    * @default true
    */
  val functions: js.UndefOr[Boolean] = js.native
  /**
    * If true, allows traversing Set and Map objects for properties. false will return undefined regardless of the Set or Map passed.
    *
    * @default false
    */
  val iterables: js.UndefOr[Boolean] = js.native
  /**
    * String to split chain path on. Defaults to '.'.
    *
    * @default false
    */
  val separator: js.UndefOr[String] = js.native
  /**
    * If true, will throw an error on missing member in the chain. Default to false.
    *
    * @default false
    */
  val strict: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setFunctions(value: Boolean): Self = this.set("functions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctions: Self = this.set("functions", js.undefined)
    @scala.inline
    def setIterables(value: Boolean): Self = this.set("iterables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIterables: Self = this.set("iterables", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
  
}

