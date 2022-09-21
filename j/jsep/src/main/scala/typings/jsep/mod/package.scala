package typings.jsep.mod

import typings.jsep.anon.Node
import typings.jsep.mod.^
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(`val`: String): Expression = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Expression]
inline def apply(`val`: Expression): Expression = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Expression]

inline def addBinaryOp(operatorName: String, precedence: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBinaryOp")(operatorName.asInstanceOf[js.Any], precedence.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addBinaryOp(operatorName: String, precedence: Double, rightToLeft: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBinaryOp")(operatorName.asInstanceOf[js.Any], precedence.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addIdentifierChar(identifierName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addIdentifierChar")(identifierName.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def addUnaryOp(operatorName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addUnaryOp")(operatorName.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def additionalIdentifierChars: Set[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("additional_identifier_chars").asInstanceOf[Set[String]]
inline def additionalIdentifierChars_=(x: Set[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("additional_identifier_chars")(x.asInstanceOf[js.Any])

inline def hooks: IHooks = ^.asInstanceOf[js.Dynamic].selectDynamic("hooks").asInstanceOf[IHooks]
inline def hooks_=(x: IHooks): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hooks")(x.asInstanceOf[js.Any])

inline def plugins: IPlugins = ^.asInstanceOf[js.Dynamic].selectDynamic("plugins").asInstanceOf[IPlugins]
inline def plugins_=(x: IPlugins): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugins")(x.asInstanceOf[js.Any])

inline def removeBinaryOp(operatorName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBinaryOp")(operatorName.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def removeIdentifierChar(identifierName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeIdentifierChar")(identifierName.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def removeUnaryOp(operatorName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeUnaryOp")(operatorName.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def rightAssociative: Set[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("right_associative").asInstanceOf[Set[String]]
inline def rightAssociative_=(x: Set[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right_associative")(x.asInstanceOf[js.Any])

inline def thisStr: String = ^.asInstanceOf[js.Dynamic].selectDynamic("this_str").asInstanceOf[String]
inline def thisStr_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("this_str")(x.asInstanceOf[js.Any])

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type HookCallback = js.ThisFunction1[/* this */ HookScope, /* env */ Node, Unit]

type PossibleExpression = js.UndefOr[Expression]

type baseTypes = js.UndefOr[String | Double | Boolean | js.RegExp | Null | js.Object]
