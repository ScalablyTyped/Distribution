package typings
package koaDashSessionLib.koaDashSessionMod.sessionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Session model.
     */

trait Session
  extends /**
         * allow to put any value on session object
         */
/* _ */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
           * Return how many values there are in the session object.
           * Used to see if it"s "populated".
           */
  val length: scala.Double
  /**
           * get/set session maxAge
           */
  var maxAge: js.UndefOr[scala.Double | koaDashSessionLib.koaDashSessionLibStrings.session]
  /**
           * populated flag, which is just a boolean alias of .length.
           */
  val populated: scala.Boolean
  /**
           * alias to `toJSON`
           */
  def inspect(): js.Object
  /**
           * save this session no matter whether it is populated
           */
  def save(): scala.Unit
  /**
           * JSON representation of the session.
           */
  def toJSON(): js.Object
}

