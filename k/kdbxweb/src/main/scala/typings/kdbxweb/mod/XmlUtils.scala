package typings.kdbxweb.mod

import typings.kdbxweb.kdbxBinariesMod.KdbxBinaryOrRef
import typings.kdbxweb.xmlUtilsMod.global.Node
import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object XmlUtils {
  
  @JSImport("kdbxweb", "XmlUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addChildNode(node: Node, tagName: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("addChildNode")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def create(rootNode: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rootNode.asInstanceOf[js.Any]).asInstanceOf[Document]
  
  inline def getBoolean(node: Node): js.UndefOr[Boolean | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoolean")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean | Null]]
  
  inline def getBytes(node: Node): js.UndefOr[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBytes")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.typedarray.ArrayBuffer]]
  
  inline def getChildNode(node: Null, tagName: String): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildNode")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def getChildNode(node: Null, tagName: String, errorMsgIfAbsent: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildNode")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], errorMsgIfAbsent.asInstanceOf[js.Any])).asInstanceOf[Node]
  inline def getChildNode(node: Node, tagName: String): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildNode")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def getChildNode(node: Node, tagName: String, errorMsgIfAbsent: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildNode")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], errorMsgIfAbsent.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def getDate(node: Node): js.UndefOr[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDate")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Date]]
  
  inline def getNumber(node: Node): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumber")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def getProtectedBinary(node: Node): js.UndefOr[KdbxBinaryOrRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProtectedBinary")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[KdbxBinaryOrRef]]
  
  inline def getProtectedText(node: Node): js.UndefOr[typings.kdbxweb.protectedValueMod.ProtectedValue | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProtectedText")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.kdbxweb.protectedValueMod.ProtectedValue | String]]
  
  inline def getTags(node: Node): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTags")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getText(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")().asInstanceOf[js.UndefOr[String]]
  inline def getText(node: Node): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getUuid(node: Node): js.UndefOr[typings.kdbxweb.kdbxUuidMod.KdbxUuid] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUuid")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.kdbxweb.kdbxUuidMod.KdbxUuid]]
  
  inline def parse(xml: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xml.asInstanceOf[js.Any]).asInstanceOf[Document]
  
  inline def protectPlainValues(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("protectPlainValues")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def protectUnprotectedValues(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("protectUnprotectedValues")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def serialize(doc: Document): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(doc.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize(doc: Document, prettyPrint: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(doc.asInstanceOf[js.Any], prettyPrint.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def setBoolean(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBoolean")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setBoolean(node: Node, boolean: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBoolean")(node.asInstanceOf[js.Any], boolean.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setBytes(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBytes")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setBytes(node: Node, bytes: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBytes")(node.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setBytes(node: Node, bytes: js.typedarray.ArrayBuffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBytes")(node.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setBytes(node: Node, bytes: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBytes")(node.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDate(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDate")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setDate(node: Node, date: js.Date): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDate")(node.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setDate(node: Node, date: js.Date, binary: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDate")(node.asInstanceOf[js.Any], date.asInstanceOf[js.Any], binary.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setDate(node: Node, date: Unit, binary: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDate")(node.asInstanceOf[js.Any], date.asInstanceOf[js.Any], binary.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setNumber(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNumber")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setNumber(node: Node, number: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setNumber")(node.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setProtectedBinary(node: Node, binary: KdbxBinaryOrRef): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setProtectedBinary")(node.asInstanceOf[js.Any], binary.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setProtectedText(node: Node, text: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setProtectedText")(node.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setProtectedText(node: Node, text: typings.kdbxweb.protectedValueMod.ProtectedValue): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setProtectedText")(node.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setProtectedValues(node: Node, protectSaltGenerator: typings.kdbxweb.protectSaltGeneratorMod.ProtectSaltGenerator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setProtectedValues")(node.asInstanceOf[js.Any], protectSaltGenerator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setTags(node: Node, tags: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTags")(node.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setText(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setText")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setText(node: Node, text: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setText")(node.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setUuid(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUuid")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setUuid(node: Node, uuid: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUuid")(node.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setUuid(node: Node, uuid: js.typedarray.ArrayBuffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUuid")(node.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setUuid(node: Node, uuid: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUuid")(node.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setUuid(node: Node, uuid: typings.kdbxweb.kdbxUuidMod.KdbxUuid): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUuid")(node.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def strToBoolean(): js.UndefOr[Boolean | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("strToBoolean")().asInstanceOf[js.UndefOr[Boolean | Null]]
  inline def strToBoolean(str: String): js.UndefOr[Boolean | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("strToBoolean")(str.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean | Null]]
  
  inline def traverse(node: Node, callback: js.Function1[/* node */ Element, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unprotectValues(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unprotectValues")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def updateProtectedValuesSalt(node: Node, protectSaltGenerator: typings.kdbxweb.protectSaltGeneratorMod.ProtectSaltGenerator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateProtectedValuesSalt")(node.asInstanceOf[js.Any], protectSaltGenerator.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
