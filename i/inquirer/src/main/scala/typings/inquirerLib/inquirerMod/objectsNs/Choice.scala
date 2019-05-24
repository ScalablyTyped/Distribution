package typings
package inquirerLib.inquirerMod.objectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Choice object
  * Normalize input as choice object
  * @constructor
  * @param {String|Object} val  Choice value. If an object is passed, it should contains
  *                             at least one of `value` or `name` property
  */
@js.native
trait Choice[A]
  extends org.scalablytyped.runtime.Instantiable1[
      (/* option */ ChoiceOption[A]) | (/* separator */ Separator) | (/* str */ java.lang.String), 
      Choice[A]
    ]

