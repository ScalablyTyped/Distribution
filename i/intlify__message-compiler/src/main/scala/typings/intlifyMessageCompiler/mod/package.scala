package typings.intlifyMessageCompiler.mod

import typings.intlifyMessageCompiler.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ERROR_DOMAIN: /* "parser" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERROR_DOMAIN").asInstanceOf[/* "parser" */ String]

inline def LocationStub: SourceLocation = ^.asInstanceOf[js.Dynamic].selectDynamic("LocationStub").asInstanceOf[SourceLocation]

inline def baseCompile(source: String): CodeGenResult = ^.asInstanceOf[js.Dynamic].applyDynamic("baseCompile")(source.asInstanceOf[js.Any]).asInstanceOf[CodeGenResult]
inline def baseCompile(source: String, options: CompileOptions): CodeGenResult = (^.asInstanceOf[js.Dynamic].applyDynamic("baseCompile")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CodeGenResult]

inline def createCompileError[T /* <: Double */](code: T): CompileError = ^.asInstanceOf[js.Dynamic].applyDynamic("createCompileError")(code.asInstanceOf[js.Any]).asInstanceOf[CompileError]
inline def createCompileError[T /* <: Double */](code: T, loc: Null, options: CreateCompileErrorOptions): CompileError = (^.asInstanceOf[js.Dynamic].applyDynamic("createCompileError")(code.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompileError]
inline def createCompileError[T /* <: Double */](code: T, loc: SourceLocation): CompileError = (^.asInstanceOf[js.Dynamic].applyDynamic("createCompileError")(code.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[CompileError]
inline def createCompileError[T /* <: Double */](code: T, loc: SourceLocation, options: CreateCompileErrorOptions): CompileError = (^.asInstanceOf[js.Dynamic].applyDynamic("createCompileError")(code.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompileError]

inline def createLocation(start: Position, end: Position): SourceLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[SourceLocation]
inline def createLocation(start: Position, end: Position, source: String): SourceLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[SourceLocation]

inline def createParser(): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("createParser")().asInstanceOf[Parser]
inline def createParser(options: ParserOptions): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("createParser")(options.asInstanceOf[js.Any]).asInstanceOf[Parser]

inline def createPosition(line: Double, column: Double, offset: Double): Position = (^.asInstanceOf[js.Dynamic].applyDynamic("createPosition")(line.asInstanceOf[js.Any], column.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Position]

type CompileCacheKeyHandler = js.Function1[/* source */ String, String]

type CompileErrorHandler = js.Function1[/* error */ CompileError, Unit]

type Identifier = String
