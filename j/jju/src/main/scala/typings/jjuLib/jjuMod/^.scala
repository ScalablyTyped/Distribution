package typings
package jjuLib.jjuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jju", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def analyze(text: java.lang.String): jjuLib.jjuMod.JsonStyle = js.native
  def analyze(text: java.lang.String, options: jjuLib.jjuMod.ParseOptions): jjuLib.jjuMod.JsonStyle = js.native
  def parse(text: java.lang.String): js.Any = js.native
  def parse(text: java.lang.String, options: jjuLib.jjuMod.ParseOptions): js.Any = js.native
  def parse(text: java.lang.String, reviver: js.Function2[/* key */ js.Any, /* value */ js.Any, _]): js.Any = js.native
  def stringify(value: js.Any): java.lang.String = js.native
  def stringify(value: js.Any, options: jjuLib.jjuMod.StringifyOptions): java.lang.String = js.native
  def stringify(value: js.Any, replacer: js.Array[scala.Double | java.lang.String]): java.lang.String = js.native
  def stringify(value: js.Any, replacer: js.Array[scala.Double | java.lang.String], space: java.lang.String): java.lang.String = js.native
  def stringify(value: js.Any, replacer: js.Array[scala.Double | java.lang.String], space: scala.Double): java.lang.String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]): java.lang.String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _],
    space: java.lang.String
  ): java.lang.String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _],
    space: scala.Double
  ): java.lang.String = js.native
  def stringify(value: js.Any, replacer: scala.Null, space: java.lang.String): java.lang.String = js.native
  def stringify(value: js.Any, replacer: scala.Null, space: scala.Double): java.lang.String = js.native
  def tokenize(text: java.lang.String): js.Array[jjuLib.jjuMod.Token] = js.native
  def tokenize(text: java.lang.String, options: jjuLib.jjuMod.ParseOptions): js.Array[jjuLib.jjuMod.Token] = js.native
  def update(text: java.lang.String, new_value: js.Any): java.lang.String = js.native
  def update(
    text: java.lang.String,
    new_value: js.Any,
    options: jjuLib.jjuMod.ParseOptions with jjuLib.jjuMod.StringifyOptions
  ): java.lang.String = js.native
}

