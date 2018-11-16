package typings
package jsonDashPointerLib.jsonDashPointerMod.JSONUnderscorePointerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JSON_PointerWrap extends js.Object {
  /**
           *  Creates a dictionary object (pointer -> value).
           */
  def dict(): js.Object
  /**
           *  Looks up a JSON pointer in an object.
           */
  def get(pointer: java.lang.String): js.Any
  /**
           *  Tests if an object has a value for a JSON pointer.
           */
  def has(pointer: java.lang.String): scala.Boolean
  /**
           *  Removes an attribute of object referenced by pointer
           */
  def remove(pointer: java.lang.String): scala.Unit
  /**
           *  Set a value for a JSON pointer on object.
           */
  def set(pointer: java.lang.String, value: js.Any): scala.Unit
  /**
           *  Just like: each(pointer.dict(obj), iterator);
           */
  def walk(iterator: js.Function2[/* value */ js.Any, /* key */ java.lang.String, scala.Unit]): scala.Unit
}

