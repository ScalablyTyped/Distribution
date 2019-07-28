package typings.inquirer.inquirerMod.objectsNs

import org.scalablytyped.runtime.Instantiable1
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
trait Choice[A] extends Instantiable1[
      (/* option */ ChoiceOption[A]) | (/* separator */ Separator) | (/* str */ String), 
      Choice[A]
    ]

