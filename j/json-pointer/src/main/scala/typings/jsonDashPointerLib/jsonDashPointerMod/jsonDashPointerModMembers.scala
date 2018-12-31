package typings
package jsonDashPointerLib.jsonDashPointerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-pointer", JSImport.Namespace)
@js.native
object jsonDashPointerModMembers extends js.Object {
  def apply(`object`: js.Object): jsonDashPointerLib.jsonDashPointerMod.JSONUnderscorePointerNs.JSON_PointerWrap = js.native
  /**
    *  Builds a json pointer from an array of reference tokens.
    */
  def compile(str: js.Array[java.lang.String]): java.lang.String = js.native
  /**
    *  Creates a dictionary object (pointer -> value).
    */
  def dict(`object`: js.Object): js.Object = js.native
  /**
    *  Escapes a reference token.
    */
  def escape(str: java.lang.String): java.lang.String = js.native
  /**
    *  Wrap an object with accessors
    */
  /**
    *  Looks up a JSON pointer in an object.
    */
  def get(`object`: js.Object, pointer: java.lang.String): js.Any = js.native
  /**
    *  Tests if an object has a value for a JSON pointer.
    */
  def has(`object`: js.Object, pointer: java.lang.String): scala.Boolean = js.native
  /**
    *  Converts a JSON pointer into an array of reference tokens.
    */
  def parse(str: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    *  Removes an attribute of object referenced by pointer
    */
  def remove(`object`: js.Object, pointer: java.lang.String): scala.Unit = js.native
  /**
    *  Set a value for a JSON pointer on object.
    */
  def set(`object`: js.Object, pointer: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
    *  Unescape a reference token.
    */
  def unescape(str: java.lang.String): java.lang.String = js.native
  /**
    *  Just like: each(pointer.dict(obj), iterator);
    */
  def walk(
    `object`: js.Object,
    iterator: js.Function2[/* value */ js.Any, /* key */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

