package typings.koaSession.mod

import org.scalablytyped.runtime.StringDictionary
import typings.koaSession.koaSessionStrings.session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Session model.
  */
@js.native
trait Session
  extends /**
  * allow to put any value on session object
  */
/* _ */ StringDictionary[js.Any] {
  /**
    * Return how many values there are in the session object.
    * Used to see if it"s "populated".
    */
  val length: Double = js.native
  /**
    * get/set session maxAge
    */
  var maxAge: js.UndefOr[Double | session] = js.native
  /**
    * populated flag, which is just a boolean alias of .length.
    */
  val populated: Boolean = js.native
  /**
    * alias to `toJSON`
    */
  def inspect(): js.Object = js.native
  /**
    * save this session no matter whether it is populated
    */
  def save(): Unit = js.native
  /**
    * JSON representation of the session.
    */
  def toJSON(): js.Object = js.native
}

object Session {
  @scala.inline
  def apply(
    inspect: () => js.Object,
    length: Double,
    populated: Boolean,
    save: () => Unit,
    toJSON: () => js.Object
  ): Session = {
    val __obj = js.Dynamic.literal(inspect = js.Any.fromFunction0(inspect), length = length.asInstanceOf[js.Any], populated = populated.asInstanceOf[js.Any], save = js.Any.fromFunction0(save), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Session]
  }
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
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
    def setInspect(value: () => js.Object): Self = this.set("inspect", js.Any.fromFunction0(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopulated(value: Boolean): Self = this.set("populated", value.asInstanceOf[js.Any])
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("save", js.Any.fromFunction0(value))
    @scala.inline
    def setToJSON(value: () => js.Object): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setMaxAge(value: Double | session): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
  }
  
}

