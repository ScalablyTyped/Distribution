package typings
package jpmLib.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BaseRequest extends js.Object {
  var content: java.lang.String
  var contentType: java.lang.String
  var headers: js.Object
  var url: java.lang.String | jpmLib.FFAddonSDKNs.SDKURL
  def delete(): scala.Unit
  def get(): scala.Unit
  def head(): scala.Unit
  def post(): scala.Unit
  def put(): scala.Unit
}

