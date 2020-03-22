package typings.jsData

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data/dist/Settable", JSImport.Namespace)
@js.native
object settableMod extends js.Object {
  @js.native
  trait Settable
    extends /* customAttr */ StringDictionary[js.Any] {
    /**
      * Get a private property of this instance.
      *
      * __Don't use the method unless you know what you're doing.__
      *
      * @method Settable#_get
      * @param {string} key The property to retrieve.
      * @returns {*} The value of the property.
      * @since 3.0.0
      */
    /* protected */ def _get(key: String): js.Any = js.native
    /**
      * Set a private property of this instance.
      *
      * __Don't use the method unless you know what you're doing.__
      *
      * @method __Don't use the method unless you know what you're doing.__#_set
      * @param {(string|Object)} key The key or path to the property. Can also
      * pass in an object of key/value pairs, which will all be set on the instance.
      * @param {*} [value] The value to set.
      * @since 3.0.0
      */
    /* protected */ def _set(key: js.Any): js.Any = js.native
    /* protected */ def _set(key: js.Any, value: js.Any): js.Any = js.native
    /**
      * Unset a private property of this instance.
      *
      * __Don't use the method unless you know what you're doing.__
      *
      * @method __Don't use the method unless you know what you're doing.__#_unset
      * @param {string} key The property to unset.
      * @since 3.0.0
      */
    /* protected */ def _unset(key: js.Any): js.Any = js.native
  }
  
  @js.native
  class default () extends Settable
  
}

