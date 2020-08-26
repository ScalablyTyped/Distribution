package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Kubernetes taint is comprised of three fields: key, value, and effect.
  * Effect can only be one of three types:  NoSchedule, PreferNoSchedule or
  * NoExecute.  For more information, including usage and the valid values,
  * see:
  * https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/
  */
@js.native
trait SchemaNodeTaint extends js.Object {
  /**
    * Effect for taint.
    */
  var effect: js.UndefOr[String] = js.native
  /**
    * Key for taint.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Value for taint.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaNodeTaint {
  @scala.inline
  def apply(): SchemaNodeTaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeTaint]
  }
  @scala.inline
  implicit class SchemaNodeTaintOps[Self <: SchemaNodeTaint] (val x: Self) extends AnyVal {
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
    def setEffect(value: String): Self = this.set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

