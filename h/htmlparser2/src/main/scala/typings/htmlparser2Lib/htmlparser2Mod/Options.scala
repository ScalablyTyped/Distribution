package typings
package htmlparser2Lib.htmlparser2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /***
    * If set to true, entities within the document will be decoded. Defaults to false.
    */
  var decodeEntities: js.UndefOr[scala.Boolean] = js.undefined
  /***
    * If set to true, all attribute names will be lowercased. This has noticeable impact on speed, so it defaults to false.
    */
  var lowerCaseAttributeNames: js.UndefOr[scala.Boolean] = js.undefined
  /***
    * If set to true, all tags will be lowercased. If xmlMode is disabled, this defaults to true.
    */
  var lowerCaseTags: js.UndefOr[scala.Boolean] = js.undefined
  /***
    * If set to true, CDATA sections will be recognized as text even if the xmlMode option is not enabled.
    * NOTE: If xmlMode is set to true then CDATA sections will always be recognized as text.
    */
  var recognizeCDATA: js.UndefOr[scala.Boolean] = js.undefined
  /***
    * If set to true, self-closing tags will trigger the onclosetag event even if xmlMode is not set to true.
    * NOTE: If xmlMode is set to true then self-closing tags will always be recognized.
    */
  var recognizeSelfClosing: js.UndefOr[scala.Boolean] = js.undefined
  /***
    * Indicates whether special tags (<script> and <style>) should get special treatment
    * and if "empty" tags (eg. <br>) can have children.  If false, the content of special tags
    * will be text only. For feeds and other XML content (documents that don't consist of HTML),
    * set this to true. Default: false.
    */
  var xmlMode: js.UndefOr[scala.Boolean] = js.undefined
}

