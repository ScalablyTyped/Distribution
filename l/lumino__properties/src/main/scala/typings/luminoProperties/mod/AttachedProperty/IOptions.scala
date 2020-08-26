package typings.luminoProperties.mod.AttachedProperty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options object used to initialize an attached property.
  */
@js.native
trait IOptions[T, U] extends js.Object {
  /**
    * A function called when the property value has changed.
    *
    * #### Notes
    * This will be invoked when the property value is changed and the
    * comparator indicates that the old value is not equal to the new
    * value.
    *
    * This will **not** be called for the initial default value.
    */
  var changed: js.UndefOr[js.Function3[/* owner */ T, /* oldValue */ U, /* newValue */ U, Unit]] = js.native
  /**
    * A function used to coerce a supplied value into the final value.
    *
    * #### Notes
    * This will be called whenever the property value is changed, or
    * when the property is explicitly coerced. The return value will
    * be used as the final value of the property.
    *
    * This will **not** be called for the initial default value.
    */
  var coerce: js.UndefOr[js.Function2[/* owner */ T, /* value */ U, U]] = js.native
  /**
    * A function used to compare two values for equality.
    *
    * #### Notes
    * This is called to determine if the property value has changed.
    * It should return `true` if the given values are equivalent, or
    * `false` if they are different.
    *
    * If this is not provided, it defaults to the `===` operator.
    */
  var compare: js.UndefOr[js.Function2[/* oldValue */ U, /* newValue */ U, Boolean]] = js.native
  /**
    * The human readable name for the property.
    *
    * #### Notes
    * By convention, this should be the same as the name used to define
    * the public accessor for the property value.
    *
    * This **does not** have an effect on the property lookup behavior.
    * Multiple properties may share the same name without conflict.
    */
  var name: String = js.native
  /**
    * A factory function used to create the default property value.
    *
    * #### Notes
    * This will be called whenever the property value is required,
    * but has not yet been set for a given owner.
    */
  def create(owner: T): U = js.native
}

object IOptions {
  @scala.inline
  def apply[T, U](create: T => U, name: String): IOptions[T, U] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T, U]]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions[_, _], T, U] (val x: Self with (IOptions[T, U])) extends AnyVal {
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
    def setCreate(value: T => U): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setChanged(value: (/* owner */ T, /* oldValue */ U, /* newValue */ U) => Unit): Self = this.set("changed", js.Any.fromFunction3(value))
    @scala.inline
    def deleteChanged: Self = this.set("changed", js.undefined)
    @scala.inline
    def setCoerce(value: (/* owner */ T, /* value */ U) => U): Self = this.set("coerce", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCoerce: Self = this.set("coerce", js.undefined)
    @scala.inline
    def setCompare(value: (/* oldValue */ U, /* newValue */ U) => Boolean): Self = this.set("compare", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCompare: Self = this.set("compare", js.undefined)
  }
  
}

