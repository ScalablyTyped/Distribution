package typings
package greasemonkeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  var description: java.lang.String
  var excludes: js.Array[java.lang.String]
  var includes: js.Array[java.lang.String]
  var matches: js.Array[java.lang.String]
  var name: java.lang.String
  var namespace: java.lang.String
  var resources: js.Object
  var `run-at`: java.lang.String
  var unwrap: scala.Boolean
  var version: java.lang.String
}

object Anon_Description {
  @scala.inline
  def apply(
    description: java.lang.String,
    excludes: js.Array[java.lang.String],
    includes: js.Array[java.lang.String],
    matches: js.Array[java.lang.String],
    name: java.lang.String,
    namespace: java.lang.String,
    resources: js.Object,
    `run-at`: java.lang.String,
    unwrap: scala.Boolean,
    version: java.lang.String
  ): Anon_Description = {
    val __obj = js.Dynamic.literal(`run-at` = `run-at`)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("excludes")(excludes)
    __obj.updateDynamic("includes")(includes)
    __obj.updateDynamic("matches")(matches)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("resources")(resources)
    __obj.updateDynamic("unwrap")(unwrap)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Description]
  }
}

