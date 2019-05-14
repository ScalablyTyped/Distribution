package typings
package gulpDashTypescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_08 extends js.Object {
  var OperationCanceledException: org.scalablytyped.runtime.Instantiable0[typescriptLib.typescriptMod.OperationCanceledException] = js.native
  val ScriptSnapshotNs: Anon_FromString = js.native
  var disableIncrementalParsing: scala.Boolean = js.native
  val serverNs: js.Any = js.native
  /** The version of the language service API */
  val servicesVersion: gulpDashTypescriptLib.gulpDashTypescriptLibStrings.`0DOT8` = js.native
  var sys: typescriptLib.typescriptMod.System = js.native
  var unchangedTextChangeRange: typescriptLib.typescriptMod.TextChangeRange = js.native
  /** The version of the TypeScript compiler release */
  val version: java.lang.String = js.native
  val versionMajorMinor: gulpDashTypescriptLib.gulpDashTypescriptLibStrings.`3DOT4` = js.native
  /**
    * Adds an EmitHelper to a node.
    */
  def addEmitHelper[T /* <: typescriptLib.typescriptMod.Node */](node: T, helper: typescriptLib.typescriptMod.EmitHelper): T = js.native
  def addEmitHelpers[T /* <: typescriptLib.typescriptMod.Node */](node: T): T = js.native
  /**
    * Add EmitHelpers to a node.
    */
  def addEmitHelpers[T /* <: typescriptLib.typescriptMod.Node */](node: T, helpers: js.Array[typescriptLib.typescriptMod.EmitHelper]): T = js.native
  def addSyntheticLeadingComment[T /* <: typescriptLib.typescriptMod.Node */](node: T, kind: typescriptLib.typescriptMod.SyntaxKind, text: java.lang.String): T = js.native
  def addSyntheticLeadingComment[T /* <: typescriptLib.typescriptMod.Node */](
    node: T,
    kind: typescriptLib.typescriptMod.SyntaxKind,
    text: java.lang.String,
    hasTrailingNewLine: scala.Boolean
  ): T = js.native
  def addSyntheticTrailingComment[T /* <: typescriptLib.typescriptMod.Node */](node: T, kind: typescriptLib.typescriptMod.SyntaxKind, text: java.lang.String): T = js.native
  def addSyntheticTrailingComment[T /* <: typescriptLib.typescriptMod.Node */](
    node: T,
    kind: typescriptLib.typescriptMod.SyntaxKind,
    text: java.lang.String,
    hasTrailingNewLine: scala.Boolean
  ): T = js.native
  def classicNameResolver(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.ModuleResolutionHost
  ): typescriptLib.typescriptMod.ResolvedModuleWithFailedLookupLocations = js.native
  def classicNameResolver(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.ModuleResolutionHost,
    cache: typescriptLib.typescriptMod.NonRelativeModuleNameResolutionCache
  ): typescriptLib.typescriptMod.ResolvedModuleWithFailedLookupLocations = js.native
  def classicNameResolver(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.ModuleResolutionHost,
    cache: typescriptLib.typescriptMod.NonRelativeModuleNameResolutionCache,
    redirectedReference: typescriptLib.typescriptMod.ResolvedProjectReference
  ): typescriptLib.typescriptMod.ResolvedModuleWithFailedLookupLocations = js.native
  /**
    * Called to merge all the changes that occurred across several versions of a script snapshot
    * into a single change.  i.e. if a user keeps making successive edits to a script we will
    * have a text change from V1 to V2, V2 to V3, ..., Vn.
    *
    * This function will then merge those changes into a single change range valid between V1 and
    * Vn.
    */
  def collapseTextChangeRangesAcrossMultipleVersions(changes: js.Array[typescriptLib.typescriptMod.TextChangeRange]): typescriptLib.typescriptMod.TextChangeRange = js.native
  def convertCompilerOptionsFromJson(jsonOptions: js.Any, basePath: java.lang.String): typescriptLib.Anon_Errors = js.native
  def convertCompilerOptionsFromJson(jsonOptions: js.Any, basePath: java.lang.String, configFileName: java.lang.String): typescriptLib.Anon_Errors = js.native
  /**
    * Convert the json syntax tree into the json value
    */
  def convertToObject(
    sourceFile: typescriptLib.typescriptMod.JsonSourceFile,
    errors: typescriptLib.typescriptMod.Push[typescriptLib.typescriptMod.Diagnostic]
  ): js.Any = js.native
  def convertTypeAcquisitionFromJson(jsonOptions: js.Any, basePath: java.lang.String): typescriptLib.Anon_ErrorsOptions = js.native
  def convertTypeAcquisitionFromJson(jsonOptions: js.Any, basePath: java.lang.String, configFileName: java.lang.String): typescriptLib.Anon_ErrorsOptions = js.native
  def couldStartTrivia(text: java.lang.String, pos: scala.Double): scala.Boolean = js.native
  def createAbstractBuilder(): typescriptLib.typescriptMod.BuilderProgram = js.native
  /**
    * Creates a builder thats just abstraction over program and can be used with watch
    */
  def createAbstractBuilder(
    newProgram: typescriptLib.typescriptMod.Program,
    host: typescriptLib.typescriptMod.BuilderProgramHost
  ): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAbstractBuilder(
    newProgram: typescriptLib.typescriptMod.Program,
    host: typescriptLib.typescriptMod.BuilderProgramHost,
    oldProgram: typescriptLib.typescriptMod.BuilderProgram
  ): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAbstractBuilder(
    newProgram: typescriptLib.typescriptMod.Program,
    host: typescriptLib.typescriptMod.BuilderProgramHost,
    oldProgram: typescriptLib.typescriptMod.BuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic]
  ): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAbstractBuilder(rootNames: js.Array[java.lang.String]): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost
  ): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.BuilderProgram
  ): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.BuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic]
  ): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.BuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.ProjectReference]
  ): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAbstractBuilder(rootNames: js.Array[java.lang.String], options: typescriptLib.typescriptMod.CompilerOptions): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost
  ): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.BuilderProgram
  ): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.BuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic]
  ): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.BuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.ProjectReference]
  ): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost
  ): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.BuilderProgram
  ): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.BuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic]
  ): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.BuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.ProjectReference]
  ): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAbstractBuilder(rootNames: js.UndefOr[scala.Nothing], options: typescriptLib.typescriptMod.CompilerOptions): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost
  ): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.BuilderProgram
  ): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.BuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic]
  ): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.BuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.ProjectReference]
  ): typescriptLib.typescriptMod.BuilderProgram = js.native
  def createAdd(left: typescriptLib.typescriptMod.Expression, right: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.BinaryExpression = js.native
  def createArrayBindingPattern(elements: js.Array[typescriptLib.typescriptMod.ArrayBindingElement]): typescriptLib.typescriptMod.ArrayBindingPattern = js.native
  def createArrayLiteral(): typescriptLib.typescriptMod.ArrayLiteralExpression = js.native
  def createArrayLiteral(elements: js.Array[typescriptLib.typescriptMod.Expression]): typescriptLib.typescriptMod.ArrayLiteralExpression = js.native
  def createArrayLiteral(elements: js.Array[typescriptLib.typescriptMod.Expression], multiLine: scala.Boolean): typescriptLib.typescriptMod.ArrayLiteralExpression = js.native
  def createArrayTypeNode(elementType: typescriptLib.typescriptMod.TypeNode): typescriptLib.typescriptMod.ArrayTypeNode = js.native
  def createArrowFunction(
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: typescriptLib.typescriptMod.EqualsGreaterThanToken,
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    equalsGreaterThanToken: typescriptLib.typescriptMod.EqualsGreaterThanToken,
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: typescriptLib.typescriptMod.EqualsGreaterThanToken,
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    equalsGreaterThanToken: typescriptLib.typescriptMod.EqualsGreaterThanToken,
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: typescriptLib.typescriptMod.EqualsGreaterThanToken,
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    equalsGreaterThanToken: typescriptLib.typescriptMod.EqualsGreaterThanToken,
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: typescriptLib.typescriptMod.EqualsGreaterThanToken,
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    equalsGreaterThanToken: typescriptLib.typescriptMod.EqualsGreaterThanToken,
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def createAsExpression(expression: typescriptLib.typescriptMod.Expression, `type`: typescriptLib.typescriptMod.TypeNode): typescriptLib.typescriptMod.AsExpression = js.native
  def createAssignment(
    left: typescriptLib.typescriptMod.ArrayLiteralExpression,
    right: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.DestructuringAssignment = js.native
  def createAssignment(left: typescriptLib.typescriptMod.Expression, right: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.BinaryExpression = js.native
  def createAssignment(
    left: typescriptLib.typescriptMod.ObjectLiteralExpression,
    right: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.DestructuringAssignment = js.native
  def createAwait(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.AwaitExpression = js.native
  def createBigIntLiteral(value: java.lang.String): typescriptLib.typescriptMod.BigIntLiteral = js.native
  def createBinary(
    left: typescriptLib.typescriptMod.Expression,
    operator: typescriptLib.typescriptMod.BinaryOperatorToken,
    right: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.BinaryExpression = js.native
  def createBinary(
    left: typescriptLib.typescriptMod.Expression,
    operator: typescriptLib.typescriptMod.BinaryOperator,
    right: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.BinaryExpression = js.native
  def createBindingElement(dotDotDotToken: js.UndefOr[scala.Nothing], propertyName: java.lang.String, name: java.lang.String): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: java.lang.String,
    name: java.lang.String,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: java.lang.String,
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: java.lang.String,
    name: typescriptLib.typescriptMod.BindingName,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: typescriptLib.typescriptMod.PropertyName,
    name: java.lang.String
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: typescriptLib.typescriptMod.PropertyName,
    name: java.lang.String,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: typescriptLib.typescriptMod.PropertyName,
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: typescriptLib.typescriptMod.PropertyName,
    name: typescriptLib.typescriptMod.BindingName,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    propertyName: java.lang.String,
    name: java.lang.String
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    propertyName: java.lang.String,
    name: java.lang.String,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    propertyName: java.lang.String,
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    propertyName: java.lang.String,
    name: typescriptLib.typescriptMod.BindingName,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    propertyName: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    propertyName: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    propertyName: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    propertyName: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    propertyName: typescriptLib.typescriptMod.PropertyName,
    name: java.lang.String
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    propertyName: typescriptLib.typescriptMod.PropertyName,
    name: java.lang.String,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    propertyName: typescriptLib.typescriptMod.PropertyName,
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    propertyName: typescriptLib.typescriptMod.PropertyName,
    name: typescriptLib.typescriptMod.BindingName,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def createBlock(statements: js.Array[typescriptLib.typescriptMod.Statement]): typescriptLib.typescriptMod.Block = js.native
  def createBlock(statements: js.Array[typescriptLib.typescriptMod.Statement], multiLine: scala.Boolean): typescriptLib.typescriptMod.Block = js.native
  def createBreak(): typescriptLib.typescriptMod.BreakStatement = js.native
  def createBreak(label: java.lang.String): typescriptLib.typescriptMod.BreakStatement = js.native
  def createBreak(label: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.BreakStatement = js.native
  def createBundle(sourceFiles: js.Array[typescriptLib.typescriptMod.SourceFile]): typescriptLib.typescriptMod.Bundle = js.native
  def createBundle(
    sourceFiles: js.Array[typescriptLib.typescriptMod.SourceFile],
    prepends: js.Array[
      typescriptLib.typescriptMod.UnparsedSource | typescriptLib.typescriptMod.InputFiles
    ]
  ): typescriptLib.typescriptMod.Bundle = js.native
  def createCall(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.CallExpression = js.native
  def createCall(
    expression: typescriptLib.typescriptMod.Expression,
    typeArguments: js.Array[typescriptLib.typescriptMod.TypeNode]
  ): typescriptLib.typescriptMod.CallExpression = js.native
  def createCall(
    expression: typescriptLib.typescriptMod.Expression,
    typeArguments: js.Array[typescriptLib.typescriptMod.TypeNode],
    argumentsArray: js.Array[typescriptLib.typescriptMod.Expression]
  ): typescriptLib.typescriptMod.CallExpression = js.native
  def createCall(
    expression: typescriptLib.typescriptMod.Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[typescriptLib.typescriptMod.Expression]
  ): typescriptLib.typescriptMod.CallExpression = js.native
  def createCallSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.CallSignatureDeclaration = js.native
  def createCallSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.CallSignatureDeclaration = js.native
  def createCallSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.CallSignatureDeclaration = js.native
  def createCallSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.CallSignatureDeclaration = js.native
  def createCaseBlock(clauses: js.Array[typescriptLib.typescriptMod.CaseOrDefaultClause]): typescriptLib.typescriptMod.CaseBlock = js.native
  def createCaseClause(
    expression: typescriptLib.typescriptMod.Expression,
    statements: js.Array[typescriptLib.typescriptMod.Statement]
  ): typescriptLib.typescriptMod.CaseClause = js.native
  def createCatchClause(variableDeclaration: java.lang.String, block: typescriptLib.typescriptMod.Block): typescriptLib.typescriptMod.CatchClause = js.native
  def createCatchClause(variableDeclaration: js.UndefOr[scala.Nothing], block: typescriptLib.typescriptMod.Block): typescriptLib.typescriptMod.CatchClause = js.native
  def createCatchClause(
    variableDeclaration: typescriptLib.typescriptMod.VariableDeclaration,
    block: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.CatchClause = js.native
  def createClassDeclaration(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.Modifier]],
    name: js.UndefOr[java.lang.String | typescriptLib.typescriptMod.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration]],
    heritageClauses: js.UndefOr[js.Array[typescriptLib.typescriptMod.HeritageClause]],
    members: js.Array[typescriptLib.typescriptMod.ClassElement]
  ): typescriptLib.typescriptMod.ClassDeclaration = js.native
  def createClassExpression(
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.Modifier]],
    name: js.UndefOr[java.lang.String | typescriptLib.typescriptMod.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration]],
    heritageClauses: js.UndefOr[js.Array[typescriptLib.typescriptMod.HeritageClause]],
    members: js.Array[typescriptLib.typescriptMod.ClassElement]
  ): typescriptLib.typescriptMod.ClassExpression = js.native
  def createClassifier(): typescriptLib.typescriptMod.Classifier = js.native
  def createComma(left: typescriptLib.typescriptMod.Expression, right: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.Expression = js.native
  def createCommaList(elements: js.Array[typescriptLib.typescriptMod.Expression]): typescriptLib.typescriptMod.CommaListExpression = js.native
  def createCompilerHost(options: typescriptLib.typescriptMod.CompilerOptions): typescriptLib.typescriptMod.CompilerHost = js.native
  def createCompilerHost(options: typescriptLib.typescriptMod.CompilerOptions, setParentNodes: scala.Boolean): typescriptLib.typescriptMod.CompilerHost = js.native
  def createComputedPropertyName(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.ComputedPropertyName = js.native
  def createConditional(
    condition: typescriptLib.typescriptMod.Expression,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    whenTrue: typescriptLib.typescriptMod.Expression,
    colonToken: typescriptLib.typescriptMod.ColonToken,
    whenFalse: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ConditionalExpression = js.native
  /** @deprecated */ def createConditional(
    condition: typescriptLib.typescriptMod.Expression,
    whenTrue: typescriptLib.typescriptMod.Expression,
    whenFalse: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ConditionalExpression = js.native
  def createConditionalTypeNode(
    checkType: typescriptLib.typescriptMod.TypeNode,
    extendsType: typescriptLib.typescriptMod.TypeNode,
    trueType: typescriptLib.typescriptMod.TypeNode,
    falseType: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ConditionalTypeNode = js.native
  def createConstructSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.ConstructSignatureDeclaration = js.native
  def createConstructSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ConstructSignatureDeclaration = js.native
  def createConstructSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.ConstructSignatureDeclaration = js.native
  def createConstructSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ConstructSignatureDeclaration = js.native
  def createConstructor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.ConstructorDeclaration = js.native
  def createConstructor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.ConstructorDeclaration = js.native
  def createConstructor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.ConstructorDeclaration = js.native
  def createConstructor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.ConstructorDeclaration = js.native
  def createConstructor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.ConstructorDeclaration = js.native
  def createConstructor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.ConstructorDeclaration = js.native
  def createConstructor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.ConstructorDeclaration = js.native
  def createConstructor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.ConstructorDeclaration = js.native
  def createConstructorTypeNode(
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.ConstructorTypeNode = js.native
  def createConstructorTypeNode(
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ConstructorTypeNode = js.native
  def createConstructorTypeNode(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.ConstructorTypeNode = js.native
  def createConstructorTypeNode(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ConstructorTypeNode = js.native
  def createContinue(): typescriptLib.typescriptMod.ContinueStatement = js.native
  def createContinue(label: java.lang.String): typescriptLib.typescriptMod.ContinueStatement = js.native
  def createContinue(label: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.ContinueStatement = js.native
  def createDebuggerStatement(): typescriptLib.typescriptMod.DebuggerStatement = js.native
  def createDecorator(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.Decorator = js.native
  def createDefaultClause(statements: js.Array[typescriptLib.typescriptMod.Statement]): typescriptLib.typescriptMod.DefaultClause = js.native
  def createDelete(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.DeleteExpression = js.native
  def createDo(
    statement: typescriptLib.typescriptMod.Statement,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.DoStatement = js.native
  def createDocumentRegistry(): typescriptLib.typescriptMod.DocumentRegistry = js.native
  def createDocumentRegistry(useCaseSensitiveFileNames: scala.Boolean): typescriptLib.typescriptMod.DocumentRegistry = js.native
  def createDocumentRegistry(useCaseSensitiveFileNames: scala.Boolean, currentDirectory: java.lang.String): typescriptLib.typescriptMod.DocumentRegistry = js.native
  def createElementAccess(expression: typescriptLib.typescriptMod.Expression, index: scala.Double): typescriptLib.typescriptMod.ElementAccessExpression = js.native
  def createElementAccess(expression: typescriptLib.typescriptMod.Expression, index: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.ElementAccessExpression = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  /**
    * Create the builder that can handle the changes in program and iterate through changed files
    * to emit the those files and manage semantic diagnostics cache as well
    */
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    newProgram: typescriptLib.typescriptMod.Program,
    host: typescriptLib.typescriptMod.BuilderProgramHost
  ): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    newProgram: typescriptLib.typescriptMod.Program,
    host: typescriptLib.typescriptMod.BuilderProgramHost,
    oldProgram: typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram
  ): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    newProgram: typescriptLib.typescriptMod.Program,
    host: typescriptLib.typescriptMod.BuilderProgramHost,
    oldProgram: typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic]
  ): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(rootNames: js.Array[java.lang.String]): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost
  ): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram
  ): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic]
  ): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.ProjectReference]
  ): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(rootNames: js.Array[java.lang.String], options: typescriptLib.typescriptMod.CompilerOptions): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost
  ): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram
  ): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic]
  ): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.ProjectReference]
  ): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost
  ): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram
  ): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic]
  ): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.ProjectReference]
  ): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(rootNames: js.UndefOr[scala.Nothing], options: typescriptLib.typescriptMod.CompilerOptions): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost
  ): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram
  ): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic]
  ): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.ProjectReference]
  ): typescriptLib.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmptyStatement(): typescriptLib.typescriptMod.EmptyStatement = js.native
  def createEnumDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    members: js.Array[typescriptLib.typescriptMod.EnumMember]
  ): typescriptLib.typescriptMod.EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    members: js.Array[typescriptLib.typescriptMod.EnumMember]
  ): typescriptLib.typescriptMod.EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    members: js.Array[typescriptLib.typescriptMod.EnumMember]
  ): typescriptLib.typescriptMod.EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    members: js.Array[typescriptLib.typescriptMod.EnumMember]
  ): typescriptLib.typescriptMod.EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    members: js.Array[typescriptLib.typescriptMod.EnumMember]
  ): typescriptLib.typescriptMod.EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    members: js.Array[typescriptLib.typescriptMod.EnumMember]
  ): typescriptLib.typescriptMod.EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    members: js.Array[typescriptLib.typescriptMod.EnumMember]
  ): typescriptLib.typescriptMod.EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    members: js.Array[typescriptLib.typescriptMod.EnumMember]
  ): typescriptLib.typescriptMod.EnumDeclaration = js.native
  def createEnumMember(name: java.lang.String): typescriptLib.typescriptMod.EnumMember = js.native
  def createEnumMember(name: java.lang.String, initializer: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.EnumMember = js.native
  def createEnumMember(name: typescriptLib.typescriptMod.PropertyName): typescriptLib.typescriptMod.EnumMember = js.native
  def createEnumMember(
    name: typescriptLib.typescriptMod.PropertyName,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.EnumMember = js.native
  def createExportAssignment(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    isExportEquals: js.UndefOr[scala.Nothing],
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    isExportEquals: scala.Boolean,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    isExportEquals: js.UndefOr[scala.Nothing],
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    isExportEquals: scala.Boolean,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    isExportEquals: js.UndefOr[scala.Nothing],
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    isExportEquals: scala.Boolean,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    isExportEquals: js.UndefOr[scala.Nothing],
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    isExportEquals: scala.Boolean,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportAssignment = js.native
  def createExportDeclaration(): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def createExportDeclaration(decorators: js.Array[typescriptLib.typescriptMod.Decorator]): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier]
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    exportClause: typescriptLib.typescriptMod.NamedExports
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    exportClause: typescriptLib.typescriptMod.NamedExports,
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: typescriptLib.typescriptMod.NamedExports
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: typescriptLib.typescriptMod.NamedExports,
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def createExportDeclaration(decorators: js.UndefOr[scala.Nothing], modifiers: js.Array[typescriptLib.typescriptMod.Modifier]): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    exportClause: typescriptLib.typescriptMod.NamedExports
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    exportClause: typescriptLib.typescriptMod.NamedExports,
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: typescriptLib.typescriptMod.NamedExports
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: typescriptLib.typescriptMod.NamedExports,
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def createExportDefault(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.ExportAssignment = js.native
  def createExportSpecifier(propertyName: java.lang.String, name: java.lang.String): typescriptLib.typescriptMod.ExportSpecifier = js.native
  def createExportSpecifier(propertyName: java.lang.String, name: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.ExportSpecifier = js.native
  def createExportSpecifier(propertyName: js.UndefOr[scala.Nothing], name: java.lang.String): typescriptLib.typescriptMod.ExportSpecifier = js.native
  def createExportSpecifier(propertyName: js.UndefOr[scala.Nothing], name: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.ExportSpecifier = js.native
  def createExportSpecifier(propertyName: typescriptLib.typescriptMod.Identifier, name: java.lang.String): typescriptLib.typescriptMod.ExportSpecifier = js.native
  def createExportSpecifier(propertyName: typescriptLib.typescriptMod.Identifier, name: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.ExportSpecifier = js.native
  def createExpressionStatement(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.ExpressionStatement = js.native
  def createExpressionWithTypeArguments(
    typeArguments: js.Array[typescriptLib.typescriptMod.TypeNode],
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExpressionWithTypeArguments = js.native
  def createExpressionWithTypeArguments(typeArguments: js.UndefOr[scala.Nothing], expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.ExpressionWithTypeArguments = js.native
  def createExternalModuleExport(exportName: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def createExternalModuleReference(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.ExternalModuleReference = js.native
  def createFalse(): typescriptLib.typescriptMod.BooleanLiteral with typescriptLib.typescriptMod.Token[typescriptLib.typescriptMod.SyntaxKind] = js.native
  /** Create a unique name based on the supplied text. This does not consider names injected by the transformer. */
  def createFileLevelUniqueName(text: java.lang.String): typescriptLib.typescriptMod.Identifier = js.native
  def createFor(
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForStatement = js.native
  def createFor(
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: typescriptLib.typescriptMod.Expression,
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForStatement = js.native
  def createFor(
    initializer: js.UndefOr[scala.Nothing],
    condition: typescriptLib.typescriptMod.Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForStatement = js.native
  def createFor(
    initializer: js.UndefOr[scala.Nothing],
    condition: typescriptLib.typescriptMod.Expression,
    incrementor: typescriptLib.typescriptMod.Expression,
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForStatement = js.native
  def createFor(
    initializer: typescriptLib.typescriptMod.ForInitializer,
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForStatement = js.native
  def createFor(
    initializer: typescriptLib.typescriptMod.ForInitializer,
    condition: js.UndefOr[scala.Nothing],
    incrementor: typescriptLib.typescriptMod.Expression,
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForStatement = js.native
  def createFor(
    initializer: typescriptLib.typescriptMod.ForInitializer,
    condition: typescriptLib.typescriptMod.Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForStatement = js.native
  def createFor(
    initializer: typescriptLib.typescriptMod.ForInitializer,
    condition: typescriptLib.typescriptMod.Expression,
    incrementor: typescriptLib.typescriptMod.Expression,
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForStatement = js.native
  def createForIn(
    initializer: typescriptLib.typescriptMod.ForInitializer,
    expression: typescriptLib.typescriptMod.Expression,
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForInStatement = js.native
  def createForOf(
    awaitModifier: js.UndefOr[scala.Nothing],
    initializer: typescriptLib.typescriptMod.ForInitializer,
    expression: typescriptLib.typescriptMod.Expression,
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForOfStatement = js.native
  def createForOf(
    awaitModifier: typescriptLib.typescriptMod.AwaitKeywordToken,
    initializer: typescriptLib.typescriptMod.ForInitializer,
    expression: typescriptLib.typescriptMod.Expression,
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForOfStatement = js.native
  def createFunctionDeclaration(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.AsteriskToken],
    name: js.UndefOr[java.lang.String | typescriptLib.typescriptMod.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.FunctionDeclaration = js.native
  def createFunctionDeclaration(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.AsteriskToken],
    name: js.UndefOr[java.lang.String | typescriptLib.typescriptMod.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.FunctionDeclaration = js.native
  def createFunctionDeclaration(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.AsteriskToken],
    name: js.UndefOr[java.lang.String | typescriptLib.typescriptMod.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.FunctionDeclaration = js.native
  def createFunctionExpression(
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.AsteriskToken],
    name: js.UndefOr[java.lang.String | typescriptLib.typescriptMod.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration]],
    parameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.ParameterDeclaration]],
    `type`: js.UndefOr[typescriptLib.typescriptMod.TypeNode],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.FunctionExpression = js.native
  def createFunctionTypeNode(
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.FunctionTypeNode = js.native
  def createFunctionTypeNode(
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.FunctionTypeNode = js.native
  def createFunctionTypeNode(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.FunctionTypeNode = js.native
  def createFunctionTypeNode(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.FunctionTypeNode = js.native
  def createGetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def createHeritageClause(
    token: typescriptLib.typescriptMod.SyntaxKind,
    types: js.Array[typescriptLib.typescriptMod.ExpressionWithTypeArguments]
  ): typescriptLib.typescriptMod.HeritageClause = js.native
  def createIdentifier(text: java.lang.String): typescriptLib.typescriptMod.Identifier = js.native
  def createIf(
    expression: typescriptLib.typescriptMod.Expression,
    thenStatement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.IfStatement = js.native
  def createIf(
    expression: typescriptLib.typescriptMod.Expression,
    thenStatement: typescriptLib.typescriptMod.Statement,
    elseStatement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.IfStatement = js.native
  def createImmediatelyInvokedArrowFunction(statements: js.Array[typescriptLib.typescriptMod.Statement]): typescriptLib.typescriptMod.CallExpression = js.native
  def createImmediatelyInvokedArrowFunction(
    statements: js.Array[typescriptLib.typescriptMod.Statement],
    param: typescriptLib.typescriptMod.ParameterDeclaration,
    paramValue: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.CallExpression = js.native
  def createImmediatelyInvokedFunctionExpression(statements: js.Array[typescriptLib.typescriptMod.Statement]): typescriptLib.typescriptMod.CallExpression = js.native
  def createImmediatelyInvokedFunctionExpression(
    statements: js.Array[typescriptLib.typescriptMod.Statement],
    param: typescriptLib.typescriptMod.ParameterDeclaration,
    paramValue: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.CallExpression = js.native
  def createImportClause(): typescriptLib.typescriptMod.ImportClause = js.native
  def createImportClause(name: js.UndefOr[scala.Nothing], namedBindings: typescriptLib.typescriptMod.NamedImportBindings): typescriptLib.typescriptMod.ImportClause = js.native
  def createImportClause(name: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.ImportClause = js.native
  def createImportClause(
    name: typescriptLib.typescriptMod.Identifier,
    namedBindings: typescriptLib.typescriptMod.NamedImportBindings
  ): typescriptLib.typescriptMod.ImportClause = js.native
  def createImportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    importClause: typescriptLib.typescriptMod.ImportClause,
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: typescriptLib.typescriptMod.ImportClause,
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    importClause: typescriptLib.typescriptMod.ImportClause,
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: typescriptLib.typescriptMod.ImportClause,
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ImportDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    moduleReference: typescriptLib.typescriptMod.ModuleReference
  ): typescriptLib.typescriptMod.ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    moduleReference: typescriptLib.typescriptMod.ModuleReference
  ): typescriptLib.typescriptMod.ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    moduleReference: typescriptLib.typescriptMod.ModuleReference
  ): typescriptLib.typescriptMod.ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    moduleReference: typescriptLib.typescriptMod.ModuleReference
  ): typescriptLib.typescriptMod.ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    moduleReference: typescriptLib.typescriptMod.ModuleReference
  ): typescriptLib.typescriptMod.ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    moduleReference: typescriptLib.typescriptMod.ModuleReference
  ): typescriptLib.typescriptMod.ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    moduleReference: typescriptLib.typescriptMod.ModuleReference
  ): typescriptLib.typescriptMod.ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    moduleReference: typescriptLib.typescriptMod.ModuleReference
  ): typescriptLib.typescriptMod.ImportEqualsDeclaration = js.native
  def createImportSpecifier(propertyName: js.UndefOr[scala.Nothing], name: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.ImportSpecifier = js.native
  def createImportSpecifier(propertyName: typescriptLib.typescriptMod.Identifier, name: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.ImportSpecifier = js.native
  def createImportTypeNode(argument: typescriptLib.typescriptMod.TypeNode): typescriptLib.typescriptMod.ImportTypeNode = js.native
  def createImportTypeNode(argument: typescriptLib.typescriptMod.TypeNode, qualifier: typescriptLib.typescriptMod.EntityName): typescriptLib.typescriptMod.ImportTypeNode = js.native
  def createImportTypeNode(
    argument: typescriptLib.typescriptMod.TypeNode,
    qualifier: typescriptLib.typescriptMod.EntityName,
    typeArguments: js.Array[typescriptLib.typescriptMod.TypeNode]
  ): typescriptLib.typescriptMod.ImportTypeNode = js.native
  def createImportTypeNode(
    argument: typescriptLib.typescriptMod.TypeNode,
    qualifier: typescriptLib.typescriptMod.EntityName,
    typeArguments: js.Array[typescriptLib.typescriptMod.TypeNode],
    isTypeOf: scala.Boolean
  ): typescriptLib.typescriptMod.ImportTypeNode = js.native
  def createIndexSignature(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.IndexSignatureDeclaration = js.native
  def createIndexSignature(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.IndexSignatureDeclaration = js.native
  def createIndexSignature(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.IndexSignatureDeclaration = js.native
  def createIndexSignature(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.IndexSignatureDeclaration = js.native
  def createIndexedAccessTypeNode(objectType: typescriptLib.typescriptMod.TypeNode, indexType: typescriptLib.typescriptMod.TypeNode): typescriptLib.typescriptMod.IndexedAccessTypeNode = js.native
  def createInferTypeNode(typeParameter: typescriptLib.typescriptMod.TypeParameterDeclaration): typescriptLib.typescriptMod.InferTypeNode = js.native
  def createInputFiles(javascriptText: java.lang.String, declarationText: java.lang.String): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: java.lang.String,
    declarationMapPath: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: java.lang.String,
    declarationMapPath: java.lang.String,
    declarationMapText: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: java.lang.String,
    declarationMapPath: js.UndefOr[scala.Nothing],
    declarationMapText: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: js.UndefOr[scala.Nothing],
    declarationMapPath: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: js.UndefOr[scala.Nothing],
    declarationMapPath: java.lang.String,
    declarationMapText: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: js.UndefOr[scala.Nothing],
    declarationMapPath: js.UndefOr[scala.Nothing],
    declarationMapText: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    javascriptMapText: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    javascriptMapText: java.lang.String,
    declarationMapPath: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    javascriptMapText: java.lang.String,
    declarationMapPath: java.lang.String,
    declarationMapText: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    javascriptMapText: java.lang.String,
    declarationMapPath: js.UndefOr[scala.Nothing],
    declarationMapText: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    javascriptMapText: js.UndefOr[scala.Nothing],
    declarationMapPath: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    javascriptMapText: js.UndefOr[scala.Nothing],
    declarationMapPath: java.lang.String,
    declarationMapText: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    javascriptMapText: js.UndefOr[scala.Nothing],
    declarationMapPath: js.UndefOr[scala.Nothing],
    declarationMapText: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: java.lang.String,
    declarationPath: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: java.lang.String,
    declarationPath: java.lang.String,
    declarationMapPath: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: java.lang.String,
    declarationPath: java.lang.String,
    declarationMapPath: java.lang.String,
    buildInfoPath: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: java.lang.String,
    declarationPath: java.lang.String,
    declarationMapPath: js.UndefOr[scala.Nothing],
    buildInfoPath: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    declarationPath: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    declarationPath: java.lang.String,
    declarationMapPath: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    declarationPath: java.lang.String,
    declarationMapPath: java.lang.String,
    buildInfoPath: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInputFiles(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    declarationPath: java.lang.String,
    declarationMapPath: js.UndefOr[scala.Nothing],
    buildInfoPath: java.lang.String
  ): typescriptLib.typescriptMod.InputFiles = js.native
  def createInterfaceDeclaration(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.Modifier]],
    name: java.lang.String | typescriptLib.typescriptMod.Identifier,
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration]],
    heritageClauses: js.UndefOr[js.Array[typescriptLib.typescriptMod.HeritageClause]],
    members: js.Array[typescriptLib.typescriptMod.TypeElement]
  ): typescriptLib.typescriptMod.InterfaceDeclaration = js.native
  def createIntersectionTypeNode(types: js.Array[typescriptLib.typescriptMod.TypeNode]): typescriptLib.typescriptMod.IntersectionTypeNode = js.native
  def createJsxAttribute(
    name: typescriptLib.typescriptMod.Identifier,
    initializer: typescriptLib.typescriptMod.JsxExpression
  ): typescriptLib.typescriptMod.JsxAttribute = js.native
  def createJsxAttribute(
    name: typescriptLib.typescriptMod.Identifier,
    initializer: typescriptLib.typescriptMod.StringLiteral
  ): typescriptLib.typescriptMod.JsxAttribute = js.native
  def createJsxAttributes(properties: js.Array[typescriptLib.typescriptMod.JsxAttributeLike]): typescriptLib.typescriptMod.JsxAttributes = js.native
  def createJsxClosingElement(tagName: typescriptLib.typescriptMod.JsxTagNameExpression): typescriptLib.typescriptMod.JsxClosingElement = js.native
  def createJsxElement(
    openingElement: typescriptLib.typescriptMod.JsxOpeningElement,
    children: js.Array[typescriptLib.typescriptMod.JsxChild],
    closingElement: typescriptLib.typescriptMod.JsxClosingElement
  ): typescriptLib.typescriptMod.JsxElement = js.native
  def createJsxExpression(): typescriptLib.typescriptMod.JsxExpression = js.native
  def createJsxExpression(dotDotDotToken: js.UndefOr[scala.Nothing], expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.JsxExpression = js.native
  def createJsxExpression(dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken): typescriptLib.typescriptMod.JsxExpression = js.native
  def createJsxExpression(
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.JsxExpression = js.native
  def createJsxFragment(
    openingFragment: typescriptLib.typescriptMod.JsxOpeningFragment,
    children: js.Array[typescriptLib.typescriptMod.JsxChild],
    closingFragment: typescriptLib.typescriptMod.JsxClosingFragment
  ): typescriptLib.typescriptMod.JsxFragment = js.native
  def createJsxJsxClosingFragment(): typescriptLib.typescriptMod.JsxClosingFragment = js.native
  def createJsxOpeningElement(
    tagName: typescriptLib.typescriptMod.JsxTagNameExpression,
    typeArguments: js.Array[typescriptLib.typescriptMod.TypeNode],
    attributes: typescriptLib.typescriptMod.JsxAttributes
  ): typescriptLib.typescriptMod.JsxOpeningElement = js.native
  def createJsxOpeningElement(
    tagName: typescriptLib.typescriptMod.JsxTagNameExpression,
    typeArguments: js.UndefOr[scala.Nothing],
    attributes: typescriptLib.typescriptMod.JsxAttributes
  ): typescriptLib.typescriptMod.JsxOpeningElement = js.native
  def createJsxOpeningFragment(): typescriptLib.typescriptMod.JsxOpeningFragment = js.native
  def createJsxSelfClosingElement(
    tagName: typescriptLib.typescriptMod.JsxTagNameExpression,
    typeArguments: js.Array[typescriptLib.typescriptMod.TypeNode],
    attributes: typescriptLib.typescriptMod.JsxAttributes
  ): typescriptLib.typescriptMod.JsxSelfClosingElement = js.native
  def createJsxSelfClosingElement(
    tagName: typescriptLib.typescriptMod.JsxTagNameExpression,
    typeArguments: js.UndefOr[scala.Nothing],
    attributes: typescriptLib.typescriptMod.JsxAttributes
  ): typescriptLib.typescriptMod.JsxSelfClosingElement = js.native
  def createJsxSpreadAttribute(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.JsxSpreadAttribute = js.native
  def createJsxText(text: java.lang.String): typescriptLib.typescriptMod.JsxText = js.native
  def createJsxText(text: java.lang.String, containsOnlyTriviaWhiteSpaces: scala.Boolean): typescriptLib.typescriptMod.JsxText = js.native
  def createKeywordTypeNode(kind: typescriptLib.typescriptMod.SyntaxKind): typescriptLib.typescriptMod.KeywordTypeNode = js.native
  def createLabel(label: java.lang.String, statement: typescriptLib.typescriptMod.Statement): typescriptLib.typescriptMod.LabeledStatement = js.native
  def createLabel(label: typescriptLib.typescriptMod.Identifier, statement: typescriptLib.typescriptMod.Statement): typescriptLib.typescriptMod.LabeledStatement = js.native
  def createLanguageService(host: typescriptLib.typescriptMod.LanguageServiceHost): typescriptLib.typescriptMod.LanguageService = js.native
  def createLanguageService(
    host: typescriptLib.typescriptMod.LanguageServiceHost,
    documentRegistry: typescriptLib.typescriptMod.DocumentRegistry
  ): typescriptLib.typescriptMod.LanguageService = js.native
  def createLanguageService(
    host: typescriptLib.typescriptMod.LanguageServiceHost,
    documentRegistry: typescriptLib.typescriptMod.DocumentRegistry,
    syntaxOnly: scala.Boolean
  ): typescriptLib.typescriptMod.LanguageService = js.native
  def createLanguageServiceSourceFile(
    fileName: java.lang.String,
    scriptSnapshot: typescriptLib.typescriptMod.IScriptSnapshot,
    scriptTarget: typescriptLib.typescriptMod.ScriptTarget,
    version: java.lang.String,
    setNodeParents: scala.Boolean
  ): typescriptLib.typescriptMod.SourceFile = js.native
  def createLanguageServiceSourceFile(
    fileName: java.lang.String,
    scriptSnapshot: typescriptLib.typescriptMod.IScriptSnapshot,
    scriptTarget: typescriptLib.typescriptMod.ScriptTarget,
    version: java.lang.String,
    setNodeParents: scala.Boolean,
    scriptKind: typescriptLib.typescriptMod.ScriptKind
  ): typescriptLib.typescriptMod.SourceFile = js.native
  def createLessThan(left: typescriptLib.typescriptMod.Expression, right: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.Expression = js.native
  def createLiteral(value: java.lang.String): typescriptLib.typescriptMod.PrimaryExpression = js.native
  def createLiteral(value: scala.Boolean): typescriptLib.typescriptMod.PrimaryExpression = js.native
  def createLiteral(value: scala.Double): typescriptLib.typescriptMod.PrimaryExpression = js.native
  def createLiteral(value: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.StringLiteral = js.native
  def createLiteral(value: typescriptLib.typescriptMod.NoSubstitutionTemplateLiteral): typescriptLib.typescriptMod.StringLiteral = js.native
  def createLiteral(value: typescriptLib.typescriptMod.NumericLiteral): typescriptLib.typescriptMod.StringLiteral = js.native
  def createLiteral(value: typescriptLib.typescriptMod.PseudoBigInt): typescriptLib.typescriptMod.PrimaryExpression = js.native
  def createLiteral(value: typescriptLib.typescriptMod.StringLiteral): typescriptLib.typescriptMod.StringLiteral = js.native
  def createLiteralTypeNode(literal: typescriptLib.typescriptMod.BooleanLiteral): typescriptLib.typescriptMod.LiteralTypeNode = js.native
  def createLiteralTypeNode(literal: typescriptLib.typescriptMod.LiteralExpression): typescriptLib.typescriptMod.LiteralTypeNode = js.native
  def createLiteralTypeNode(literal: typescriptLib.typescriptMod.PrefixUnaryExpression): typescriptLib.typescriptMod.LiteralTypeNode = js.native
  @JSName("createLiteral")
  def createLiteral_BooleanLiteral(value: scala.Boolean): typescriptLib.typescriptMod.BooleanLiteral = js.native
  @JSName("createLiteral")
  def createLiteral_NumericLiteral(value: scala.Double): typescriptLib.typescriptMod.NumericLiteral = js.native
  @JSName("createLiteral")
  def createLiteral_NumericLiteral(value: typescriptLib.typescriptMod.PseudoBigInt): typescriptLib.typescriptMod.NumericLiteral = js.native
  /** If a node is passed, creates a string literal whose source text is read from a source node during emit. */
  @JSName("createLiteral")
  def createLiteral_StringLiteral(value: java.lang.String): typescriptLib.typescriptMod.StringLiteral = js.native
  def createLogicalAnd(left: typescriptLib.typescriptMod.Expression, right: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.BinaryExpression = js.native
  def createLogicalNot(operand: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.PrefixUnaryExpression = js.native
  def createLogicalOr(left: typescriptLib.typescriptMod.Expression, right: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.BinaryExpression = js.native
  /** Create a unique temporary variable for use in a loop. */
  def createLoopVariable(): typescriptLib.typescriptMod.Identifier = js.native
  def createMappedTypeNode(
    readonlyToken: typescriptLib.typescriptMod.MinusToken | typescriptLib.typescriptMod.PlusToken | typescriptLib.typescriptMod.ReadonlyToken | js.UndefOr[scala.Nothing],
    typeParameter: typescriptLib.typescriptMod.TypeParameterDeclaration
  ): typescriptLib.typescriptMod.MappedTypeNode = js.native
  def createMappedTypeNode(
    readonlyToken: typescriptLib.typescriptMod.MinusToken | typescriptLib.typescriptMod.PlusToken | typescriptLib.typescriptMod.ReadonlyToken | js.UndefOr[scala.Nothing],
    typeParameter: typescriptLib.typescriptMod.TypeParameterDeclaration,
    questionToken: typescriptLib.typescriptMod.MinusToken | typescriptLib.typescriptMod.PlusToken | typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.MappedTypeNode = js.native
  def createMappedTypeNode(
    readonlyToken: typescriptLib.typescriptMod.MinusToken | typescriptLib.typescriptMod.PlusToken | typescriptLib.typescriptMod.ReadonlyToken | js.UndefOr[scala.Nothing],
    typeParameter: typescriptLib.typescriptMod.TypeParameterDeclaration,
    questionToken: typescriptLib.typescriptMod.MinusToken | typescriptLib.typescriptMod.PlusToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.MappedTypeNode = js.native
  def createMetaProperty(keywordToken: typescriptLib.typescriptMod.SyntaxKind, name: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.MetaProperty = js.native
  def createMethod(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.AsteriskToken],
    name: java.lang.String | typescriptLib.typescriptMod.PropertyName,
    questionToken: js.UndefOr[typescriptLib.typescriptMod.QuestionToken],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.MethodDeclaration = js.native
  def createMethod(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.AsteriskToken],
    name: java.lang.String | typescriptLib.typescriptMod.PropertyName,
    questionToken: js.UndefOr[typescriptLib.typescriptMod.QuestionToken],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.MethodDeclaration = js.native
  def createMethod(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.AsteriskToken],
    name: java.lang.String | typescriptLib.typescriptMod.PropertyName,
    questionToken: js.UndefOr[typescriptLib.typescriptMod.QuestionToken],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.MethodDeclaration = js.native
  def createMethodSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    name: java.lang.String
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    name: typescriptLib.typescriptMod.PropertyName
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    name: java.lang.String
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    name: typescriptLib.typescriptMod.PropertyName
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def createModifier[T /* <: /* import warning: ImportType.apply Failed type conversion: typescript.typescript.Modifier['kind'] */ js.Any */](kind: T): typescriptLib.typescriptMod.Token[T] = js.native
  def createModifiersFromModifierFlags(flags: typescriptLib.typescriptMod.ModifierFlags): js.Array[typescriptLib.typescriptMod.Modifier] = js.native
  def createModuleBlock(statements: js.Array[typescriptLib.typescriptMod.Statement]): typescriptLib.typescriptMod.ModuleBlock = js.native
  def createModuleDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.ModuleName
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.ModuleName,
    body: js.UndefOr[scala.Nothing],
    flags: typescriptLib.typescriptMod.NodeFlags
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.ModuleName,
    body: typescriptLib.typescriptMod.ModuleBody
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.ModuleName,
    body: typescriptLib.typescriptMod.ModuleBody,
    flags: typescriptLib.typescriptMod.NodeFlags
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.ModuleName
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.ModuleName,
    body: js.UndefOr[scala.Nothing],
    flags: typescriptLib.typescriptMod.NodeFlags
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.ModuleName,
    body: typescriptLib.typescriptMod.ModuleBody
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.ModuleName,
    body: typescriptLib.typescriptMod.ModuleBody,
    flags: typescriptLib.typescriptMod.NodeFlags
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.ModuleName
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.ModuleName,
    body: js.UndefOr[scala.Nothing],
    flags: typescriptLib.typescriptMod.NodeFlags
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.ModuleName,
    body: typescriptLib.typescriptMod.ModuleBody
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.ModuleName,
    body: typescriptLib.typescriptMod.ModuleBody,
    flags: typescriptLib.typescriptMod.NodeFlags
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.ModuleName
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.ModuleName,
    body: js.UndefOr[scala.Nothing],
    flags: typescriptLib.typescriptMod.NodeFlags
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.ModuleName,
    body: typescriptLib.typescriptMod.ModuleBody
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.ModuleName,
    body: typescriptLib.typescriptMod.ModuleBody,
    flags: typescriptLib.typescriptMod.NodeFlags
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def createModuleResolutionCache(
    currentDirectory: java.lang.String,
    getCanonicalFileName: js.Function1[/* s */ java.lang.String, java.lang.String]
  ): typescriptLib.typescriptMod.ModuleResolutionCache = js.native
  def createNamedExports(elements: js.Array[typescriptLib.typescriptMod.ExportSpecifier]): typescriptLib.typescriptMod.NamedExports = js.native
  def createNamedImports(elements: js.Array[typescriptLib.typescriptMod.ImportSpecifier]): typescriptLib.typescriptMod.NamedImports = js.native
  def createNamespaceExportDeclaration(name: java.lang.String): typescriptLib.typescriptMod.NamespaceExportDeclaration = js.native
  def createNamespaceExportDeclaration(name: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.NamespaceExportDeclaration = js.native
  def createNamespaceImport(name: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.NamespaceImport = js.native
  def createNew(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.NewExpression = js.native
  def createNew(
    expression: typescriptLib.typescriptMod.Expression,
    typeArguments: js.Array[typescriptLib.typescriptMod.TypeNode]
  ): typescriptLib.typescriptMod.NewExpression = js.native
  def createNew(
    expression: typescriptLib.typescriptMod.Expression,
    typeArguments: js.Array[typescriptLib.typescriptMod.TypeNode],
    argumentsArray: js.Array[typescriptLib.typescriptMod.Expression]
  ): typescriptLib.typescriptMod.NewExpression = js.native
  def createNew(
    expression: typescriptLib.typescriptMod.Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[typescriptLib.typescriptMod.Expression]
  ): typescriptLib.typescriptMod.NewExpression = js.native
  def createNoSubstitutionTemplateLiteral(text: java.lang.String): typescriptLib.typescriptMod.NoSubstitutionTemplateLiteral = js.native
  def createNode(kind: typescriptLib.typescriptMod.SyntaxKind): typescriptLib.typescriptMod.Node = js.native
  def createNode(kind: typescriptLib.typescriptMod.SyntaxKind, pos: scala.Double): typescriptLib.typescriptMod.Node = js.native
  def createNode(kind: typescriptLib.typescriptMod.SyntaxKind, pos: scala.Double, end: scala.Double): typescriptLib.typescriptMod.Node = js.native
  def createNodeArray[T /* <: typescriptLib.typescriptMod.Node */](): typescriptLib.typescriptMod.NodeArray[T] = js.native
  def createNodeArray[T /* <: typescriptLib.typescriptMod.Node */](elements: js.Array[T]): typescriptLib.typescriptMod.NodeArray[T] = js.native
  def createNodeArray[T /* <: typescriptLib.typescriptMod.Node */](elements: js.Array[T], hasTrailingComma: scala.Boolean): typescriptLib.typescriptMod.NodeArray[T] = js.native
  def createNonNullExpression(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.NonNullExpression = js.native
  /**
    * Creates a synthetic statement to act as a placeholder for a not-emitted statement in
    * order to preserve comments.
    *
    * @param original The original statement.
    */
  def createNotEmittedStatement(original: typescriptLib.typescriptMod.Node): typescriptLib.typescriptMod.NotEmittedStatement = js.native
  def createNull(): typescriptLib.typescriptMod.NullLiteral with typescriptLib.typescriptMod.Token[typescriptLib.typescriptMod.SyntaxKind] = js.native
  def createNumericLiteral(value: java.lang.String): typescriptLib.typescriptMod.NumericLiteral = js.native
  def createNumericLiteral(value: java.lang.String, numericLiteralFlags: typescriptLib.typescriptMod.TokenFlags): typescriptLib.typescriptMod.NumericLiteral = js.native
  def createObjectBindingPattern(elements: js.Array[typescriptLib.typescriptMod.BindingElement]): typescriptLib.typescriptMod.ObjectBindingPattern = js.native
  def createObjectLiteral(): typescriptLib.typescriptMod.ObjectLiteralExpression = js.native
  def createObjectLiteral(properties: js.Array[typescriptLib.typescriptMod.ObjectLiteralElementLike]): typescriptLib.typescriptMod.ObjectLiteralExpression = js.native
  def createObjectLiteral(
    properties: js.Array[typescriptLib.typescriptMod.ObjectLiteralElementLike],
    multiLine: scala.Boolean
  ): typescriptLib.typescriptMod.ObjectLiteralExpression = js.native
  def createOmittedExpression(): typescriptLib.typescriptMod.OmittedExpression = js.native
  /** Create a unique name based on the supplied text. */
  def createOptimisticUniqueName(text: java.lang.String): typescriptLib.typescriptMod.Identifier = js.native
  def createOptionalTypeNode(`type`: typescriptLib.typescriptMod.TypeNode): typescriptLib.typescriptMod.OptionalTypeNode = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def createParen(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.ParenthesizedExpression = js.native
  def createParenthesizedType(`type`: typescriptLib.typescriptMod.TypeNode): typescriptLib.typescriptMod.ParenthesizedTypeNode = js.native
  /**
    * Creates a synthetic expression to act as a placeholder for a not-emitted expression in
    * order to preserve comments or sourcemap positions.
    *
    * @param expression The inner expression to emit.
    * @param original The original outer expression.
    * @param location The location for the expression. Defaults to the positions from "original" if provided.
    */
  def createPartiallyEmittedExpression(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.PartiallyEmittedExpression = js.native
  def createPartiallyEmittedExpression(expression: typescriptLib.typescriptMod.Expression, original: typescriptLib.typescriptMod.Node): typescriptLib.typescriptMod.PartiallyEmittedExpression = js.native
  def createPostfix(
    operand: typescriptLib.typescriptMod.Expression,
    operator: typescriptLib.typescriptMod.PostfixUnaryOperator
  ): typescriptLib.typescriptMod.PostfixUnaryExpression = js.native
  def createPostfixIncrement(operand: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.PostfixUnaryExpression = js.native
  def createPrefix(
    operator: typescriptLib.typescriptMod.PrefixUnaryOperator,
    operand: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PrefixUnaryExpression = js.native
  def createPrinter(): typescriptLib.typescriptMod.Printer = js.native
  def createPrinter(printerOptions: typescriptLib.typescriptMod.PrinterOptions): typescriptLib.typescriptMod.Printer = js.native
  def createPrinter(
    printerOptions: typescriptLib.typescriptMod.PrinterOptions,
    handlers: typescriptLib.typescriptMod.PrintHandlers
  ): typescriptLib.typescriptMod.Printer = js.native
  /**
    * Create a new 'Program' instance. A Program is an immutable collection of 'SourceFile's and a 'CompilerOptions'
    * that represent a compilation unit.
    *
    * Creating a program proceeds from a set of root files, expanding the set of inputs by following imports and
    * triple-slash-reference-path directives transitively. '@types' and triple-slash-reference-types are also pulled in.
    *
    * @param createProgramOptions - The options for creating a program.
    * @returns A 'Program' object.
    */
  def createProgram(createProgramOptions: typescriptLib.typescriptMod.CreateProgramOptions): typescriptLib.typescriptMod.Program = js.native
  /**
    * Create a new 'Program' instance. A Program is an immutable collection of 'SourceFile's and a 'CompilerOptions'
    * that represent a compilation unit.
    *
    * Creating a program proceeds from a set of root files, expanding the set of inputs by following imports and
    * triple-slash-reference-path directives transitively. '@types' and triple-slash-reference-types are also pulled in.
    *
    * @param rootNames - A set of root files.
    * @param options - The compiler options which should be used.
    * @param host - The host interacts with the underlying file system.
    * @param oldProgram - Reuses an old program structure.
    * @param configFileParsingDiagnostics - error during config file parsing
    * @returns A 'Program' object.
    */
  def createProgram(rootNames: js.Array[java.lang.String], options: typescriptLib.typescriptMod.CompilerOptions): typescriptLib.typescriptMod.Program = js.native
  def createProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost
  ): typescriptLib.typescriptMod.Program = js.native
  def createProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.Program
  ): typescriptLib.typescriptMod.Program = js.native
  def createProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.Program,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic]
  ): typescriptLib.typescriptMod.Program = js.native
  def createProperty(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def createPropertyAccess(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.PropertyAccessExpression = js.native
  def createPropertyAccess(expression: typescriptLib.typescriptMod.Expression, name: java.lang.String): typescriptLib.typescriptMod.PropertyAccessExpression = js.native
  def createPropertyAccess(expression: typescriptLib.typescriptMod.Expression, name: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.PropertyAccessExpression = js.native
  def createPropertyAssignment(name: java.lang.String, initializer: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.PropertyAssignment = js.native
  def createPropertyAssignment(
    name: typescriptLib.typescriptMod.PropertyName,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertyAssignment = js.native
  def createPropertySignature(modifiers: js.Array[typescriptLib.typescriptMod.Modifier], name: java.lang.String): typescriptLib.typescriptMod.PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def createPropertySignature(modifiers: js.UndefOr[scala.Nothing], name: java.lang.String): typescriptLib.typescriptMod.PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def createPropertySignature(modifiers: js.UndefOr[scala.Nothing], name: typescriptLib.typescriptMod.PropertyName): typescriptLib.typescriptMod.PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def createQualifiedName(left: typescriptLib.typescriptMod.EntityName, right: java.lang.String): typescriptLib.typescriptMod.QualifiedName = js.native
  def createQualifiedName(left: typescriptLib.typescriptMod.EntityName, right: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.QualifiedName = js.native
  def createRegularExpressionLiteral(text: java.lang.String): typescriptLib.typescriptMod.RegularExpressionLiteral = js.native
  def createRestTypeNode(`type`: typescriptLib.typescriptMod.TypeNode): typescriptLib.typescriptMod.RestTypeNode = js.native
  def createReturn(): typescriptLib.typescriptMod.ReturnStatement = js.native
  def createReturn(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.ReturnStatement = js.native
  def createScanner(languageVersion: typescriptLib.typescriptMod.ScriptTarget, skipTrivia: scala.Boolean): typescriptLib.typescriptMod.Scanner = js.native
  def createScanner(
    languageVersion: typescriptLib.typescriptMod.ScriptTarget,
    skipTrivia: scala.Boolean,
    languageVariant: typescriptLib.typescriptMod.LanguageVariant
  ): typescriptLib.typescriptMod.Scanner = js.native
  def createScanner(
    languageVersion: typescriptLib.typescriptMod.ScriptTarget,
    skipTrivia: scala.Boolean,
    languageVariant: typescriptLib.typescriptMod.LanguageVariant,
    textInitial: java.lang.String
  ): typescriptLib.typescriptMod.Scanner = js.native
  def createScanner(
    languageVersion: typescriptLib.typescriptMod.ScriptTarget,
    skipTrivia: scala.Boolean,
    languageVariant: typescriptLib.typescriptMod.LanguageVariant,
    textInitial: java.lang.String,
    onError: typescriptLib.typescriptMod.ErrorCallback
  ): typescriptLib.typescriptMod.Scanner = js.native
  def createScanner(
    languageVersion: typescriptLib.typescriptMod.ScriptTarget,
    skipTrivia: scala.Boolean,
    languageVariant: typescriptLib.typescriptMod.LanguageVariant,
    textInitial: java.lang.String,
    onError: typescriptLib.typescriptMod.ErrorCallback,
    start: scala.Double
  ): typescriptLib.typescriptMod.Scanner = js.native
  def createScanner(
    languageVersion: typescriptLib.typescriptMod.ScriptTarget,
    skipTrivia: scala.Boolean,
    languageVariant: typescriptLib.typescriptMod.LanguageVariant,
    textInitial: java.lang.String,
    onError: typescriptLib.typescriptMod.ErrorCallback,
    start: scala.Double,
    length: scala.Double
  ): typescriptLib.typescriptMod.Scanner = js.native
  def createSemanticDiagnosticsBuilderProgram(): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  /**
    * Create the builder to manage semantic diagnostics and cache them
    */
  def createSemanticDiagnosticsBuilderProgram(
    newProgram: typescriptLib.typescriptMod.Program,
    host: typescriptLib.typescriptMod.BuilderProgramHost
  ): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    newProgram: typescriptLib.typescriptMod.Program,
    host: typescriptLib.typescriptMod.BuilderProgramHost,
    oldProgram: typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram
  ): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    newProgram: typescriptLib.typescriptMod.Program,
    host: typescriptLib.typescriptMod.BuilderProgramHost,
    oldProgram: typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic]
  ): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(rootNames: js.Array[java.lang.String]): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost
  ): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram
  ): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic]
  ): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.ProjectReference]
  ): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(rootNames: js.Array[java.lang.String], options: typescriptLib.typescriptMod.CompilerOptions): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost
  ): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram
  ): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic]
  ): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.ProjectReference]
  ): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost
  ): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram
  ): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic]
  ): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.ProjectReference]
  ): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(rootNames: js.UndefOr[scala.Nothing], options: typescriptLib.typescriptMod.CompilerOptions): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost
  ): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram
  ): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic]
  ): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.ProjectReference]
  ): typescriptLib.typescriptMod.SemanticDiagnosticsBuilderProgram = js.native
  def createSemicolonClassElement(): typescriptLib.typescriptMod.SemicolonClassElement = js.native
  def createSetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def createShorthandPropertyAssignment(name: java.lang.String): typescriptLib.typescriptMod.ShorthandPropertyAssignment = js.native
  def createShorthandPropertyAssignment(name: java.lang.String, objectAssignmentInitializer: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.ShorthandPropertyAssignment = js.native
  def createShorthandPropertyAssignment(name: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.ShorthandPropertyAssignment = js.native
  def createShorthandPropertyAssignment(
    name: typescriptLib.typescriptMod.Identifier,
    objectAssignmentInitializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ShorthandPropertyAssignment = js.native
  def createSourceFile(
    fileName: java.lang.String,
    sourceText: java.lang.String,
    languageVersion: typescriptLib.typescriptMod.ScriptTarget
  ): typescriptLib.typescriptMod.SourceFile = js.native
  def createSourceFile(
    fileName: java.lang.String,
    sourceText: java.lang.String,
    languageVersion: typescriptLib.typescriptMod.ScriptTarget,
    setParentNodes: scala.Boolean
  ): typescriptLib.typescriptMod.SourceFile = js.native
  def createSourceFile(
    fileName: java.lang.String,
    sourceText: java.lang.String,
    languageVersion: typescriptLib.typescriptMod.ScriptTarget,
    setParentNodes: scala.Boolean,
    scriptKind: typescriptLib.typescriptMod.ScriptKind
  ): typescriptLib.typescriptMod.SourceFile = js.native
  /**
    * Create an external source map source file reference
    */
  def createSourceMapSource(fileName: java.lang.String, text: java.lang.String): typescriptLib.typescriptMod.SourceMapSource = js.native
  def createSourceMapSource(
    fileName: java.lang.String,
    text: java.lang.String,
    skipTrivia: js.Function1[/* pos */ scala.Double, scala.Double]
  ): typescriptLib.typescriptMod.SourceMapSource = js.native
  def createSpread(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.SpreadElement = js.native
  def createSpreadAssignment(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.SpreadAssignment = js.native
  /** @deprecated Use `createExpressionStatement` instead.  */
  def createStatement(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.ExpressionStatement = js.native
  def createStrictEquality(left: typescriptLib.typescriptMod.Expression, right: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.BinaryExpression = js.native
  def createStrictInequality(left: typescriptLib.typescriptMod.Expression, right: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.BinaryExpression = js.native
  def createStringLiteral(text: java.lang.String): typescriptLib.typescriptMod.StringLiteral = js.native
  def createSubtract(left: typescriptLib.typescriptMod.Expression, right: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.BinaryExpression = js.native
  def createSuper(): typescriptLib.typescriptMod.SuperExpression = js.native
  def createSwitch(
    expression: typescriptLib.typescriptMod.Expression,
    caseBlock: typescriptLib.typescriptMod.CaseBlock
  ): typescriptLib.typescriptMod.SwitchStatement = js.native
  /** @deprecated */ def createTaggedTemplate(tag: typescriptLib.typescriptMod.Expression, template: typescriptLib.typescriptMod.TemplateLiteral): typescriptLib.typescriptMod.TaggedTemplateExpression = js.native
  def createTaggedTemplate(
    tag: typescriptLib.typescriptMod.Expression,
    typeArguments: js.Array[typescriptLib.typescriptMod.TypeNode],
    template: typescriptLib.typescriptMod.TemplateLiteral
  ): typescriptLib.typescriptMod.TaggedTemplateExpression = js.native
  def createTaggedTemplate(
    tag: typescriptLib.typescriptMod.Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    template: typescriptLib.typescriptMod.TemplateLiteral
  ): typescriptLib.typescriptMod.TaggedTemplateExpression = js.native
  def createTempVariable(): typescriptLib.typescriptMod.Identifier = js.native
  /** Create a unique temporary variable. */
  def createTempVariable(recordTempVariable: js.Function1[/* node */ typescriptLib.typescriptMod.Identifier, scala.Unit]): typescriptLib.typescriptMod.Identifier = js.native
  def createTemplateExpression(
    head: typescriptLib.typescriptMod.TemplateHead,
    templateSpans: js.Array[typescriptLib.typescriptMod.TemplateSpan]
  ): typescriptLib.typescriptMod.TemplateExpression = js.native
  def createTemplateHead(text: java.lang.String): typescriptLib.typescriptMod.TemplateHead = js.native
  def createTemplateMiddle(text: java.lang.String): typescriptLib.typescriptMod.TemplateMiddle = js.native
  def createTemplateSpan(
    expression: typescriptLib.typescriptMod.Expression,
    literal: typescriptLib.typescriptMod.TemplateMiddle
  ): typescriptLib.typescriptMod.TemplateSpan = js.native
  def createTemplateSpan(
    expression: typescriptLib.typescriptMod.Expression,
    literal: typescriptLib.typescriptMod.TemplateTail
  ): typescriptLib.typescriptMod.TemplateSpan = js.native
  def createTemplateTail(text: java.lang.String): typescriptLib.typescriptMod.TemplateTail = js.native
  def createTextChangeRange(span: typescriptLib.typescriptMod.TextSpan, newLength: scala.Double): typescriptLib.typescriptMod.TextChangeRange = js.native
  def createTextSpan(start: scala.Double, length: scala.Double): typescriptLib.typescriptMod.TextSpan = js.native
  def createTextSpanFromBounds(start: scala.Double, end: scala.Double): typescriptLib.typescriptMod.TextSpan = js.native
  def createThis(): typescriptLib.typescriptMod.ThisExpression with typescriptLib.typescriptMod.Token[typescriptLib.typescriptMod.SyntaxKind] = js.native
  def createThisTypeNode(): typescriptLib.typescriptMod.ThisTypeNode = js.native
  def createThrow(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.ThrowStatement = js.native
  def createToken[TKind /* <: typescriptLib.typescriptMod.SyntaxKind */](token: TKind): typescriptLib.typescriptMod.Token[TKind] = js.native
  def createTrue(): typescriptLib.typescriptMod.BooleanLiteral with typescriptLib.typescriptMod.Token[typescriptLib.typescriptMod.SyntaxKind] = js.native
  def createTry(tryBlock: typescriptLib.typescriptMod.Block): typescriptLib.typescriptMod.TryStatement = js.native
  def createTry(
    tryBlock: typescriptLib.typescriptMod.Block,
    catchClause: js.UndefOr[scala.Nothing],
    finallyBlock: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.TryStatement = js.native
  def createTry(tryBlock: typescriptLib.typescriptMod.Block, catchClause: typescriptLib.typescriptMod.CatchClause): typescriptLib.typescriptMod.TryStatement = js.native
  def createTry(
    tryBlock: typescriptLib.typescriptMod.Block,
    catchClause: typescriptLib.typescriptMod.CatchClause,
    finallyBlock: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.TryStatement = js.native
  def createTupleTypeNode(elementTypes: js.Array[typescriptLib.typescriptMod.TypeNode]): typescriptLib.typescriptMod.TupleTypeNode = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def createTypeAssertion(`type`: typescriptLib.typescriptMod.TypeNode, expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.TypeAssertion = js.native
  def createTypeLiteralNode(): typescriptLib.typescriptMod.TypeLiteralNode = js.native
  def createTypeLiteralNode(members: js.Array[typescriptLib.typescriptMod.TypeElement]): typescriptLib.typescriptMod.TypeLiteralNode = js.native
  def createTypeOf(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.TypeOfExpression = js.native
  def createTypeOperatorNode(operator: typescriptLib.typescriptMod.SyntaxKind, `type`: typescriptLib.typescriptMod.TypeNode): typescriptLib.typescriptMod.TypeOperatorNode = js.native
  def createTypeOperatorNode(`type`: typescriptLib.typescriptMod.TypeNode): typescriptLib.typescriptMod.TypeOperatorNode = js.native
  def createTypeParameterDeclaration(name: java.lang.String): typescriptLib.typescriptMod.TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: java.lang.String, constraint: typescriptLib.typescriptMod.TypeNode): typescriptLib.typescriptMod.TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(
    name: java.lang.String,
    constraint: typescriptLib.typescriptMod.TypeNode,
    defaultType: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: typescriptLib.typescriptMod.Identifier, constraint: typescriptLib.typescriptMod.TypeNode): typescriptLib.typescriptMod.TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(
    name: typescriptLib.typescriptMod.Identifier,
    constraint: typescriptLib.typescriptMod.TypeNode,
    defaultType: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeParameterDeclaration = js.native
  def createTypePredicateNode(parameterName: java.lang.String, `type`: typescriptLib.typescriptMod.TypeNode): typescriptLib.typescriptMod.TypePredicateNode = js.native
  def createTypePredicateNode(
    parameterName: typescriptLib.typescriptMod.Identifier,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypePredicateNode = js.native
  def createTypePredicateNode(
    parameterName: typescriptLib.typescriptMod.ThisTypeNode,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypePredicateNode = js.native
  def createTypeQueryNode(exprName: typescriptLib.typescriptMod.EntityName): typescriptLib.typescriptMod.TypeQueryNode = js.native
  def createTypeReferenceNode(typeName: java.lang.String): typescriptLib.typescriptMod.TypeReferenceNode = js.native
  def createTypeReferenceNode(typeName: java.lang.String, typeArguments: js.Array[typescriptLib.typescriptMod.TypeNode]): typescriptLib.typescriptMod.TypeReferenceNode = js.native
  def createTypeReferenceNode(typeName: typescriptLib.typescriptMod.EntityName): typescriptLib.typescriptMod.TypeReferenceNode = js.native
  def createTypeReferenceNode(
    typeName: typescriptLib.typescriptMod.EntityName,
    typeArguments: js.Array[typescriptLib.typescriptMod.TypeNode]
  ): typescriptLib.typescriptMod.TypeReferenceNode = js.native
  def createUnionOrIntersectionTypeNode(
    kind: typescriptLib.typescriptMod.SyntaxKind,
    types: js.Array[typescriptLib.typescriptMod.TypeNode]
  ): typescriptLib.typescriptMod.UnionOrIntersectionTypeNode = js.native
  def createUnionTypeNode(types: js.Array[typescriptLib.typescriptMod.TypeNode]): typescriptLib.typescriptMod.UnionTypeNode = js.native
  /** Create a unique name based on the supplied text. */
  def createUniqueName(text: java.lang.String): typescriptLib.typescriptMod.Identifier = js.native
  def createUnparsedSourceFile(text: java.lang.String): typescriptLib.typescriptMod.UnparsedSource = js.native
  def createUnparsedSourceFile(text: java.lang.String, mapPath: java.lang.String): typescriptLib.typescriptMod.UnparsedSource = js.native
  def createUnparsedSourceFile(text: java.lang.String, mapPath: java.lang.String, map: java.lang.String): typescriptLib.typescriptMod.UnparsedSource = js.native
  def createUnparsedSourceFile(text: java.lang.String, mapPath: js.UndefOr[scala.Nothing], map: java.lang.String): typescriptLib.typescriptMod.UnparsedSource = js.native
  @JSName("createUnparsedSourceFile")
  def createUnparsedSourceFile_dts(
    inputFile: typescriptLib.typescriptMod.InputFiles,
    `type`: gulpDashTypescriptLib.gulpDashTypescriptLibStrings.dts
  ): typescriptLib.typescriptMod.UnparsedSource = js.native
  @JSName("createUnparsedSourceFile")
  def createUnparsedSourceFile_dts(
    inputFile: typescriptLib.typescriptMod.InputFiles,
    `type`: gulpDashTypescriptLib.gulpDashTypescriptLibStrings.dts,
    stripInternal: scala.Boolean
  ): typescriptLib.typescriptMod.UnparsedSource = js.native
  @JSName("createUnparsedSourceFile")
  def createUnparsedSourceFile_js(
    inputFile: typescriptLib.typescriptMod.InputFiles,
    `type`: gulpDashTypescriptLib.gulpDashTypescriptLibStrings.JS
  ): typescriptLib.typescriptMod.UnparsedSource = js.native
  @JSName("createUnparsedSourceFile")
  def createUnparsedSourceFile_js(
    inputFile: typescriptLib.typescriptMod.InputFiles,
    `type`: gulpDashTypescriptLib.gulpDashTypescriptLibStrings.JS,
    stripInternal: scala.Boolean
  ): typescriptLib.typescriptMod.UnparsedSource = js.native
  def createVariableDeclaration(name: java.lang.String): typescriptLib.typescriptMod.VariableDeclaration = js.native
  def createVariableDeclaration(name: java.lang.String, `type`: typescriptLib.typescriptMod.TypeNode): typescriptLib.typescriptMod.VariableDeclaration = js.native
  def createVariableDeclaration(
    name: java.lang.String,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.VariableDeclaration = js.native
  def createVariableDeclaration(name: typescriptLib.typescriptMod.BindingName): typescriptLib.typescriptMod.VariableDeclaration = js.native
  def createVariableDeclaration(name: typescriptLib.typescriptMod.BindingName, `type`: typescriptLib.typescriptMod.TypeNode): typescriptLib.typescriptMod.VariableDeclaration = js.native
  def createVariableDeclaration(
    name: typescriptLib.typescriptMod.BindingName,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.VariableDeclaration = js.native
  def createVariableDeclarationList(declarations: js.Array[typescriptLib.typescriptMod.VariableDeclaration]): typescriptLib.typescriptMod.VariableDeclarationList = js.native
  def createVariableDeclarationList(
    declarations: js.Array[typescriptLib.typescriptMod.VariableDeclaration],
    flags: typescriptLib.typescriptMod.NodeFlags
  ): typescriptLib.typescriptMod.VariableDeclarationList = js.native
  def createVariableStatement(
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    declarationList: js.Array[typescriptLib.typescriptMod.VariableDeclaration]
  ): typescriptLib.typescriptMod.VariableStatement = js.native
  def createVariableStatement(
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    declarationList: typescriptLib.typescriptMod.VariableDeclarationList
  ): typescriptLib.typescriptMod.VariableStatement = js.native
  def createVariableStatement(
    modifiers: js.UndefOr[scala.Nothing],
    declarationList: js.Array[typescriptLib.typescriptMod.VariableDeclaration]
  ): typescriptLib.typescriptMod.VariableStatement = js.native
  def createVariableStatement(
    modifiers: js.UndefOr[scala.Nothing],
    declarationList: typescriptLib.typescriptMod.VariableDeclarationList
  ): typescriptLib.typescriptMod.VariableStatement = js.native
  def createVoid(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.VoidExpression = js.native
  def createVoidZero(): typescriptLib.typescriptMod.VoidExpression = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: js.UndefOr[scala.Nothing],
    system: typescriptLib.typescriptMod.System
  ): typescriptLib.typescriptMod.WatchCompilerHostOfConfigFile[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: js.UndefOr[scala.Nothing],
    system: typescriptLib.typescriptMod.System,
    createProgram: typescriptLib.typescriptMod.CreateProgram[T]
  ): typescriptLib.typescriptMod.WatchCompilerHostOfConfigFile[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: js.UndefOr[scala.Nothing],
    system: typescriptLib.typescriptMod.System,
    createProgram: typescriptLib.typescriptMod.CreateProgram[T],
    reportDiagnostic: typescriptLib.typescriptMod.DiagnosticReporter
  ): typescriptLib.typescriptMod.WatchCompilerHostOfConfigFile[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: js.UndefOr[scala.Nothing],
    system: typescriptLib.typescriptMod.System,
    createProgram: typescriptLib.typescriptMod.CreateProgram[T],
    reportDiagnostic: typescriptLib.typescriptMod.DiagnosticReporter,
    reportWatchStatus: typescriptLib.typescriptMod.WatchStatusReporter
  ): typescriptLib.typescriptMod.WatchCompilerHostOfConfigFile[T] = js.native
  /**
    * Create the watch compiler host for either configFile or fileNames and its options
    */
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: typescriptLib.typescriptMod.CompilerOptions,
    system: typescriptLib.typescriptMod.System
  ): typescriptLib.typescriptMod.WatchCompilerHostOfConfigFile[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: typescriptLib.typescriptMod.CompilerOptions,
    system: typescriptLib.typescriptMod.System,
    createProgram: typescriptLib.typescriptMod.CreateProgram[T]
  ): typescriptLib.typescriptMod.WatchCompilerHostOfConfigFile[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: typescriptLib.typescriptMod.CompilerOptions,
    system: typescriptLib.typescriptMod.System,
    createProgram: typescriptLib.typescriptMod.CreateProgram[T],
    reportDiagnostic: typescriptLib.typescriptMod.DiagnosticReporter
  ): typescriptLib.typescriptMod.WatchCompilerHostOfConfigFile[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: typescriptLib.typescriptMod.CompilerOptions,
    system: typescriptLib.typescriptMod.System,
    createProgram: typescriptLib.typescriptMod.CreateProgram[T],
    reportDiagnostic: typescriptLib.typescriptMod.DiagnosticReporter,
    reportWatchStatus: typescriptLib.typescriptMod.WatchStatusReporter
  ): typescriptLib.typescriptMod.WatchCompilerHostOfConfigFile[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.BuilderProgram */](
    rootFiles: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.CompilerOptions,
    system: typescriptLib.typescriptMod.System
  ): typescriptLib.typescriptMod.WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.BuilderProgram */](
    rootFiles: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.CompilerOptions,
    system: typescriptLib.typescriptMod.System,
    createProgram: typescriptLib.typescriptMod.CreateProgram[T]
  ): typescriptLib.typescriptMod.WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.BuilderProgram */](
    rootFiles: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.CompilerOptions,
    system: typescriptLib.typescriptMod.System,
    createProgram: typescriptLib.typescriptMod.CreateProgram[T],
    reportDiagnostic: typescriptLib.typescriptMod.DiagnosticReporter
  ): typescriptLib.typescriptMod.WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.BuilderProgram */](
    rootFiles: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.CompilerOptions,
    system: typescriptLib.typescriptMod.System,
    createProgram: typescriptLib.typescriptMod.CreateProgram[T],
    reportDiagnostic: typescriptLib.typescriptMod.DiagnosticReporter,
    reportWatchStatus: typescriptLib.typescriptMod.WatchStatusReporter
  ): typescriptLib.typescriptMod.WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.BuilderProgram */](
    rootFiles: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.CompilerOptions,
    system: typescriptLib.typescriptMod.System,
    createProgram: typescriptLib.typescriptMod.CreateProgram[T],
    reportDiagnostic: typescriptLib.typescriptMod.DiagnosticReporter,
    reportWatchStatus: typescriptLib.typescriptMod.WatchStatusReporter,
    projectReferences: js.Array[typescriptLib.typescriptMod.ProjectReference]
  ): typescriptLib.typescriptMod.WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  /**
    * Creates the watch from the host for config file
    */
  def createWatchProgram[T /* <: typescriptLib.typescriptMod.BuilderProgram */](host: typescriptLib.typescriptMod.WatchCompilerHostOfConfigFile[T]): typescriptLib.typescriptMod.WatchOfConfigFile[T] = js.native
  /**
    * Creates the watch from the host for root files and compiler options
    */
  def createWatchProgram[T /* <: typescriptLib.typescriptMod.BuilderProgram */](host: typescriptLib.typescriptMod.WatchCompilerHostOfFilesAndCompilerOptions[T]): typescriptLib.typescriptMod.WatchOfFilesAndCompilerOptions[T] = js.native
  def createWhile(
    expression: typescriptLib.typescriptMod.Expression,
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.WhileStatement = js.native
  def createWith(
    expression: typescriptLib.typescriptMod.Expression,
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.WithStatement = js.native
  def createYield(): typescriptLib.typescriptMod.YieldExpression = js.native
  def createYield(asteriskToken: js.UndefOr[scala.Nothing], expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.YieldExpression = js.native
  def createYield(
    asteriskToken: typescriptLib.typescriptMod.AsteriskToken,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.YieldExpression = js.native
  def createYield(expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.YieldExpression = js.native
  def decodedTextSpanIntersectsWith(start1: scala.Double, length1: scala.Double, start2: scala.Double, length2: scala.Double): scala.Boolean = js.native
  def displayPartsToString(): java.lang.String = js.native
  def displayPartsToString(displayParts: js.Array[typescriptLib.typescriptMod.SymbolDisplayPart]): java.lang.String = js.native
  /**
    * Clears any EmitNode entries from parse-tree nodes.
    * @param sourceFile A source file.
    */
  def disposeEmitNodes(sourceFile: typescriptLib.typescriptMod.SourceFile): scala.Unit = js.native
  /** Add an extra underscore to identifiers that start with two underscores to avoid issues with magic names like '__proto__' */
  def escapeLeadingUnderscores(identifier: java.lang.String): typescriptLib.typescriptMod.__String = js.native
  def findConfigFile(
    searchPath: java.lang.String,
    fileExists: js.Function1[/* fileName */ java.lang.String, scala.Boolean]
  ): js.UndefOr[java.lang.String] = js.native
  def findConfigFile(
    searchPath: java.lang.String,
    fileExists: js.Function1[/* fileName */ java.lang.String, scala.Boolean],
    configName: java.lang.String
  ): js.UndefOr[java.lang.String] = js.native
  def flattenDiagnosticMessageText(messageText: java.lang.String, newLine: java.lang.String): java.lang.String = js.native
  def flattenDiagnosticMessageText(messageText: js.UndefOr[scala.Nothing], newLine: java.lang.String): java.lang.String = js.native
  def flattenDiagnosticMessageText(messageText: typescriptLib.typescriptMod.DiagnosticMessageChain, newLine: java.lang.String): java.lang.String = js.native
  /**
    * Invokes a callback for each child of the given node. The 'cbNode' callback is invoked for all child nodes
    * stored in properties. If a 'cbNodes' callback is specified, it is invoked for embedded arrays; otherwise,
    * embedded arrays are flattened and the 'cbNode' callback is invoked for each element. If a callback returns
    * a truthy value, iteration stops and that value is returned. Otherwise, undefined is returned.
    *
    * @param node a given node to visit its children
    * @param cbNode a callback to be invoked for all child nodes
    * @param cbNodes a callback to be invoked for embedded array
    *
    * @remarks `forEachChild` must visit the children of a node in the order
    * that they appear in the source code. The language service depends on this property to locate nodes by position.
    */
  def forEachChild[T](
    node: typescriptLib.typescriptMod.Node,
    cbNode: js.Function1[/* node */ typescriptLib.typescriptMod.Node, js.UndefOr[T]]
  ): js.UndefOr[T] = js.native
  def forEachChild[T](
    node: typescriptLib.typescriptMod.Node,
    cbNode: js.Function1[/* node */ typescriptLib.typescriptMod.Node, js.UndefOr[T]],
    cbNodes: js.Function1[
      /* nodes */ typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.Node], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[T] = js.native
  def forEachLeadingCommentRange[U](
    text: java.lang.String,
    pos: scala.Double,
    cb: js.Function4[
      /* pos */ scala.Double, 
      /* end */ scala.Double, 
      /* kind */ typescriptLib.typescriptMod.CommentKind, 
      /* hasTrailingNewLine */ scala.Boolean, 
      U
    ]
  ): js.UndefOr[U] = js.native
  def forEachLeadingCommentRange[T, U](
    text: java.lang.String,
    pos: scala.Double,
    cb: js.Function5[
      /* pos */ scala.Double, 
      /* end */ scala.Double, 
      /* kind */ typescriptLib.typescriptMod.CommentKind, 
      /* hasTrailingNewLine */ scala.Boolean, 
      /* state */ T, 
      U
    ],
    state: T
  ): js.UndefOr[U] = js.native
  def forEachTrailingCommentRange[U](
    text: java.lang.String,
    pos: scala.Double,
    cb: js.Function4[
      /* pos */ scala.Double, 
      /* end */ scala.Double, 
      /* kind */ typescriptLib.typescriptMod.CommentKind, 
      /* hasTrailingNewLine */ scala.Boolean, 
      U
    ]
  ): js.UndefOr[U] = js.native
  def forEachTrailingCommentRange[T, U](
    text: java.lang.String,
    pos: scala.Double,
    cb: js.Function5[
      /* pos */ scala.Double, 
      /* end */ scala.Double, 
      /* kind */ typescriptLib.typescriptMod.CommentKind, 
      /* hasTrailingNewLine */ scala.Boolean, 
      /* state */ T, 
      U
    ],
    state: T
  ): js.UndefOr[U] = js.native
  def formatDiagnostic(
    diagnostic: typescriptLib.typescriptMod.Diagnostic,
    host: typescriptLib.typescriptMod.FormatDiagnosticsHost
  ): java.lang.String = js.native
  def formatDiagnostics(
    diagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic],
    host: typescriptLib.typescriptMod.FormatDiagnosticsHost
  ): java.lang.String = js.native
  def formatDiagnosticsWithColorAndContext(
    diagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic],
    host: typescriptLib.typescriptMod.FormatDiagnosticsHost
  ): java.lang.String = js.native
  def generateTypesForGlobal(
    name: java.lang.String,
    globalValue: js.Any,
    formatSettings: typescriptLib.typescriptMod.FormatCodeSettings
  ): java.lang.String = js.native
  def generateTypesForModule(
    name: java.lang.String,
    moduleValue: js.Any,
    formatSettings: typescriptLib.typescriptMod.FormatCodeSettings
  ): java.lang.String = js.native
  /** Gets all JSDoc tags of a specified kind, or undefined if not present. */
  def getAllJSDocTagsOfKind(node: typescriptLib.typescriptMod.Node, kind: typescriptLib.typescriptMod.SyntaxKind): js.Array[typescriptLib.typescriptMod.JSDocTag] = js.native
  /**
    * Given a set of options, returns the set of type directive names
    *   that should be included for this program automatically.
    * This list could either come from the config file,
    *   or from enumerating the types root + initial secondary types lookup location.
    * More type directives might appear in the program later as a result of loading actual source files;
    *   this list is only the set of defaults that are implicitly included.
    */
  def getAutomaticTypeDirectiveNames(
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.ModuleResolutionHost
  ): js.Array[java.lang.String] = js.native
  def getCombinedModifierFlags(node: typescriptLib.typescriptMod.Declaration): typescriptLib.typescriptMod.ModifierFlags = js.native
  def getCombinedNodeFlags(node: typescriptLib.typescriptMod.Node): typescriptLib.typescriptMod.NodeFlags = js.native
  /**
    * Gets a custom text range to use when emitting comments.
    */
  def getCommentRange(node: typescriptLib.typescriptMod.Node): typescriptLib.typescriptMod.TextRange = js.native
  def getConfigFileParsingDiagnostics(configFileParseResult: typescriptLib.typescriptMod.ParsedCommandLine): js.Array[typescriptLib.typescriptMod.Diagnostic] = js.native
  def getConstantValue(node: typescriptLib.typescriptMod.ElementAccessExpression): js.UndefOr[java.lang.String | scala.Double] = js.native
  /**
    * Gets the constant value to emit for an expression.
    */
  def getConstantValue(node: typescriptLib.typescriptMod.PropertyAccessExpression): js.UndefOr[java.lang.String | scala.Double] = js.native
  def getDefaultCompilerOptions(): typescriptLib.typescriptMod.CompilerOptions = js.native
  def getDefaultFormatCodeSettings(): typescriptLib.typescriptMod.FormatCodeSettings = js.native
  def getDefaultFormatCodeSettings(newLineCharacter: java.lang.String): typescriptLib.typescriptMod.FormatCodeSettings = js.native
  def getDefaultLibFileName(options: typescriptLib.typescriptMod.CompilerOptions): java.lang.String = js.native
  /**
    * Get the path of the default library files (lib.d.ts) as distributed with the typescript
    * node package.
    * The functionality is not supported if the ts module is consumed outside of a node module.
    */
  def getDefaultLibFilePath(options: typescriptLib.typescriptMod.CompilerOptions): java.lang.String = js.native
  def getEffectiveConstraintOfTypeParameter(node: typescriptLib.typescriptMod.TypeParameterDeclaration): js.UndefOr[typescriptLib.typescriptMod.TypeNode] = js.native
  /**
    * Gets the effective type parameters. If the node was parsed in a
    * JavaScript file, gets the type parameters from the `@template` tag from JSDoc.
    */
  def getEffectiveTypeParameterDeclarations(node: typescriptLib.typescriptMod.DeclarationWithTypeParameters): js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration] = js.native
  def getEffectiveTypeRoots(
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.GetEffectiveTypeRootsHost
  ): js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * Gets the EmitHelpers of a node.
    */
  def getEmitHelpers(node: typescriptLib.typescriptMod.Node): js.UndefOr[js.Array[typescriptLib.typescriptMod.EmitHelper]] = js.native
  def getGeneratedNameForNode(): typescriptLib.typescriptMod.Identifier = js.native
  /** Create a unique name generated for a node. */
  def getGeneratedNameForNode(node: typescriptLib.typescriptMod.Node): typescriptLib.typescriptMod.Identifier = js.native
  /** Gets the JSDoc augments tag for the node if present */
  def getJSDocAugmentsTag(node: typescriptLib.typescriptMod.Node): js.UndefOr[typescriptLib.typescriptMod.JSDocAugmentsTag] = js.native
  /** Gets the JSDoc class tag for the node if present */
  def getJSDocClassTag(node: typescriptLib.typescriptMod.Node): js.UndefOr[typescriptLib.typescriptMod.JSDocClassTag] = js.native
  /** Gets the JSDoc enum tag for the node if present */
  def getJSDocEnumTag(node: typescriptLib.typescriptMod.Node): js.UndefOr[typescriptLib.typescriptMod.JSDocEnumTag] = js.native
  /**
    * Gets the JSDoc parameter tags for the node if present.
    *
    * @remarks Returns any JSDoc param tag whose name matches the provided
    * parameter, whether a param tag on a containing function
    * expression, or a param tag on a variable declaration whose
    * initializer is the containing function. The tags closest to the
    * node are returned first, so in the previous example, the param
    * tag on the containing function expression would be first.
    *
    * For binding patterns, parameter tags are matched by position.
    */
  def getJSDocParameterTags(param: typescriptLib.typescriptMod.ParameterDeclaration): js.Array[typescriptLib.typescriptMod.JSDocParameterTag] = js.native
  /** Gets the JSDoc return tag for the node if present */
  def getJSDocReturnTag(node: typescriptLib.typescriptMod.Node): js.UndefOr[typescriptLib.typescriptMod.JSDocReturnTag] = js.native
  /**
    * Gets the return type node for the node if provided via JSDoc return tag or type tag.
    *
    * @remarks `getJSDocReturnTag` just gets the whole JSDoc tag. This function
    * gets the type from inside the braces, after the fat arrow, etc.
    */
  def getJSDocReturnType(node: typescriptLib.typescriptMod.Node): js.UndefOr[typescriptLib.typescriptMod.TypeNode] = js.native
  /** Get all JSDoc tags related to a node, including those on parent nodes. */
  def getJSDocTags(node: typescriptLib.typescriptMod.Node): js.Array[typescriptLib.typescriptMod.JSDocTag] = js.native
  /** Gets the JSDoc template tag for the node if present */
  def getJSDocTemplateTag(node: typescriptLib.typescriptMod.Node): js.UndefOr[typescriptLib.typescriptMod.JSDocTemplateTag] = js.native
  /** Gets the JSDoc this tag for the node if present */
  def getJSDocThisTag(node: typescriptLib.typescriptMod.Node): js.UndefOr[typescriptLib.typescriptMod.JSDocThisTag] = js.native
  /**
    * Gets the type node for the node if provided via JSDoc.
    *
    * @remarks The search includes any JSDoc param tag that relates
    * to the provided parameter, for example a type tag on the
    * parameter itself, or a param tag on a containing function
    * expression, or a param tag on a variable declaration whose
    * initializer is the containing function. The tags closest to the
    * node are examined first, so in the previous example, the type
    * tag directly on the node would be returned.
    */
  def getJSDocType(node: typescriptLib.typescriptMod.Node): js.UndefOr[typescriptLib.typescriptMod.TypeNode] = js.native
  /**
    * Gets the JSDoc type parameter tags for the node if present.
    *
    * @remarks Returns any JSDoc template tag whose names match the provided
    * parameter, whether a template tag on a containing function
    * expression, or a template tag on a variable declaration whose
    * initializer is the containing function. The tags closest to the
    * node are returned first, so in the previous example, the template
    * tag on the containing function expression would be first.
    */
  def getJSDocTypeParameterTags(param: typescriptLib.typescriptMod.TypeParameterDeclaration): js.Array[typescriptLib.typescriptMod.JSDocTemplateTag] = js.native
  /** Gets the JSDoc type tag for the node if present and valid */
  def getJSDocTypeTag(node: typescriptLib.typescriptMod.Node): js.UndefOr[typescriptLib.typescriptMod.JSDocTypeTag] = js.native
  def getLeadingCommentRanges(text: java.lang.String, pos: scala.Double): js.UndefOr[js.Array[typescriptLib.typescriptMod.CommentRange]] = js.native
  def getLineAndCharacterOfPosition(sourceFile: typescriptLib.typescriptMod.SourceFileLike, position: scala.Double): typescriptLib.typescriptMod.LineAndCharacter = js.native
  /**
    * Creates a shallow, memberwise clone of a node for mutation.
    */
  def getMutableClone[T /* <: typescriptLib.typescriptMod.Node */](node: T): T = js.native
  def getNameOfDeclaration(declaration: typescriptLib.typescriptMod.Declaration): js.UndefOr[typescriptLib.typescriptMod.DeclarationName] = js.native
  def getNameOfDeclaration(declaration: typescriptLib.typescriptMod.Expression): js.UndefOr[typescriptLib.typescriptMod.DeclarationName] = js.native
  def getNameOfJSDocTypedef(declaration: typescriptLib.typescriptMod.JSDocTypedefTag): js.UndefOr[typescriptLib.typescriptMod.Identifier] = js.native
  def getNodeMajorVersion(): js.UndefOr[scala.Double] = js.native
  def getOriginalNode(): js.UndefOr[typescriptLib.typescriptMod.Node] = js.native
  def getOriginalNode(node: typescriptLib.typescriptMod.Node): js.UndefOr[typescriptLib.typescriptMod.Node] = js.native
  def getOriginalNode[T /* <: typescriptLib.typescriptMod.Node */](
    node: js.UndefOr[scala.Nothing],
    nodeTest: js.Function1[/* node */ js.UndefOr[typescriptLib.typescriptMod.Node], /* is T */ scala.Boolean]
  ): js.UndefOr[T] = js.native
  def getOriginalNode[T /* <: typescriptLib.typescriptMod.Node */](
    node: typescriptLib.typescriptMod.Node,
    nodeTest: js.Function1[/* node */ typescriptLib.typescriptMod.Node, /* is T */ scala.Boolean]
  ): T = js.native
  @JSName("getOriginalNode")
  def getOriginalNode_Node(node: typescriptLib.typescriptMod.Node): typescriptLib.typescriptMod.Node = js.native
  @JSName("getOriginalNode")
  def getOriginalNode_TNodeUndefOr[T /* <: typescriptLib.typescriptMod.Node */](
    node: typescriptLib.typescriptMod.Node,
    nodeTest: js.Function1[/* node */ js.UndefOr[typescriptLib.typescriptMod.Node], /* is T */ scala.Boolean]
  ): js.UndefOr[T] = js.native
  /**
    * Gets the original parse tree node for a node.
    *
    * @param node The original node.
    * @returns The original parse tree node if found; otherwise, undefined.
    */
  def getParseTreeNode(node: typescriptLib.typescriptMod.Node): typescriptLib.typescriptMod.Node = js.native
  def getParseTreeNode[T /* <: typescriptLib.typescriptMod.Node */](): js.UndefOr[T] = js.native
  def getParseTreeNode[T /* <: typescriptLib.typescriptMod.Node */](
    node: js.UndefOr[scala.Nothing],
    nodeTest: js.Function1[/* node */ typescriptLib.typescriptMod.Node, /* is T */ scala.Boolean]
  ): js.UndefOr[T] = js.native
  def getParseTreeNode[T /* <: typescriptLib.typescriptMod.Node */](
    node: typescriptLib.typescriptMod.Node,
    nodeTest: js.Function1[/* node */ typescriptLib.typescriptMod.Node, /* is T */ scala.Boolean]
  ): js.UndefOr[T] = js.native
  /**
    * Gets the original parse tree node for a node.
    *
    * @param node The original node.
    * @param nodeTest A callback used to ensure the correct type of parse tree node is returned.
    * @returns The original parse tree node if found; otherwise, undefined.
    */
  @JSName("getParseTreeNode")
  def getParseTreeNode_TNodeUndefOr[T /* <: typescriptLib.typescriptMod.Node */](node: typescriptLib.typescriptMod.Node): js.UndefOr[T] = js.native
  /**
    * Reads the config file, reports errors if any and exits if the config file cannot be found
    */
  def getParsedCommandLineOfConfigFile(
    configFileName: java.lang.String,
    optionsToExtend: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.ParseConfigFileHost
  ): js.UndefOr[typescriptLib.typescriptMod.ParsedCommandLine] = js.native
  def getPositionOfLineAndCharacter(
    sourceFile: typescriptLib.typescriptMod.SourceFileLike,
    line: scala.Double,
    character: scala.Double
  ): scala.Double = js.native
  def getPreEmitDiagnostics(program: typescriptLib.typescriptMod.Program): js.Array[typescriptLib.typescriptMod.Diagnostic] = js.native
  def getPreEmitDiagnostics(program: typescriptLib.typescriptMod.Program, sourceFile: typescriptLib.typescriptMod.SourceFile): js.Array[typescriptLib.typescriptMod.Diagnostic] = js.native
  def getPreEmitDiagnostics(
    program: typescriptLib.typescriptMod.Program,
    sourceFile: typescriptLib.typescriptMod.SourceFile,
    cancellationToken: typescriptLib.typescriptMod.CancellationToken
  ): js.Array[typescriptLib.typescriptMod.Diagnostic] = js.native
  /** Optionally, get the shebang */
  def getShebang(text: java.lang.String): js.UndefOr[java.lang.String] = js.native
  /**
    * Gets a custom text range to use when emitting source maps.
    */
  def getSourceMapRange(node: typescriptLib.typescriptMod.Node): typescriptLib.typescriptMod.SourceMapRange = js.native
  def getSupportedCodeFixes(): js.Array[java.lang.String] = js.native
  def getSyntheticLeadingComments(node: typescriptLib.typescriptMod.Node): js.UndefOr[js.Array[typescriptLib.typescriptMod.SynthesizedComment]] = js.native
  def getSyntheticTrailingComments(node: typescriptLib.typescriptMod.Node): js.UndefOr[js.Array[typescriptLib.typescriptMod.SynthesizedComment]] = js.native
  /**
    * Gets the TextRange to use for source maps for a token of a node.
    */
  def getTokenSourceMapRange(node: typescriptLib.typescriptMod.Node, token: typescriptLib.typescriptMod.SyntaxKind): js.UndefOr[typescriptLib.typescriptMod.SourceMapRange] = js.native
  def getTrailingCommentRanges(text: java.lang.String, pos: scala.Double): js.UndefOr[js.Array[typescriptLib.typescriptMod.CommentRange]] = js.native
  def getTypeParameterOwner(d: typescriptLib.typescriptMod.Declaration): js.UndefOr[typescriptLib.typescriptMod.Declaration] = js.native
  /**
    * Return true if the node has JSDoc parameter tags.
    *
    * @remarks Includes parameter tags that are not directly on the node,
    * for example on a variable declaration whose initializer is a function expression.
    */
  def hasJSDocParameterTags(node: typescriptLib.typescriptMod.FunctionLikeDeclaration): scala.Boolean = js.native
  def hasJSDocParameterTags(node: typescriptLib.typescriptMod.SignatureDeclaration): scala.Boolean = js.native
  def idText(identifier: typescriptLib.typescriptMod.Identifier): java.lang.String = js.native
  def isAccessor(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.AccessorDeclaration */ scala.Boolean = js.native
  def isArrayBindingPattern(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ArrayBindingPattern */ scala.Boolean = js.native
  def isArrayLiteralExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ArrayLiteralExpression */ scala.Boolean = js.native
  def isArrayTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ArrayTypeNode */ scala.Boolean = js.native
  def isArrowFunction(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ArrowFunction */ scala.Boolean = js.native
  def isAsExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.AsExpression */ scala.Boolean = js.native
  def isAssertionExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.AssertionExpression */ scala.Boolean = js.native
  def isAwaitExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.AwaitExpression */ scala.Boolean = js.native
  def isBigIntLiteral(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.BigIntLiteral */ scala.Boolean = js.native
  def isBinaryExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.BinaryExpression */ scala.Boolean = js.native
  def isBindingElement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.BindingElement */ scala.Boolean = js.native
  def isBindingName(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.BindingName */ scala.Boolean = js.native
  def isBlock(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.Block */ scala.Boolean = js.native
  def isBreakOrContinueStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.BreakOrContinueStatement */ scala.Boolean = js.native
  def isBreakStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.BreakStatement */ scala.Boolean = js.native
  def isBundle(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.Bundle */ scala.Boolean = js.native
  def isCallExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.CallExpression */ scala.Boolean = js.native
  def isCallLikeExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.CallLikeExpression */ scala.Boolean = js.native
  def isCallOrNewExpression(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def isCallSignatureDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.CallSignatureDeclaration */ scala.Boolean = js.native
  def isCaseBlock(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.CaseBlock */ scala.Boolean = js.native
  def isCaseClause(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.CaseClause */ scala.Boolean = js.native
  def isCaseOrDefaultClause(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.CaseOrDefaultClause */ scala.Boolean = js.native
  def isCatchClause(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.CatchClause */ scala.Boolean = js.native
  def isClassDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ClassDeclaration */ scala.Boolean = js.native
  def isClassElement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ClassElement */ scala.Boolean = js.native
  def isClassExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ClassExpression */ scala.Boolean = js.native
  def isClassLike(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ClassLikeDeclaration */ scala.Boolean = js.native
  def isClassOrTypeElement(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def isComputedPropertyName(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ComputedPropertyName */ scala.Boolean = js.native
  def isConditionalExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ConditionalExpression */ scala.Boolean = js.native
  def isConditionalTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ConditionalTypeNode */ scala.Boolean = js.native
  def isConstTypeReference(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def isConstructSignatureDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ConstructSignatureDeclaration */ scala.Boolean = js.native
  def isConstructorDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ConstructorDeclaration */ scala.Boolean = js.native
  def isConstructorTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ConstructorTypeNode */ scala.Boolean = js.native
  def isContinueStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ContinueStatement */ scala.Boolean = js.native
  def isDebuggerStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.DebuggerStatement */ scala.Boolean = js.native
  def isDecorator(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.Decorator */ scala.Boolean = js.native
  def isDefaultClause(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.DefaultClause */ scala.Boolean = js.native
  def isDeleteExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.DeleteExpression */ scala.Boolean = js.native
  def isDoStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.DoStatement */ scala.Boolean = js.native
  def isElementAccessExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ElementAccessExpression */ scala.Boolean = js.native
  def isEmptyBindingElement(node: typescriptLib.typescriptMod.BindingElement): scala.Boolean = js.native
  def isEmptyBindingPattern(node: typescriptLib.typescriptMod.BindingName): /* is typescript.typescript.BindingPattern */ scala.Boolean = js.native
  def isEmptyStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.EmptyStatement */ scala.Boolean = js.native
  def isEntityName(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.EntityName */ scala.Boolean = js.native
  def isEnumDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.EnumDeclaration */ scala.Boolean = js.native
  def isEnumMember(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.EnumMember */ scala.Boolean = js.native
  def isExportAssignment(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ExportAssignment */ scala.Boolean = js.native
  def isExportDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ExportDeclaration */ scala.Boolean = js.native
  def isExportSpecifier(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ExportSpecifier */ scala.Boolean = js.native
  def isExpressionStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionWithTypeArguments(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ExpressionWithTypeArguments */ scala.Boolean = js.native
  def isExternalModule(file: typescriptLib.typescriptMod.SourceFile): scala.Boolean = js.native
  def isExternalModuleNameRelative(moduleName: java.lang.String): scala.Boolean = js.native
  def isExternalModuleReference(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ExternalModuleReference */ scala.Boolean = js.native
  def isForInStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ForInStatement */ scala.Boolean = js.native
  def isForOfStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ForOfStatement */ scala.Boolean = js.native
  def isForStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ForStatement */ scala.Boolean = js.native
  def isFunctionDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.FunctionExpression */ scala.Boolean = js.native
  def isFunctionLike(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.SignatureDeclaration */ scala.Boolean = js.native
  def isFunctionOrConstructorTypeNode(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def isFunctionTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.FunctionTypeNode */ scala.Boolean = js.native
  def isGetAccessor(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.GetAccessorDeclaration */ scala.Boolean = js.native
  def isGetAccessorDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.GetAccessorDeclaration */ scala.Boolean = js.native
  def isHeritageClause(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.HeritageClause */ scala.Boolean = js.native
  def isIdentifier(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.Identifier */ scala.Boolean = js.native
  def isIdentifierPart(ch: scala.Double): scala.Boolean = js.native
  def isIdentifierPart(ch: scala.Double, languageVersion: typescriptLib.typescriptMod.ScriptTarget): scala.Boolean = js.native
  def isIdentifierStart(ch: scala.Double): scala.Boolean = js.native
  def isIdentifierStart(ch: scala.Double, languageVersion: typescriptLib.typescriptMod.ScriptTarget): scala.Boolean = js.native
  def isIfStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.IfStatement */ scala.Boolean = js.native
  def isImportClause(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ImportClause */ scala.Boolean = js.native
  def isImportDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ImportDeclaration */ scala.Boolean = js.native
  def isImportEqualsDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ImportEqualsDeclaration */ scala.Boolean = js.native
  def isImportOrExportSpecifier(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def isImportSpecifier(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ImportSpecifier */ scala.Boolean = js.native
  def isImportTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ImportTypeNode */ scala.Boolean = js.native
  def isIndexSignatureDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.IndexSignatureDeclaration */ scala.Boolean = js.native
  def isIndexedAccessTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.IndexedAccessTypeNode */ scala.Boolean = js.native
  def isInferTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.InferTypeNode */ scala.Boolean = js.native
  def isInterfaceDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.InterfaceDeclaration */ scala.Boolean = js.native
  def isIntersectionTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.IntersectionTypeNode */ scala.Boolean = js.native
  def isIterationStatement(
    node: typescriptLib.typescriptMod.Node,
    lookInLabeledStatements: gulpDashTypescriptLib.gulpDashTypescriptLibNumbers.`false`
  ): /* is typescript.typescript.IterationStatement */ scala.Boolean = js.native
  def isIterationStatement(node: typescriptLib.typescriptMod.Node, lookInLabeledStatements: scala.Boolean): scala.Boolean = js.native
  def isJSDoc(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDoc */ scala.Boolean = js.native
  def isJSDocAllType(node: typescriptLib.typescriptMod.JSDocAllType): /* is typescript.typescript.JSDocAllType */ scala.Boolean = js.native
  def isJSDocAugmentsTag(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDocAugmentsTag */ scala.Boolean = js.native
  def isJSDocCallbackTag(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDocCallbackTag */ scala.Boolean = js.native
  def isJSDocClassTag(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDocClassTag */ scala.Boolean = js.native
  /** True if node is of a kind that may contain comment text. */
  def isJSDocCommentContainingNode(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def isJSDocEnumTag(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDocEnumTag */ scala.Boolean = js.native
  def isJSDocFunctionType(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDocFunctionType */ scala.Boolean = js.native
  def isJSDocNonNullableType(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDocNonNullableType */ scala.Boolean = js.native
  def isJSDocNullableType(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDocNullableType */ scala.Boolean = js.native
  def isJSDocOptionalType(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDocOptionalType */ scala.Boolean = js.native
  def isJSDocParameterTag(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDocParameterTag */ scala.Boolean = js.native
  def isJSDocPropertyLikeTag(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDocPropertyLikeTag */ scala.Boolean = js.native
  def isJSDocPropertyTag(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDocPropertyTag */ scala.Boolean = js.native
  def isJSDocReturnTag(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDocReturnTag */ scala.Boolean = js.native
  def isJSDocSignature(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDocSignature */ scala.Boolean = js.native
  def isJSDocTemplateTag(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDocTemplateTag */ scala.Boolean = js.native
  def isJSDocThisTag(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDocThisTag */ scala.Boolean = js.native
  def isJSDocTypeExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDocTypeExpression */ scala.Boolean = js.native
  def isJSDocTypeLiteral(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDocTypeLiteral */ scala.Boolean = js.native
  def isJSDocTypeTag(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDocTypeTag */ scala.Boolean = js.native
  def isJSDocTypedefTag(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDocTypedefTag */ scala.Boolean = js.native
  def isJSDocUnknownType(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDocUnknownType */ scala.Boolean = js.native
  def isJSDocVariadicType(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDocVariadicType */ scala.Boolean = js.native
  def isJsxAttribute(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxAttribute */ scala.Boolean = js.native
  def isJsxAttributes(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxAttributes */ scala.Boolean = js.native
  def isJsxClosingElement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxClosingElement */ scala.Boolean = js.native
  def isJsxClosingFragment(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxClosingFragment */ scala.Boolean = js.native
  def isJsxElement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxElement */ scala.Boolean = js.native
  def isJsxExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxExpression */ scala.Boolean = js.native
  def isJsxFragment(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxFragment */ scala.Boolean = js.native
  def isJsxOpeningElement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxOpeningElement */ scala.Boolean = js.native
  def isJsxOpeningFragment(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxOpeningFragment */ scala.Boolean = js.native
  def isJsxOpeningLikeElement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxOpeningLikeElement */ scala.Boolean = js.native
  def isJsxSelfClosingElement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxSelfClosingElement */ scala.Boolean = js.native
  def isJsxSpreadAttribute(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxSpreadAttribute */ scala.Boolean = js.native
  def isJsxText(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxText */ scala.Boolean = js.native
  def isLabeledStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.LabeledStatement */ scala.Boolean = js.native
  def isLineBreak(ch: scala.Double): scala.Boolean = js.native
  def isLiteralExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.LiteralExpression */ scala.Boolean = js.native
  def isLiteralTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.LiteralTypeNode */ scala.Boolean = js.native
  def isMappedTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.MappedTypeNode */ scala.Boolean = js.native
  def isMetaProperty(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.MetaProperty */ scala.Boolean = js.native
  def isMethodDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.MethodDeclaration */ scala.Boolean = js.native
  def isMethodSignature(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.MethodSignature */ scala.Boolean = js.native
  def isMissingDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.MissingDeclaration */ scala.Boolean = js.native
  def isModifier(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.Modifier */ scala.Boolean = js.native
  def isModuleBlock(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ModuleBlock */ scala.Boolean = js.native
  def isModuleDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ModuleDeclaration */ scala.Boolean = js.native
  def isNamedExports(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.NamedExports */ scala.Boolean = js.native
  def isNamedImports(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.NamedImports */ scala.Boolean = js.native
  def isNamespaceExportDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.NamespaceExportDeclaration */ scala.Boolean = js.native
  def isNamespaceImport(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.NamespaceImport */ scala.Boolean = js.native
  def isNewExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.NewExpression */ scala.Boolean = js.native
  def isNoSubstitutionTemplateLiteral(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.NoSubstitutionTemplateLiteral */ scala.Boolean = js.native
  def isNonNullExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.NonNullExpression */ scala.Boolean = js.native
  def isNumericLiteral(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.NumericLiteral */ scala.Boolean = js.native
  def isObjectBindingPattern(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ObjectBindingPattern */ scala.Boolean = js.native
  def isObjectLiteralElement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ObjectLiteralElement */ scala.Boolean = js.native
  def isObjectLiteralElementLike(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ObjectLiteralElementLike */ scala.Boolean = js.native
  def isObjectLiteralExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ObjectLiteralExpression */ scala.Boolean = js.native
  def isOmittedExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.OmittedExpression */ scala.Boolean = js.native
  def isParameter(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ParameterDeclaration */ scala.Boolean = js.native
  def isParameterPropertyDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ParameterPropertyDeclaration */ scala.Boolean = js.native
  def isParenthesizedExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ParenthesizedExpression */ scala.Boolean = js.native
  def isParenthesizedTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ParenthesizedTypeNode */ scala.Boolean = js.native
  /**
    * Gets a value indicating whether a node originated in the parse tree.
    *
    * @param node The node to test.
    */
  def isParseTreeNode(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def isPostfixUnaryExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.PostfixUnaryExpression */ scala.Boolean = js.native
  def isPrefixUnaryExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.PrefixUnaryExpression */ scala.Boolean = js.native
  def isPropertyAccessExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.PropertyAccessExpression */ scala.Boolean = js.native
  def isPropertyAccessOrQualifiedName(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def isPropertyAssignment(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.PropertyAssignment */ scala.Boolean = js.native
  def isPropertyDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.PropertyDeclaration */ scala.Boolean = js.native
  def isPropertyName(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.PropertyName */ scala.Boolean = js.native
  def isPropertySignature(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.PropertySignature */ scala.Boolean = js.native
  def isQualifiedName(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.QualifiedName */ scala.Boolean = js.native
  def isRegularExpressionLiteral(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.RegularExpressionLiteral */ scala.Boolean = js.native
  def isReturnStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ReturnStatement */ scala.Boolean = js.native
  def isSemicolonClassElement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.SemicolonClassElement */ scala.Boolean = js.native
  def isSetAccessor(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.SetAccessorDeclaration */ scala.Boolean = js.native
  def isSetAccessorDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.SetAccessorDeclaration */ scala.Boolean = js.native
  def isShorthandPropertyAssignment(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ShorthandPropertyAssignment */ scala.Boolean = js.native
  def isSourceFile(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.SourceFile */ scala.Boolean = js.native
  def isSpreadAssignment(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.SpreadAssignment */ scala.Boolean = js.native
  def isSpreadElement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.SpreadElement */ scala.Boolean = js.native
  def isStringLiteral(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.StringLiteral */ scala.Boolean = js.native
  def isStringLiteralLike(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.StringLiteralLike */ scala.Boolean = js.native
  def isStringTextContainingNode(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def isSwitchStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.SwitchStatement */ scala.Boolean = js.native
  def isTaggedTemplateExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTemplateExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TemplateExpression */ scala.Boolean = js.native
  def isTemplateHead(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TemplateHead */ scala.Boolean = js.native
  def isTemplateLiteral(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TemplateLiteral */ scala.Boolean = js.native
  def isTemplateLiteralToken(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TemplateLiteralToken */ scala.Boolean = js.native
  def isTemplateMiddle(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TemplateMiddle */ scala.Boolean = js.native
  def isTemplateMiddleOrTemplateTail(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def isTemplateSpan(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TemplateSpan */ scala.Boolean = js.native
  def isTemplateTail(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TemplateTail */ scala.Boolean = js.native
  def isThisTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ThisTypeNode */ scala.Boolean = js.native
  def isThrowStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ThrowStatement */ scala.Boolean = js.native
  /**
    * True if node is of some token syntax kind.
    * For example, this is true for an IfKeyword but not for an IfStatement.
    * Literals are considered tokens, except TemplateLiteral, but does include TemplateHead/Middle/Tail.
    */
  def isToken(n: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def isTryStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TryStatement */ scala.Boolean = js.native
  def isTupleTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TupleTypeNode */ scala.Boolean = js.native
  def isTypeAliasDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TypeAliasDeclaration */ scala.Boolean = js.native
  def isTypeAssertion(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TypeAssertion */ scala.Boolean = js.native
  def isTypeElement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TypeElement */ scala.Boolean = js.native
  def isTypeLiteralNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TypeLiteralNode */ scala.Boolean = js.native
  /**
    * Node test that determines whether a node is a valid type node.
    * This differs from the `isPartOfTypeNode` function which determines whether a node is *part*
    * of a TypeNode.
    */
  def isTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TypeNode */ scala.Boolean = js.native
  def isTypeOfExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TypeOfExpression */ scala.Boolean = js.native
  def isTypeOperatorNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TypeOperatorNode */ scala.Boolean = js.native
  def isTypeParameterDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypePredicateNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TypePredicateNode */ scala.Boolean = js.native
  def isTypeQueryNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TypeQueryNode */ scala.Boolean = js.native
  def isTypeReferenceNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TypeReferenceNode */ scala.Boolean = js.native
  def isUnionTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.UnionTypeNode */ scala.Boolean = js.native
  def isUnparsedNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.UnparsedNode */ scala.Boolean = js.native
  def isUnparsedPrepend(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.UnparsedPrepend */ scala.Boolean = js.native
  def isUnparsedSource(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.UnparsedSource */ scala.Boolean = js.native
  def isUnparsedTextLike(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.UnparsedTextLike */ scala.Boolean = js.native
  def isVariableDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclarationList(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.VariableDeclarationList */ scala.Boolean = js.native
  def isVariableStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.VariableStatement */ scala.Boolean = js.native
  def isVoidExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.VoidExpression */ scala.Boolean = js.native
  def isWhileStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.WhileStatement */ scala.Boolean = js.native
  def isWhiteSpaceLike(ch: scala.Double): scala.Boolean = js.native
  /** Does not include line breaks. For that, see isWhiteSpaceLike. */
  def isWhiteSpaceSingleLine(ch: scala.Double): scala.Boolean = js.native
  def isWithStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.WithStatement */ scala.Boolean = js.native
  def isYieldExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.YieldExpression */ scala.Boolean = js.native
  /**
    * Moves matching emit helpers from a source node to a target node.
    */
  def moveEmitHelpers(
    source: typescriptLib.typescriptMod.Node,
    target: typescriptLib.typescriptMod.Node,
    predicate: js.Function1[/* helper */ typescriptLib.typescriptMod.EmitHelper, scala.Boolean]
  ): scala.Unit = js.native
  def moveSyntheticComments[T /* <: typescriptLib.typescriptMod.Node */](node: T, original: typescriptLib.typescriptMod.Node): T = js.native
  def nodeModuleNameResolver(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.ModuleResolutionHost
  ): typescriptLib.typescriptMod.ResolvedModuleWithFailedLookupLocations = js.native
  def nodeModuleNameResolver(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.ModuleResolutionHost,
    cache: typescriptLib.typescriptMod.ModuleResolutionCache
  ): typescriptLib.typescriptMod.ResolvedModuleWithFailedLookupLocations = js.native
  def nodeModuleNameResolver(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.ModuleResolutionHost,
    cache: typescriptLib.typescriptMod.ModuleResolutionCache,
    redirectedReference: typescriptLib.typescriptMod.ResolvedProjectReference
  ): typescriptLib.typescriptMod.ResolvedModuleWithFailedLookupLocations = js.native
  def parseCommandLine(commandLine: js.Array[java.lang.String]): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  def parseCommandLine(
    commandLine: js.Array[java.lang.String],
    readFile: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]]
  ): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  /**
    * Parse the text of the tsconfig.json file
    * @param fileName The path to the config file
    * @param jsonText The text of the config file
    */
  def parseConfigFileTextToJson(fileName: java.lang.String, jsonText: java.lang.String): typescriptLib.Anon_Config = js.native
  def parseIsolatedEntityName(text: java.lang.String, languageVersion: typescriptLib.typescriptMod.ScriptTarget): js.UndefOr[typescriptLib.typescriptMod.EntityName] = js.native
  /**
    * Parse the contents of a config file (tsconfig.json).
    * @param json The contents of the config file to parse
    * @param host Instance of ParseConfigHost used to enumerate files in folder.
    * @param basePath A root directory to resolve relative path entries in the config
    *    file to. e.g. outDir
    */
  def parseJsonConfigFileContent(json: js.Any, host: typescriptLib.typescriptMod.ParseConfigHost, basePath: java.lang.String): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: typescriptLib.typescriptMod.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.CompilerOptions
  ): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: typescriptLib.typescriptMod.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.CompilerOptions,
    configFileName: java.lang.String
  ): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: typescriptLib.typescriptMod.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[typescriptLib.typescriptMod.Path]
  ): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: typescriptLib.typescriptMod.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[typescriptLib.typescriptMod.Path],
    extraFileExtensions: js.Array[typescriptLib.typescriptMod.FileExtensionInfo]
  ): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  /**
    * Parse the contents of a config file (tsconfig.json).
    * @param jsonNode The contents of the config file to parse
    * @param host Instance of ParseConfigHost used to enumerate files in folder.
    * @param basePath A root directory to resolve relative path entries in the config
    *    file to. e.g. outDir
    */
  def parseJsonSourceFileConfigFileContent(
    sourceFile: typescriptLib.typescriptMod.TsConfigSourceFile,
    host: typescriptLib.typescriptMod.ParseConfigHost,
    basePath: java.lang.String
  ): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  def parseJsonSourceFileConfigFileContent(
    sourceFile: typescriptLib.typescriptMod.TsConfigSourceFile,
    host: typescriptLib.typescriptMod.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.CompilerOptions
  ): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  def parseJsonSourceFileConfigFileContent(
    sourceFile: typescriptLib.typescriptMod.TsConfigSourceFile,
    host: typescriptLib.typescriptMod.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.CompilerOptions,
    configFileName: java.lang.String
  ): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  def parseJsonSourceFileConfigFileContent(
    sourceFile: typescriptLib.typescriptMod.TsConfigSourceFile,
    host: typescriptLib.typescriptMod.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[typescriptLib.typescriptMod.Path]
  ): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  def parseJsonSourceFileConfigFileContent(
    sourceFile: typescriptLib.typescriptMod.TsConfigSourceFile,
    host: typescriptLib.typescriptMod.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[typescriptLib.typescriptMod.Path],
    extraFileExtensions: js.Array[typescriptLib.typescriptMod.FileExtensionInfo]
  ): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  /**
    * Parse json text into SyntaxTree and return node and parse errors if any
    * @param fileName
    * @param sourceText
    */
  def parseJsonText(fileName: java.lang.String, sourceText: java.lang.String): typescriptLib.typescriptMod.JsonSourceFile = js.native
  def preProcessFile(sourceText: java.lang.String): typescriptLib.typescriptMod.PreProcessedFileInfo = js.native
  def preProcessFile(sourceText: java.lang.String, readImportFiles: scala.Boolean): typescriptLib.typescriptMod.PreProcessedFileInfo = js.native
  def preProcessFile(
    sourceText: java.lang.String,
    readImportFiles: scala.Boolean,
    detectJavaScriptImports: scala.Boolean
  ): typescriptLib.typescriptMod.PreProcessedFileInfo = js.native
  /**
    * Read tsconfig.json file
    * @param fileName The path to the config file
    */
  def readConfigFile(
    fileName: java.lang.String,
    readFile: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]]
  ): typescriptLib.Anon_Config = js.native
  /**
    * Read tsconfig.json file
    * @param fileName The path to the config file
    */
  def readJsonConfigFile(
    fileName: java.lang.String,
    readFile: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]]
  ): typescriptLib.typescriptMod.TsConfigSourceFile = js.native
  def reduceEachLeadingCommentRange[T, U](
    text: java.lang.String,
    pos: scala.Double,
    cb: js.Function6[
      /* pos */ scala.Double, 
      /* end */ scala.Double, 
      /* kind */ typescriptLib.typescriptMod.CommentKind, 
      /* hasTrailingNewLine */ scala.Boolean, 
      /* state */ T, 
      /* memo */ U, 
      U
    ],
    state: T,
    initial: U
  ): js.UndefOr[U] = js.native
  def reduceEachTrailingCommentRange[T, U](
    text: java.lang.String,
    pos: scala.Double,
    cb: js.Function6[
      /* pos */ scala.Double, 
      /* end */ scala.Double, 
      /* kind */ typescriptLib.typescriptMod.CommentKind, 
      /* hasTrailingNewLine */ scala.Boolean, 
      /* state */ T, 
      /* memo */ U, 
      U
    ],
    state: T,
    initial: U
  ): js.UndefOr[U] = js.native
  /**
    * Removes an EmitHelper from a node.
    */
  def removeEmitHelper(node: typescriptLib.typescriptMod.Node, helper: typescriptLib.typescriptMod.EmitHelper): scala.Boolean = js.native
  def resolveModuleName(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.ModuleResolutionHost
  ): typescriptLib.typescriptMod.ResolvedModuleWithFailedLookupLocations = js.native
  def resolveModuleName(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.ModuleResolutionHost,
    cache: typescriptLib.typescriptMod.ModuleResolutionCache
  ): typescriptLib.typescriptMod.ResolvedModuleWithFailedLookupLocations = js.native
  def resolveModuleName(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.ModuleResolutionHost,
    cache: typescriptLib.typescriptMod.ModuleResolutionCache,
    redirectedReference: typescriptLib.typescriptMod.ResolvedProjectReference
  ): typescriptLib.typescriptMod.ResolvedModuleWithFailedLookupLocations = js.native
  def resolveModuleNameFromCache(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    cache: typescriptLib.typescriptMod.ModuleResolutionCache
  ): js.UndefOr[typescriptLib.typescriptMod.ResolvedModuleWithFailedLookupLocations] = js.native
  /** @deprecated */ def resolveProjectReferencePath(
    host: typescriptLib.typescriptMod.ResolveProjectReferencePathHost,
    ref: typescriptLib.typescriptMod.ProjectReference
  ): typescriptLib.typescriptMod.ResolvedConfigFileName = js.native
  /**
    * Returns the target config filename of a project reference.
    * Note: The file might not exist.
    */
  def resolveProjectReferencePath(ref: typescriptLib.typescriptMod.ProjectReference): typescriptLib.typescriptMod.ResolvedConfigFileName = js.native
  def resolveTripleslashReference(moduleName: java.lang.String, containingFile: java.lang.String): java.lang.String = js.native
  /**
    * @param {string | undefined} containingFile - file that contains type reference directive, can be undefined if containing file is unknown.
    * This is possible in case if resolution is performed for directives specified via 'types' parameter. In this case initial path for secondary lookups
    * is assumed to be the same as root directory of the project.
    */
  def resolveTypeReferenceDirective(
    typeReferenceDirectiveName: java.lang.String,
    containingFile: java.lang.String,
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.ModuleResolutionHost
  ): typescriptLib.typescriptMod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
  def resolveTypeReferenceDirective(
    typeReferenceDirectiveName: java.lang.String,
    containingFile: java.lang.String,
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.ModuleResolutionHost,
    redirectedReference: typescriptLib.typescriptMod.ResolvedProjectReference
  ): typescriptLib.typescriptMod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
  def resolveTypeReferenceDirective(
    typeReferenceDirectiveName: java.lang.String,
    containingFile: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.ModuleResolutionHost
  ): typescriptLib.typescriptMod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
  def resolveTypeReferenceDirective(
    typeReferenceDirectiveName: java.lang.String,
    containingFile: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.CompilerOptions,
    host: typescriptLib.typescriptMod.ModuleResolutionHost,
    redirectedReference: typescriptLib.typescriptMod.ResolvedProjectReference
  ): typescriptLib.typescriptMod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
  /**
    * Sets a custom text range to use when emitting comments.
    */
  def setCommentRange[T /* <: typescriptLib.typescriptMod.Node */](node: T, range: typescriptLib.typescriptMod.TextRange): T = js.native
  def setConstantValue(node: typescriptLib.typescriptMod.ElementAccessExpression, value: java.lang.String): typescriptLib.typescriptMod.PropertyAccessExpression | typescriptLib.typescriptMod.ElementAccessExpression = js.native
  def setConstantValue(node: typescriptLib.typescriptMod.ElementAccessExpression, value: scala.Double): typescriptLib.typescriptMod.PropertyAccessExpression | typescriptLib.typescriptMod.ElementAccessExpression = js.native
  /**
    * Sets the constant value to emit for an expression.
    */
  def setConstantValue(node: typescriptLib.typescriptMod.PropertyAccessExpression, value: java.lang.String): typescriptLib.typescriptMod.PropertyAccessExpression | typescriptLib.typescriptMod.ElementAccessExpression = js.native
  def setConstantValue(node: typescriptLib.typescriptMod.PropertyAccessExpression, value: scala.Double): typescriptLib.typescriptMod.PropertyAccessExpression | typescriptLib.typescriptMod.ElementAccessExpression = js.native
  /**
    * Sets flags that control emit behavior of a node.
    */
  def setEmitFlags[T /* <: typescriptLib.typescriptMod.Node */](node: T, emitFlags: typescriptLib.typescriptMod.EmitFlags): T = js.native
  def setOriginalNode[T /* <: typescriptLib.typescriptMod.Node */](node: T): T = js.native
  def setOriginalNode[T /* <: typescriptLib.typescriptMod.Node */](node: T, original: typescriptLib.typescriptMod.Node): T = js.native
  def setSourceMapRange[T /* <: typescriptLib.typescriptMod.Node */](node: T): T = js.native
  /**
    * Sets a custom text range to use when emitting source maps.
    */
  def setSourceMapRange[T /* <: typescriptLib.typescriptMod.Node */](node: T, range: typescriptLib.typescriptMod.SourceMapRange): T = js.native
  def setSyntheticLeadingComments[T /* <: typescriptLib.typescriptMod.Node */](node: T): T = js.native
  def setSyntheticLeadingComments[T /* <: typescriptLib.typescriptMod.Node */](node: T, comments: js.Array[typescriptLib.typescriptMod.SynthesizedComment]): T = js.native
  def setSyntheticTrailingComments[T /* <: typescriptLib.typescriptMod.Node */](node: T): T = js.native
  def setSyntheticTrailingComments[T /* <: typescriptLib.typescriptMod.Node */](node: T, comments: js.Array[typescriptLib.typescriptMod.SynthesizedComment]): T = js.native
  def setTextRange[T /* <: typescriptLib.typescriptMod.TextRange */](range: T): T = js.native
  def setTextRange[T /* <: typescriptLib.typescriptMod.TextRange */](range: T, location: typescriptLib.typescriptMod.TextRange): T = js.native
  def setTokenSourceMapRange[T /* <: typescriptLib.typescriptMod.Node */](node: T, token: typescriptLib.typescriptMod.SyntaxKind): T = js.native
  /**
    * Sets the TextRange to use for source maps for a token of a node.
    */
  def setTokenSourceMapRange[T /* <: typescriptLib.typescriptMod.Node */](
    node: T,
    token: typescriptLib.typescriptMod.SyntaxKind,
    range: typescriptLib.typescriptMod.SourceMapRange
  ): T = js.native
  def skipPartiallyEmittedExpressions(node: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.Expression = js.native
  def skipPartiallyEmittedExpressions(node: typescriptLib.typescriptMod.Node): typescriptLib.typescriptMod.Node = js.native
  def sortAndDeduplicateDiagnostics[T /* <: typescriptLib.typescriptMod.Diagnostic */](diagnostics: js.Array[T]): typescriptLib.typescriptMod.SortedReadonlyArray[T] = js.native
  def symbolName(symbol: typescriptLib.typescriptMod.Symbol): java.lang.String = js.native
  def textChangeRangeIsUnchanged(range: typescriptLib.typescriptMod.TextChangeRange): scala.Boolean = js.native
  def textChangeRangeNewSpan(range: typescriptLib.typescriptMod.TextChangeRange): typescriptLib.typescriptMod.TextSpan = js.native
  def textSpanContainsPosition(span: typescriptLib.typescriptMod.TextSpan, position: scala.Double): scala.Boolean = js.native
  def textSpanContainsTextSpan(span: typescriptLib.typescriptMod.TextSpan, other: typescriptLib.typescriptMod.TextSpan): scala.Boolean = js.native
  def textSpanEnd(span: typescriptLib.typescriptMod.TextSpan): scala.Double = js.native
  def textSpanIntersection(span1: typescriptLib.typescriptMod.TextSpan, span2: typescriptLib.typescriptMod.TextSpan): js.UndefOr[typescriptLib.typescriptMod.TextSpan] = js.native
  def textSpanIntersectsWith(span: typescriptLib.typescriptMod.TextSpan, start: scala.Double, length: scala.Double): scala.Boolean = js.native
  def textSpanIntersectsWithPosition(span: typescriptLib.typescriptMod.TextSpan, position: scala.Double): scala.Boolean = js.native
  def textSpanIntersectsWithTextSpan(span: typescriptLib.typescriptMod.TextSpan, other: typescriptLib.typescriptMod.TextSpan): scala.Boolean = js.native
  def textSpanIsEmpty(span: typescriptLib.typescriptMod.TextSpan): scala.Boolean = js.native
  def textSpanOverlap(span1: typescriptLib.typescriptMod.TextSpan, span2: typescriptLib.typescriptMod.TextSpan): js.UndefOr[typescriptLib.typescriptMod.TextSpan] = js.native
  def textSpanOverlapsWith(span: typescriptLib.typescriptMod.TextSpan, other: typescriptLib.typescriptMod.TextSpan): scala.Boolean = js.native
  def toEditorSettings(options: typescriptLib.typescriptMod.EditorOptions): typescriptLib.typescriptMod.EditorSettings = js.native
  def toEditorSettings(options: typescriptLib.typescriptMod.EditorSettings): typescriptLib.typescriptMod.EditorSettings = js.native
  def tokenToString(t: typescriptLib.typescriptMod.SyntaxKind): js.UndefOr[java.lang.String] = js.native
  /**
    * Transform one or more nodes using the supplied transformers.
    * @param source A single `Node` or an array of `Node` objects.
    * @param transformers An array of `TransformerFactory` callbacks used to process the transformation.
    * @param compilerOptions Optional compiler options.
    */
  def transform[T /* <: typescriptLib.typescriptMod.Node */](source: T, transformers: js.Array[typescriptLib.typescriptMod.TransformerFactory[T]]): typescriptLib.typescriptMod.TransformationResult[T] = js.native
  def transform[T /* <: typescriptLib.typescriptMod.Node */](
    source: T,
    transformers: js.Array[typescriptLib.typescriptMod.TransformerFactory[T]],
    compilerOptions: typescriptLib.typescriptMod.CompilerOptions
  ): typescriptLib.typescriptMod.TransformationResult[T] = js.native
  def transform[T /* <: typescriptLib.typescriptMod.Node */](source: js.Array[T], transformers: js.Array[typescriptLib.typescriptMod.TransformerFactory[T]]): typescriptLib.typescriptMod.TransformationResult[T] = js.native
  def transform[T /* <: typescriptLib.typescriptMod.Node */](
    source: js.Array[T],
    transformers: js.Array[typescriptLib.typescriptMod.TransformerFactory[T]],
    compilerOptions: typescriptLib.typescriptMod.CompilerOptions
  ): typescriptLib.typescriptMod.TransformationResult[T] = js.native
  def transpile(input: java.lang.String): java.lang.String = js.native
  def transpile(input: java.lang.String, compilerOptions: typescriptLib.typescriptMod.CompilerOptions): java.lang.String = js.native
  def transpile(
    input: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.CompilerOptions,
    fileName: java.lang.String
  ): java.lang.String = js.native
  def transpile(
    input: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.CompilerOptions,
    fileName: java.lang.String,
    diagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic]
  ): java.lang.String = js.native
  def transpile(
    input: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.CompilerOptions,
    fileName: java.lang.String,
    diagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic],
    moduleName: java.lang.String
  ): java.lang.String = js.native
  def transpileModule(input: java.lang.String, transpileOptions: typescriptLib.typescriptMod.TranspileOptions): typescriptLib.typescriptMod.TranspileOutput = js.native
  /**
    * Remove extra underscore from escaped identifier text content.
    *
    * @param identifier The escaped identifier text.
    * @returns The unescaped identifier text.
    */
  def unescapeLeadingUnderscores(identifier: typescriptLib.typescriptMod.__String): java.lang.String = js.native
  def updateArrayBindingPattern(
    node: typescriptLib.typescriptMod.ArrayBindingPattern,
    elements: js.Array[typescriptLib.typescriptMod.ArrayBindingElement]
  ): typescriptLib.typescriptMod.ArrayBindingPattern = js.native
  def updateArrayLiteral(
    node: typescriptLib.typescriptMod.ArrayLiteralExpression,
    elements: js.Array[typescriptLib.typescriptMod.Expression]
  ): typescriptLib.typescriptMod.ArrayLiteralExpression = js.native
  def updateArrayTypeNode(node: typescriptLib.typescriptMod.ArrayTypeNode, elementType: typescriptLib.typescriptMod.TypeNode): typescriptLib.typescriptMod.ArrayTypeNode = js.native
  def updateArrowFunction(
    node: typescriptLib.typescriptMod.ArrowFunction,
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: typescriptLib.typescriptMod.Token[typescriptLib.typescriptMod.SyntaxKind],
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def updateArrowFunction(
    node: typescriptLib.typescriptMod.ArrowFunction,
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    equalsGreaterThanToken: typescriptLib.typescriptMod.Token[typescriptLib.typescriptMod.SyntaxKind],
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def updateArrowFunction(
    node: typescriptLib.typescriptMod.ArrowFunction,
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: typescriptLib.typescriptMod.Token[typescriptLib.typescriptMod.SyntaxKind],
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def updateArrowFunction(
    node: typescriptLib.typescriptMod.ArrowFunction,
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    equalsGreaterThanToken: typescriptLib.typescriptMod.Token[typescriptLib.typescriptMod.SyntaxKind],
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def updateArrowFunction(
    node: typescriptLib.typescriptMod.ArrowFunction,
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: typescriptLib.typescriptMod.Token[typescriptLib.typescriptMod.SyntaxKind],
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def updateArrowFunction(
    node: typescriptLib.typescriptMod.ArrowFunction,
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    equalsGreaterThanToken: typescriptLib.typescriptMod.Token[typescriptLib.typescriptMod.SyntaxKind],
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def updateArrowFunction(
    node: typescriptLib.typescriptMod.ArrowFunction,
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: typescriptLib.typescriptMod.Token[typescriptLib.typescriptMod.SyntaxKind],
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def updateArrowFunction(
    node: typescriptLib.typescriptMod.ArrowFunction,
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    equalsGreaterThanToken: typescriptLib.typescriptMod.Token[typescriptLib.typescriptMod.SyntaxKind],
    body: typescriptLib.typescriptMod.ConciseBody
  ): typescriptLib.typescriptMod.ArrowFunction = js.native
  def updateAsExpression(
    node: typescriptLib.typescriptMod.AsExpression,
    expression: typescriptLib.typescriptMod.Expression,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.AsExpression = js.native
  def updateAwait(
    node: typescriptLib.typescriptMod.AwaitExpression,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.AwaitExpression = js.native
  def updateBinary(
    node: typescriptLib.typescriptMod.BinaryExpression,
    left: typescriptLib.typescriptMod.Expression,
    right: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.BinaryExpression = js.native
  def updateBinary(
    node: typescriptLib.typescriptMod.BinaryExpression,
    left: typescriptLib.typescriptMod.Expression,
    right: typescriptLib.typescriptMod.Expression,
    operator: typescriptLib.typescriptMod.BinaryOperator
  ): typescriptLib.typescriptMod.BinaryExpression = js.native
  def updateBinary(
    node: typescriptLib.typescriptMod.BinaryExpression,
    left: typescriptLib.typescriptMod.Expression,
    right: typescriptLib.typescriptMod.Expression,
    operator: typescriptLib.typescriptMod.BinaryOperatorToken
  ): typescriptLib.typescriptMod.BinaryExpression = js.native
  def updateBindingElement(
    node: typescriptLib.typescriptMod.BindingElement,
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def updateBindingElement(
    node: typescriptLib.typescriptMod.BindingElement,
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def updateBindingElement(
    node: typescriptLib.typescriptMod.BindingElement,
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: typescriptLib.typescriptMod.PropertyName,
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def updateBindingElement(
    node: typescriptLib.typescriptMod.BindingElement,
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: typescriptLib.typescriptMod.PropertyName,
    name: typescriptLib.typescriptMod.BindingName,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def updateBindingElement(
    node: typescriptLib.typescriptMod.BindingElement,
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    propertyName: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def updateBindingElement(
    node: typescriptLib.typescriptMod.BindingElement,
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    propertyName: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def updateBindingElement(
    node: typescriptLib.typescriptMod.BindingElement,
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    propertyName: typescriptLib.typescriptMod.PropertyName,
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def updateBindingElement(
    node: typescriptLib.typescriptMod.BindingElement,
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    propertyName: typescriptLib.typescriptMod.PropertyName,
    name: typescriptLib.typescriptMod.BindingName,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.BindingElement = js.native
  def updateBlock(
    node: typescriptLib.typescriptMod.Block,
    statements: js.Array[typescriptLib.typescriptMod.Statement]
  ): typescriptLib.typescriptMod.Block = js.native
  def updateBreak(node: typescriptLib.typescriptMod.BreakStatement): typescriptLib.typescriptMod.BreakStatement = js.native
  def updateBreak(node: typescriptLib.typescriptMod.BreakStatement, label: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.BreakStatement = js.native
  def updateBundle(
    node: typescriptLib.typescriptMod.Bundle,
    sourceFiles: js.Array[typescriptLib.typescriptMod.SourceFile]
  ): typescriptLib.typescriptMod.Bundle = js.native
  def updateBundle(
    node: typescriptLib.typescriptMod.Bundle,
    sourceFiles: js.Array[typescriptLib.typescriptMod.SourceFile],
    prepends: js.Array[typescriptLib.typescriptMod.UnparsedSource]
  ): typescriptLib.typescriptMod.Bundle = js.native
  def updateCall(
    node: typescriptLib.typescriptMod.CallExpression,
    expression: typescriptLib.typescriptMod.Expression,
    typeArguments: js.Array[typescriptLib.typescriptMod.TypeNode],
    argumentsArray: js.Array[typescriptLib.typescriptMod.Expression]
  ): typescriptLib.typescriptMod.CallExpression = js.native
  def updateCall(
    node: typescriptLib.typescriptMod.CallExpression,
    expression: typescriptLib.typescriptMod.Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[typescriptLib.typescriptMod.Expression]
  ): typescriptLib.typescriptMod.CallExpression = js.native
  def updateCallSignature(
    node: typescriptLib.typescriptMod.CallSignatureDeclaration,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.CallSignatureDeclaration = js.native
  def updateCallSignature(
    node: typescriptLib.typescriptMod.CallSignatureDeclaration,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.CallSignatureDeclaration = js.native
  def updateCallSignature(
    node: typescriptLib.typescriptMod.CallSignatureDeclaration,
    typeParameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.CallSignatureDeclaration = js.native
  def updateCallSignature(
    node: typescriptLib.typescriptMod.CallSignatureDeclaration,
    typeParameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.CallSignatureDeclaration = js.native
  def updateCaseBlock(
    node: typescriptLib.typescriptMod.CaseBlock,
    clauses: js.Array[typescriptLib.typescriptMod.CaseOrDefaultClause]
  ): typescriptLib.typescriptMod.CaseBlock = js.native
  def updateCaseClause(
    node: typescriptLib.typescriptMod.CaseClause,
    expression: typescriptLib.typescriptMod.Expression,
    statements: js.Array[typescriptLib.typescriptMod.Statement]
  ): typescriptLib.typescriptMod.CaseClause = js.native
  def updateCatchClause(
    node: typescriptLib.typescriptMod.CatchClause,
    variableDeclaration: js.UndefOr[scala.Nothing],
    block: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.CatchClause = js.native
  def updateCatchClause(
    node: typescriptLib.typescriptMod.CatchClause,
    variableDeclaration: typescriptLib.typescriptMod.VariableDeclaration,
    block: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.CatchClause = js.native
  def updateClassDeclaration(
    node: typescriptLib.typescriptMod.ClassDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.Modifier]],
    name: js.UndefOr[typescriptLib.typescriptMod.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration]],
    heritageClauses: js.UndefOr[js.Array[typescriptLib.typescriptMod.HeritageClause]],
    members: js.Array[typescriptLib.typescriptMod.ClassElement]
  ): typescriptLib.typescriptMod.ClassDeclaration = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.ClassExpression,
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    heritageClauses: js.Array[typescriptLib.typescriptMod.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.ClassElement]
  ): typescriptLib.typescriptMod.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.ClassExpression,
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.ClassElement]
  ): typescriptLib.typescriptMod.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.ClassExpression,
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[typescriptLib.typescriptMod.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.ClassElement]
  ): typescriptLib.typescriptMod.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.ClassExpression,
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.ClassElement]
  ): typescriptLib.typescriptMod.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.ClassExpression,
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    heritageClauses: js.Array[typescriptLib.typescriptMod.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.ClassElement]
  ): typescriptLib.typescriptMod.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.ClassExpression,
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.ClassElement]
  ): typescriptLib.typescriptMod.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.ClassExpression,
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[typescriptLib.typescriptMod.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.ClassElement]
  ): typescriptLib.typescriptMod.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.ClassExpression,
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.ClassElement]
  ): typescriptLib.typescriptMod.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    heritageClauses: js.Array[typescriptLib.typescriptMod.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.ClassElement]
  ): typescriptLib.typescriptMod.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.ClassElement]
  ): typescriptLib.typescriptMod.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[typescriptLib.typescriptMod.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.ClassElement]
  ): typescriptLib.typescriptMod.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.ClassElement]
  ): typescriptLib.typescriptMod.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    heritageClauses: js.Array[typescriptLib.typescriptMod.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.ClassElement]
  ): typescriptLib.typescriptMod.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.ClassElement]
  ): typescriptLib.typescriptMod.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[typescriptLib.typescriptMod.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.ClassElement]
  ): typescriptLib.typescriptMod.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.ClassElement]
  ): typescriptLib.typescriptMod.ClassExpression = js.native
  def updateCommaList(
    node: typescriptLib.typescriptMod.CommaListExpression,
    elements: js.Array[typescriptLib.typescriptMod.Expression]
  ): typescriptLib.typescriptMod.CommaListExpression = js.native
  def updateComputedPropertyName(
    node: typescriptLib.typescriptMod.ComputedPropertyName,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ComputedPropertyName = js.native
  def updateConditional(
    node: typescriptLib.typescriptMod.ConditionalExpression,
    condition: typescriptLib.typescriptMod.Expression,
    questionToken: typescriptLib.typescriptMod.Token[typescriptLib.typescriptMod.SyntaxKind],
    whenTrue: typescriptLib.typescriptMod.Expression,
    colonToken: typescriptLib.typescriptMod.Token[typescriptLib.typescriptMod.SyntaxKind],
    whenFalse: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ConditionalExpression = js.native
  def updateConditionalTypeNode(
    node: typescriptLib.typescriptMod.ConditionalTypeNode,
    checkType: typescriptLib.typescriptMod.TypeNode,
    extendsType: typescriptLib.typescriptMod.TypeNode,
    trueType: typescriptLib.typescriptMod.TypeNode,
    falseType: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ConditionalTypeNode = js.native
  def updateConstructSignature(
    node: typescriptLib.typescriptMod.ConstructSignatureDeclaration,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.ConstructSignatureDeclaration = js.native
  def updateConstructSignature(
    node: typescriptLib.typescriptMod.ConstructSignatureDeclaration,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ConstructSignatureDeclaration = js.native
  def updateConstructSignature(
    node: typescriptLib.typescriptMod.ConstructSignatureDeclaration,
    typeParameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.ConstructSignatureDeclaration = js.native
  def updateConstructSignature(
    node: typescriptLib.typescriptMod.ConstructSignatureDeclaration,
    typeParameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ConstructSignatureDeclaration = js.native
  def updateConstructor(
    node: typescriptLib.typescriptMod.ConstructorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.ConstructorDeclaration = js.native
  def updateConstructor(
    node: typescriptLib.typescriptMod.ConstructorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.ConstructorDeclaration = js.native
  def updateConstructor(
    node: typescriptLib.typescriptMod.ConstructorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.ConstructorDeclaration = js.native
  def updateConstructor(
    node: typescriptLib.typescriptMod.ConstructorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.ConstructorDeclaration = js.native
  def updateConstructor(
    node: typescriptLib.typescriptMod.ConstructorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.ConstructorDeclaration = js.native
  def updateConstructor(
    node: typescriptLib.typescriptMod.ConstructorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.ConstructorDeclaration = js.native
  def updateConstructor(
    node: typescriptLib.typescriptMod.ConstructorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.ConstructorDeclaration = js.native
  def updateConstructor(
    node: typescriptLib.typescriptMod.ConstructorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.ConstructorDeclaration = js.native
  def updateConstructorTypeNode(
    node: typescriptLib.typescriptMod.ConstructorTypeNode,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.ConstructorTypeNode = js.native
  def updateConstructorTypeNode(
    node: typescriptLib.typescriptMod.ConstructorTypeNode,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ConstructorTypeNode = js.native
  def updateConstructorTypeNode(
    node: typescriptLib.typescriptMod.ConstructorTypeNode,
    typeParameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.ConstructorTypeNode = js.native
  def updateConstructorTypeNode(
    node: typescriptLib.typescriptMod.ConstructorTypeNode,
    typeParameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ConstructorTypeNode = js.native
  def updateContinue(node: typescriptLib.typescriptMod.ContinueStatement): typescriptLib.typescriptMod.ContinueStatement = js.native
  def updateContinue(node: typescriptLib.typescriptMod.ContinueStatement, label: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.ContinueStatement = js.native
  def updateDecorator(node: typescriptLib.typescriptMod.Decorator, expression: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.Decorator = js.native
  def updateDefaultClause(
    node: typescriptLib.typescriptMod.DefaultClause,
    statements: js.Array[typescriptLib.typescriptMod.Statement]
  ): typescriptLib.typescriptMod.DefaultClause = js.native
  def updateDelete(
    node: typescriptLib.typescriptMod.DeleteExpression,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.DeleteExpression = js.native
  def updateDo(
    node: typescriptLib.typescriptMod.DoStatement,
    statement: typescriptLib.typescriptMod.Statement,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.DoStatement = js.native
  def updateElementAccess(
    node: typescriptLib.typescriptMod.ElementAccessExpression,
    expression: typescriptLib.typescriptMod.Expression,
    argumentExpression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ElementAccessExpression = js.native
  def updateEnumDeclaration(
    node: typescriptLib.typescriptMod.EnumDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    members: js.Array[typescriptLib.typescriptMod.EnumMember]
  ): typescriptLib.typescriptMod.EnumDeclaration = js.native
  def updateEnumDeclaration(
    node: typescriptLib.typescriptMod.EnumDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    members: js.Array[typescriptLib.typescriptMod.EnumMember]
  ): typescriptLib.typescriptMod.EnumDeclaration = js.native
  def updateEnumDeclaration(
    node: typescriptLib.typescriptMod.EnumDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    members: js.Array[typescriptLib.typescriptMod.EnumMember]
  ): typescriptLib.typescriptMod.EnumDeclaration = js.native
  def updateEnumDeclaration(
    node: typescriptLib.typescriptMod.EnumDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    members: js.Array[typescriptLib.typescriptMod.EnumMember]
  ): typescriptLib.typescriptMod.EnumDeclaration = js.native
  def updateEnumMember(node: typescriptLib.typescriptMod.EnumMember, name: typescriptLib.typescriptMod.PropertyName): typescriptLib.typescriptMod.EnumMember = js.native
  def updateEnumMember(
    node: typescriptLib.typescriptMod.EnumMember,
    name: typescriptLib.typescriptMod.PropertyName,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.EnumMember = js.native
  def updateExportAssignment(
    node: typescriptLib.typescriptMod.ExportAssignment,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportAssignment = js.native
  def updateExportAssignment(
    node: typescriptLib.typescriptMod.ExportAssignment,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportAssignment = js.native
  def updateExportAssignment(
    node: typescriptLib.typescriptMod.ExportAssignment,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportAssignment = js.native
  def updateExportAssignment(
    node: typescriptLib.typescriptMod.ExportAssignment,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportAssignment = js.native
  def updateExportDeclaration(node: typescriptLib.typescriptMod.ExportDeclaration): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.ExportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator]
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.ExportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier]
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.ExportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.ExportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    exportClause: typescriptLib.typescriptMod.NamedExports
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.ExportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    exportClause: typescriptLib.typescriptMod.NamedExports,
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.ExportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.ExportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: typescriptLib.typescriptMod.NamedExports
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.ExportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: typescriptLib.typescriptMod.NamedExports,
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier]
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    exportClause: typescriptLib.typescriptMod.NamedExports
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    exportClause: typescriptLib.typescriptMod.NamedExports,
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: typescriptLib.typescriptMod.NamedExports
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: typescriptLib.typescriptMod.NamedExports,
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExportDeclaration = js.native
  def updateExportSpecifier(
    node: typescriptLib.typescriptMod.ExportSpecifier,
    propertyName: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier
  ): typescriptLib.typescriptMod.ExportSpecifier = js.native
  def updateExportSpecifier(
    node: typescriptLib.typescriptMod.ExportSpecifier,
    propertyName: typescriptLib.typescriptMod.Identifier,
    name: typescriptLib.typescriptMod.Identifier
  ): typescriptLib.typescriptMod.ExportSpecifier = js.native
  def updateExpressionStatement(
    node: typescriptLib.typescriptMod.ExpressionStatement,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExpressionStatement = js.native
  def updateExpressionWithTypeArguments(
    node: typescriptLib.typescriptMod.ExpressionWithTypeArguments,
    typeArguments: js.Array[typescriptLib.typescriptMod.TypeNode],
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExpressionWithTypeArguments = js.native
  def updateExpressionWithTypeArguments(
    node: typescriptLib.typescriptMod.ExpressionWithTypeArguments,
    typeArguments: js.UndefOr[scala.Nothing],
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExpressionWithTypeArguments = js.native
  def updateExternalModuleReference(
    node: typescriptLib.typescriptMod.ExternalModuleReference,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExternalModuleReference = js.native
  def updateFor(
    node: typescriptLib.typescriptMod.ForStatement,
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForStatement = js.native
  def updateFor(
    node: typescriptLib.typescriptMod.ForStatement,
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: typescriptLib.typescriptMod.Expression,
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForStatement = js.native
  def updateFor(
    node: typescriptLib.typescriptMod.ForStatement,
    initializer: js.UndefOr[scala.Nothing],
    condition: typescriptLib.typescriptMod.Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForStatement = js.native
  def updateFor(
    node: typescriptLib.typescriptMod.ForStatement,
    initializer: js.UndefOr[scala.Nothing],
    condition: typescriptLib.typescriptMod.Expression,
    incrementor: typescriptLib.typescriptMod.Expression,
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForStatement = js.native
  def updateFor(
    node: typescriptLib.typescriptMod.ForStatement,
    initializer: typescriptLib.typescriptMod.ForInitializer,
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForStatement = js.native
  def updateFor(
    node: typescriptLib.typescriptMod.ForStatement,
    initializer: typescriptLib.typescriptMod.ForInitializer,
    condition: js.UndefOr[scala.Nothing],
    incrementor: typescriptLib.typescriptMod.Expression,
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForStatement = js.native
  def updateFor(
    node: typescriptLib.typescriptMod.ForStatement,
    initializer: typescriptLib.typescriptMod.ForInitializer,
    condition: typescriptLib.typescriptMod.Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForStatement = js.native
  def updateFor(
    node: typescriptLib.typescriptMod.ForStatement,
    initializer: typescriptLib.typescriptMod.ForInitializer,
    condition: typescriptLib.typescriptMod.Expression,
    incrementor: typescriptLib.typescriptMod.Expression,
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForStatement = js.native
  def updateForIn(
    node: typescriptLib.typescriptMod.ForInStatement,
    initializer: typescriptLib.typescriptMod.ForInitializer,
    expression: typescriptLib.typescriptMod.Expression,
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForInStatement = js.native
  def updateForOf(
    node: typescriptLib.typescriptMod.ForOfStatement,
    awaitModifier: js.UndefOr[scala.Nothing],
    initializer: typescriptLib.typescriptMod.ForInitializer,
    expression: typescriptLib.typescriptMod.Expression,
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForOfStatement = js.native
  def updateForOf(
    node: typescriptLib.typescriptMod.ForOfStatement,
    awaitModifier: typescriptLib.typescriptMod.AwaitKeywordToken,
    initializer: typescriptLib.typescriptMod.ForInitializer,
    expression: typescriptLib.typescriptMod.Expression,
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.ForOfStatement = js.native
  def updateFunctionDeclaration(
    node: typescriptLib.typescriptMod.FunctionDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.AsteriskToken],
    name: js.UndefOr[typescriptLib.typescriptMod.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.FunctionDeclaration = js.native
  def updateFunctionDeclaration(
    node: typescriptLib.typescriptMod.FunctionDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.AsteriskToken],
    name: js.UndefOr[typescriptLib.typescriptMod.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.FunctionDeclaration = js.native
  def updateFunctionDeclaration(
    node: typescriptLib.typescriptMod.FunctionDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.AsteriskToken],
    name: js.UndefOr[typescriptLib.typescriptMod.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.FunctionDeclaration = js.native
  def updateFunctionExpression(
    node: typescriptLib.typescriptMod.FunctionExpression,
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.AsteriskToken],
    name: js.UndefOr[typescriptLib.typescriptMod.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[typescriptLib.typescriptMod.TypeNode],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.FunctionExpression = js.native
  def updateFunctionTypeNode(
    node: typescriptLib.typescriptMod.FunctionTypeNode,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.FunctionTypeNode = js.native
  def updateFunctionTypeNode(
    node: typescriptLib.typescriptMod.FunctionTypeNode,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.FunctionTypeNode = js.native
  def updateFunctionTypeNode(
    node: typescriptLib.typescriptMod.FunctionTypeNode,
    typeParameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.FunctionTypeNode = js.native
  def updateFunctionTypeNode(
    node: typescriptLib.typescriptMod.FunctionTypeNode,
    typeParameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.FunctionTypeNode = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.GetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.GetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.GetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.GetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.GetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.GetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.GetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.GetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.GetAccessorDeclaration = js.native
  def updateHeritageClause(
    node: typescriptLib.typescriptMod.HeritageClause,
    types: js.Array[typescriptLib.typescriptMod.ExpressionWithTypeArguments]
  ): typescriptLib.typescriptMod.HeritageClause = js.native
  def updateIdentifier(node: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.Identifier = js.native
  def updateIf(
    node: typescriptLib.typescriptMod.IfStatement,
    expression: typescriptLib.typescriptMod.Expression,
    thenStatement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.IfStatement = js.native
  def updateIf(
    node: typescriptLib.typescriptMod.IfStatement,
    expression: typescriptLib.typescriptMod.Expression,
    thenStatement: typescriptLib.typescriptMod.Statement,
    elseStatement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.IfStatement = js.native
  def updateImportClause(node: typescriptLib.typescriptMod.ImportClause): typescriptLib.typescriptMod.ImportClause = js.native
  def updateImportClause(
    node: typescriptLib.typescriptMod.ImportClause,
    name: js.UndefOr[scala.Nothing],
    namedBindings: typescriptLib.typescriptMod.NamedImportBindings
  ): typescriptLib.typescriptMod.ImportClause = js.native
  def updateImportClause(node: typescriptLib.typescriptMod.ImportClause, name: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.ImportClause = js.native
  def updateImportClause(
    node: typescriptLib.typescriptMod.ImportClause,
    name: typescriptLib.typescriptMod.Identifier,
    namedBindings: typescriptLib.typescriptMod.NamedImportBindings
  ): typescriptLib.typescriptMod.ImportClause = js.native
  def updateImportDeclaration(
    node: typescriptLib.typescriptMod.ImportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ImportDeclaration = js.native
  def updateImportDeclaration(
    node: typescriptLib.typescriptMod.ImportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    importClause: typescriptLib.typescriptMod.ImportClause,
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ImportDeclaration = js.native
  def updateImportDeclaration(
    node: typescriptLib.typescriptMod.ImportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ImportDeclaration = js.native
  def updateImportDeclaration(
    node: typescriptLib.typescriptMod.ImportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: typescriptLib.typescriptMod.ImportClause,
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ImportDeclaration = js.native
  def updateImportDeclaration(
    node: typescriptLib.typescriptMod.ImportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ImportDeclaration = js.native
  def updateImportDeclaration(
    node: typescriptLib.typescriptMod.ImportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    importClause: typescriptLib.typescriptMod.ImportClause,
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ImportDeclaration = js.native
  def updateImportDeclaration(
    node: typescriptLib.typescriptMod.ImportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ImportDeclaration = js.native
  def updateImportDeclaration(
    node: typescriptLib.typescriptMod.ImportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: typescriptLib.typescriptMod.ImportClause,
    moduleSpecifier: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ImportDeclaration = js.native
  def updateImportEqualsDeclaration(
    node: typescriptLib.typescriptMod.ImportEqualsDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    moduleReference: typescriptLib.typescriptMod.ModuleReference
  ): typescriptLib.typescriptMod.ImportEqualsDeclaration = js.native
  def updateImportEqualsDeclaration(
    node: typescriptLib.typescriptMod.ImportEqualsDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    moduleReference: typescriptLib.typescriptMod.ModuleReference
  ): typescriptLib.typescriptMod.ImportEqualsDeclaration = js.native
  def updateImportEqualsDeclaration(
    node: typescriptLib.typescriptMod.ImportEqualsDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    moduleReference: typescriptLib.typescriptMod.ModuleReference
  ): typescriptLib.typescriptMod.ImportEqualsDeclaration = js.native
  def updateImportEqualsDeclaration(
    node: typescriptLib.typescriptMod.ImportEqualsDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    moduleReference: typescriptLib.typescriptMod.ModuleReference
  ): typescriptLib.typescriptMod.ImportEqualsDeclaration = js.native
  def updateImportSpecifier(
    node: typescriptLib.typescriptMod.ImportSpecifier,
    propertyName: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier
  ): typescriptLib.typescriptMod.ImportSpecifier = js.native
  def updateImportSpecifier(
    node: typescriptLib.typescriptMod.ImportSpecifier,
    propertyName: typescriptLib.typescriptMod.Identifier,
    name: typescriptLib.typescriptMod.Identifier
  ): typescriptLib.typescriptMod.ImportSpecifier = js.native
  def updateImportTypeNode(node: typescriptLib.typescriptMod.ImportTypeNode, argument: typescriptLib.typescriptMod.TypeNode): typescriptLib.typescriptMod.ImportTypeNode = js.native
  def updateImportTypeNode(
    node: typescriptLib.typescriptMod.ImportTypeNode,
    argument: typescriptLib.typescriptMod.TypeNode,
    qualifier: typescriptLib.typescriptMod.EntityName
  ): typescriptLib.typescriptMod.ImportTypeNode = js.native
  def updateImportTypeNode(
    node: typescriptLib.typescriptMod.ImportTypeNode,
    argument: typescriptLib.typescriptMod.TypeNode,
    qualifier: typescriptLib.typescriptMod.EntityName,
    typeArguments: js.Array[typescriptLib.typescriptMod.TypeNode]
  ): typescriptLib.typescriptMod.ImportTypeNode = js.native
  def updateImportTypeNode(
    node: typescriptLib.typescriptMod.ImportTypeNode,
    argument: typescriptLib.typescriptMod.TypeNode,
    qualifier: typescriptLib.typescriptMod.EntityName,
    typeArguments: js.Array[typescriptLib.typescriptMod.TypeNode],
    isTypeOf: scala.Boolean
  ): typescriptLib.typescriptMod.ImportTypeNode = js.native
  def updateIndexSignature(
    node: typescriptLib.typescriptMod.IndexSignatureDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.IndexSignatureDeclaration = js.native
  def updateIndexSignature(
    node: typescriptLib.typescriptMod.IndexSignatureDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.IndexSignatureDeclaration = js.native
  def updateIndexSignature(
    node: typescriptLib.typescriptMod.IndexSignatureDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.IndexSignatureDeclaration = js.native
  def updateIndexSignature(
    node: typescriptLib.typescriptMod.IndexSignatureDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.IndexSignatureDeclaration = js.native
  def updateIndexedAccessTypeNode(
    node: typescriptLib.typescriptMod.IndexedAccessTypeNode,
    objectType: typescriptLib.typescriptMod.TypeNode,
    indexType: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.IndexedAccessTypeNode = js.native
  def updateInferTypeNode(
    node: typescriptLib.typescriptMod.InferTypeNode,
    typeParameter: typescriptLib.typescriptMod.TypeParameterDeclaration
  ): typescriptLib.typescriptMod.InferTypeNode = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.InterfaceDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    heritageClauses: js.Array[typescriptLib.typescriptMod.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.TypeElement]
  ): typescriptLib.typescriptMod.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.InterfaceDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.TypeElement]
  ): typescriptLib.typescriptMod.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.InterfaceDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[typescriptLib.typescriptMod.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.TypeElement]
  ): typescriptLib.typescriptMod.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.InterfaceDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.TypeElement]
  ): typescriptLib.typescriptMod.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.InterfaceDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    heritageClauses: js.Array[typescriptLib.typescriptMod.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.TypeElement]
  ): typescriptLib.typescriptMod.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.InterfaceDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.TypeElement]
  ): typescriptLib.typescriptMod.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.InterfaceDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[typescriptLib.typescriptMod.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.TypeElement]
  ): typescriptLib.typescriptMod.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.InterfaceDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.TypeElement]
  ): typescriptLib.typescriptMod.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    heritageClauses: js.Array[typescriptLib.typescriptMod.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.TypeElement]
  ): typescriptLib.typescriptMod.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.TypeElement]
  ): typescriptLib.typescriptMod.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[typescriptLib.typescriptMod.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.TypeElement]
  ): typescriptLib.typescriptMod.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.TypeElement]
  ): typescriptLib.typescriptMod.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    heritageClauses: js.Array[typescriptLib.typescriptMod.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.TypeElement]
  ): typescriptLib.typescriptMod.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.TypeElement]
  ): typescriptLib.typescriptMod.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[typescriptLib.typescriptMod.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.TypeElement]
  ): typescriptLib.typescriptMod.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.TypeElement]
  ): typescriptLib.typescriptMod.InterfaceDeclaration = js.native
  def updateIntersectionTypeNode(
    node: typescriptLib.typescriptMod.IntersectionTypeNode,
    types: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeNode]
  ): typescriptLib.typescriptMod.IntersectionTypeNode = js.native
  def updateJsxAttribute(
    node: typescriptLib.typescriptMod.JsxAttribute,
    name: typescriptLib.typescriptMod.Identifier,
    initializer: typescriptLib.typescriptMod.JsxExpression
  ): typescriptLib.typescriptMod.JsxAttribute = js.native
  def updateJsxAttribute(
    node: typescriptLib.typescriptMod.JsxAttribute,
    name: typescriptLib.typescriptMod.Identifier,
    initializer: typescriptLib.typescriptMod.StringLiteral
  ): typescriptLib.typescriptMod.JsxAttribute = js.native
  def updateJsxAttributes(
    node: typescriptLib.typescriptMod.JsxAttributes,
    properties: js.Array[typescriptLib.typescriptMod.JsxAttributeLike]
  ): typescriptLib.typescriptMod.JsxAttributes = js.native
  def updateJsxClosingElement(
    node: typescriptLib.typescriptMod.JsxClosingElement,
    tagName: typescriptLib.typescriptMod.JsxTagNameExpression
  ): typescriptLib.typescriptMod.JsxClosingElement = js.native
  def updateJsxElement(
    node: typescriptLib.typescriptMod.JsxElement,
    openingElement: typescriptLib.typescriptMod.JsxOpeningElement,
    children: js.Array[typescriptLib.typescriptMod.JsxChild],
    closingElement: typescriptLib.typescriptMod.JsxClosingElement
  ): typescriptLib.typescriptMod.JsxElement = js.native
  def updateJsxExpression(node: typescriptLib.typescriptMod.JsxExpression): typescriptLib.typescriptMod.JsxExpression = js.native
  def updateJsxExpression(
    node: typescriptLib.typescriptMod.JsxExpression,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.JsxExpression = js.native
  def updateJsxFragment(
    node: typescriptLib.typescriptMod.JsxFragment,
    openingFragment: typescriptLib.typescriptMod.JsxOpeningFragment,
    children: js.Array[typescriptLib.typescriptMod.JsxChild],
    closingFragment: typescriptLib.typescriptMod.JsxClosingFragment
  ): typescriptLib.typescriptMod.JsxFragment = js.native
  def updateJsxOpeningElement(
    node: typescriptLib.typescriptMod.JsxOpeningElement,
    tagName: typescriptLib.typescriptMod.JsxTagNameExpression,
    typeArguments: js.Array[typescriptLib.typescriptMod.TypeNode],
    attributes: typescriptLib.typescriptMod.JsxAttributes
  ): typescriptLib.typescriptMod.JsxOpeningElement = js.native
  def updateJsxOpeningElement(
    node: typescriptLib.typescriptMod.JsxOpeningElement,
    tagName: typescriptLib.typescriptMod.JsxTagNameExpression,
    typeArguments: js.UndefOr[scala.Nothing],
    attributes: typescriptLib.typescriptMod.JsxAttributes
  ): typescriptLib.typescriptMod.JsxOpeningElement = js.native
  def updateJsxSelfClosingElement(
    node: typescriptLib.typescriptMod.JsxSelfClosingElement,
    tagName: typescriptLib.typescriptMod.JsxTagNameExpression,
    typeArguments: js.Array[typescriptLib.typescriptMod.TypeNode],
    attributes: typescriptLib.typescriptMod.JsxAttributes
  ): typescriptLib.typescriptMod.JsxSelfClosingElement = js.native
  def updateJsxSelfClosingElement(
    node: typescriptLib.typescriptMod.JsxSelfClosingElement,
    tagName: typescriptLib.typescriptMod.JsxTagNameExpression,
    typeArguments: js.UndefOr[scala.Nothing],
    attributes: typescriptLib.typescriptMod.JsxAttributes
  ): typescriptLib.typescriptMod.JsxSelfClosingElement = js.native
  def updateJsxSpreadAttribute(
    node: typescriptLib.typescriptMod.JsxSpreadAttribute,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.JsxSpreadAttribute = js.native
  def updateJsxText(node: typescriptLib.typescriptMod.JsxText, text: java.lang.String): typescriptLib.typescriptMod.JsxText = js.native
  def updateJsxText(
    node: typescriptLib.typescriptMod.JsxText,
    text: java.lang.String,
    containsOnlyTriviaWhiteSpaces: scala.Boolean
  ): typescriptLib.typescriptMod.JsxText = js.native
  def updateLabel(
    node: typescriptLib.typescriptMod.LabeledStatement,
    label: typescriptLib.typescriptMod.Identifier,
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.LabeledStatement = js.native
  def updateLanguageServiceSourceFile(
    sourceFile: typescriptLib.typescriptMod.SourceFile,
    scriptSnapshot: typescriptLib.typescriptMod.IScriptSnapshot,
    version: java.lang.String
  ): typescriptLib.typescriptMod.SourceFile = js.native
  def updateLanguageServiceSourceFile(
    sourceFile: typescriptLib.typescriptMod.SourceFile,
    scriptSnapshot: typescriptLib.typescriptMod.IScriptSnapshot,
    version: java.lang.String,
    textChangeRange: js.UndefOr[scala.Nothing],
    aggressiveChecks: scala.Boolean
  ): typescriptLib.typescriptMod.SourceFile = js.native
  def updateLanguageServiceSourceFile(
    sourceFile: typescriptLib.typescriptMod.SourceFile,
    scriptSnapshot: typescriptLib.typescriptMod.IScriptSnapshot,
    version: java.lang.String,
    textChangeRange: typescriptLib.typescriptMod.TextChangeRange
  ): typescriptLib.typescriptMod.SourceFile = js.native
  def updateLanguageServiceSourceFile(
    sourceFile: typescriptLib.typescriptMod.SourceFile,
    scriptSnapshot: typescriptLib.typescriptMod.IScriptSnapshot,
    version: java.lang.String,
    textChangeRange: typescriptLib.typescriptMod.TextChangeRange,
    aggressiveChecks: scala.Boolean
  ): typescriptLib.typescriptMod.SourceFile = js.native
  def updateLiteralTypeNode(
    node: typescriptLib.typescriptMod.LiteralTypeNode,
    literal: typescriptLib.typescriptMod.BooleanLiteral
  ): typescriptLib.typescriptMod.LiteralTypeNode = js.native
  def updateLiteralTypeNode(
    node: typescriptLib.typescriptMod.LiteralTypeNode,
    literal: typescriptLib.typescriptMod.LiteralExpression
  ): typescriptLib.typescriptMod.LiteralTypeNode = js.native
  def updateLiteralTypeNode(
    node: typescriptLib.typescriptMod.LiteralTypeNode,
    literal: typescriptLib.typescriptMod.PrefixUnaryExpression
  ): typescriptLib.typescriptMod.LiteralTypeNode = js.native
  def updateMappedTypeNode(
    node: typescriptLib.typescriptMod.MappedTypeNode,
    readonlyToken: typescriptLib.typescriptMod.MinusToken | typescriptLib.typescriptMod.PlusToken | typescriptLib.typescriptMod.ReadonlyToken | js.UndefOr[scala.Nothing],
    typeParameter: typescriptLib.typescriptMod.TypeParameterDeclaration
  ): typescriptLib.typescriptMod.MappedTypeNode = js.native
  def updateMappedTypeNode(
    node: typescriptLib.typescriptMod.MappedTypeNode,
    readonlyToken: typescriptLib.typescriptMod.MinusToken | typescriptLib.typescriptMod.PlusToken | typescriptLib.typescriptMod.ReadonlyToken | js.UndefOr[scala.Nothing],
    typeParameter: typescriptLib.typescriptMod.TypeParameterDeclaration,
    questionToken: typescriptLib.typescriptMod.MinusToken | typescriptLib.typescriptMod.PlusToken | typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.MappedTypeNode = js.native
  def updateMappedTypeNode(
    node: typescriptLib.typescriptMod.MappedTypeNode,
    readonlyToken: typescriptLib.typescriptMod.MinusToken | typescriptLib.typescriptMod.PlusToken | typescriptLib.typescriptMod.ReadonlyToken | js.UndefOr[scala.Nothing],
    typeParameter: typescriptLib.typescriptMod.TypeParameterDeclaration,
    questionToken: typescriptLib.typescriptMod.MinusToken | typescriptLib.typescriptMod.PlusToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.MappedTypeNode = js.native
  def updateMetaProperty(node: typescriptLib.typescriptMod.MetaProperty, name: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.MetaProperty = js.native
  def updateMethod(
    node: typescriptLib.typescriptMod.MethodDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.AsteriskToken],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: js.UndefOr[typescriptLib.typescriptMod.QuestionToken],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.MethodDeclaration = js.native
  def updateMethod(
    node: typescriptLib.typescriptMod.MethodDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.AsteriskToken],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: js.UndefOr[typescriptLib.typescriptMod.QuestionToken],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.MethodDeclaration = js.native
  def updateMethod(
    node: typescriptLib.typescriptMod.MethodDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.AsteriskToken],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: js.UndefOr[typescriptLib.typescriptMod.QuestionToken],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.MethodDeclaration = js.native
  def updateMethodSignature(
    node: typescriptLib.typescriptMod.MethodSignature,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def updateMethodSignature(
    node: typescriptLib.typescriptMod.MethodSignature,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def updateMethodSignature(
    node: typescriptLib.typescriptMod.MethodSignature,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    name: typescriptLib.typescriptMod.PropertyName
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def updateMethodSignature(
    node: typescriptLib.typescriptMod.MethodSignature,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def updateMethodSignature(
    node: typescriptLib.typescriptMod.MethodSignature,
    typeParameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def updateMethodSignature(
    node: typescriptLib.typescriptMod.MethodSignature,
    typeParameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def updateMethodSignature(
    node: typescriptLib.typescriptMod.MethodSignature,
    typeParameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    name: typescriptLib.typescriptMod.PropertyName
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def updateMethodSignature(
    node: typescriptLib.typescriptMod.MethodSignature,
    typeParameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode,
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.MethodSignature = js.native
  def updateModuleBlock(
    node: typescriptLib.typescriptMod.ModuleBlock,
    statements: js.Array[typescriptLib.typescriptMod.Statement]
  ): typescriptLib.typescriptMod.ModuleBlock = js.native
  def updateModuleDeclaration(
    node: typescriptLib.typescriptMod.ModuleDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.ModuleName
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: typescriptLib.typescriptMod.ModuleDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.ModuleName,
    body: typescriptLib.typescriptMod.ModuleBody
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: typescriptLib.typescriptMod.ModuleDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.ModuleName
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: typescriptLib.typescriptMod.ModuleDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.ModuleName,
    body: typescriptLib.typescriptMod.ModuleBody
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: typescriptLib.typescriptMod.ModuleDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.ModuleName
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: typescriptLib.typescriptMod.ModuleDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.ModuleName,
    body: typescriptLib.typescriptMod.ModuleBody
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: typescriptLib.typescriptMod.ModuleDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.ModuleName
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: typescriptLib.typescriptMod.ModuleDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.ModuleName,
    body: typescriptLib.typescriptMod.ModuleBody
  ): typescriptLib.typescriptMod.ModuleDeclaration = js.native
  def updateNamedExports(
    node: typescriptLib.typescriptMod.NamedExports,
    elements: js.Array[typescriptLib.typescriptMod.ExportSpecifier]
  ): typescriptLib.typescriptMod.NamedExports = js.native
  def updateNamedImports(
    node: typescriptLib.typescriptMod.NamedImports,
    elements: js.Array[typescriptLib.typescriptMod.ImportSpecifier]
  ): typescriptLib.typescriptMod.NamedImports = js.native
  def updateNamespaceExportDeclaration(
    node: typescriptLib.typescriptMod.NamespaceExportDeclaration,
    name: typescriptLib.typescriptMod.Identifier
  ): typescriptLib.typescriptMod.NamespaceExportDeclaration = js.native
  def updateNamespaceImport(node: typescriptLib.typescriptMod.NamespaceImport, name: typescriptLib.typescriptMod.Identifier): typescriptLib.typescriptMod.NamespaceImport = js.native
  def updateNew(
    node: typescriptLib.typescriptMod.NewExpression,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.NewExpression = js.native
  def updateNew(
    node: typescriptLib.typescriptMod.NewExpression,
    expression: typescriptLib.typescriptMod.Expression,
    typeArguments: js.Array[typescriptLib.typescriptMod.TypeNode]
  ): typescriptLib.typescriptMod.NewExpression = js.native
  def updateNew(
    node: typescriptLib.typescriptMod.NewExpression,
    expression: typescriptLib.typescriptMod.Expression,
    typeArguments: js.Array[typescriptLib.typescriptMod.TypeNode],
    argumentsArray: js.Array[typescriptLib.typescriptMod.Expression]
  ): typescriptLib.typescriptMod.NewExpression = js.native
  def updateNew(
    node: typescriptLib.typescriptMod.NewExpression,
    expression: typescriptLib.typescriptMod.Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[typescriptLib.typescriptMod.Expression]
  ): typescriptLib.typescriptMod.NewExpression = js.native
  def updateNonNullExpression(
    node: typescriptLib.typescriptMod.NonNullExpression,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.NonNullExpression = js.native
  def updateObjectBindingPattern(
    node: typescriptLib.typescriptMod.ObjectBindingPattern,
    elements: js.Array[typescriptLib.typescriptMod.BindingElement]
  ): typescriptLib.typescriptMod.ObjectBindingPattern = js.native
  def updateObjectLiteral(
    node: typescriptLib.typescriptMod.ObjectLiteralExpression,
    properties: js.Array[typescriptLib.typescriptMod.ObjectLiteralElementLike]
  ): typescriptLib.typescriptMod.ObjectLiteralExpression = js.native
  def updateOptionalTypeNode(node: typescriptLib.typescriptMod.OptionalTypeNode, `type`: typescriptLib.typescriptMod.TypeNode): typescriptLib.typescriptMod.OptionalTypeNode = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.ParameterDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.DotDotDotToken,
    name: typescriptLib.typescriptMod.BindingName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def updateParen(
    node: typescriptLib.typescriptMod.ParenthesizedExpression,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ParenthesizedExpression = js.native
  def updateParenthesizedType(
    node: typescriptLib.typescriptMod.ParenthesizedTypeNode,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.ParenthesizedTypeNode = js.native
  def updatePartiallyEmittedExpression(
    node: typescriptLib.typescriptMod.PartiallyEmittedExpression,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PartiallyEmittedExpression = js.native
  def updatePostfix(
    node: typescriptLib.typescriptMod.PostfixUnaryExpression,
    operand: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PostfixUnaryExpression = js.native
  def updatePrefix(
    node: typescriptLib.typescriptMod.PrefixUnaryExpression,
    operand: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PrefixUnaryExpression = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.PropertyDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.ExclamationToken | typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertyDeclaration = js.native
  def updatePropertyAccess(
    node: typescriptLib.typescriptMod.PropertyAccessExpression,
    expression: typescriptLib.typescriptMod.Expression,
    name: typescriptLib.typescriptMod.Identifier
  ): typescriptLib.typescriptMod.PropertyAccessExpression = js.native
  def updatePropertyAssignment(
    node: typescriptLib.typescriptMod.PropertyAssignment,
    name: typescriptLib.typescriptMod.PropertyName,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertyAssignment = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.PropertySignature,
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.PropertySignature,
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.PropertySignature,
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.PropertySignature,
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.PropertySignature,
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.PropertySignature,
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: js.UndefOr[scala.Nothing],
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.PropertySignature,
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.PropertySignature,
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: js.UndefOr[scala.Nothing],
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    questionToken: typescriptLib.typescriptMod.QuestionToken,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.PropertySignature = js.native
  def updateQualifiedName(
    node: typescriptLib.typescriptMod.QualifiedName,
    left: typescriptLib.typescriptMod.EntityName,
    right: typescriptLib.typescriptMod.Identifier
  ): typescriptLib.typescriptMod.QualifiedName = js.native
  def updateRestTypeNode(node: typescriptLib.typescriptMod.RestTypeNode, `type`: typescriptLib.typescriptMod.TypeNode): typescriptLib.typescriptMod.RestTypeNode = js.native
  def updateReturn(node: typescriptLib.typescriptMod.ReturnStatement): typescriptLib.typescriptMod.ReturnStatement = js.native
  def updateReturn(
    node: typescriptLib.typescriptMod.ReturnStatement,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ReturnStatement = js.native
  def updateSetAccessor(
    node: typescriptLib.typescriptMod.SetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def updateSetAccessor(
    node: typescriptLib.typescriptMod.SetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def updateSetAccessor(
    node: typescriptLib.typescriptMod.SetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def updateSetAccessor(
    node: typescriptLib.typescriptMod.SetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def updateSetAccessor(
    node: typescriptLib.typescriptMod.SetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def updateSetAccessor(
    node: typescriptLib.typescriptMod.SetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def updateSetAccessor(
    node: typescriptLib.typescriptMod.SetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration]
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def updateSetAccessor(
    node: typescriptLib.typescriptMod.SetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.ParameterDeclaration],
    body: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.SetAccessorDeclaration = js.native
  def updateShorthandPropertyAssignment(
    node: typescriptLib.typescriptMod.ShorthandPropertyAssignment,
    name: typescriptLib.typescriptMod.Identifier
  ): typescriptLib.typescriptMod.ShorthandPropertyAssignment = js.native
  def updateShorthandPropertyAssignment(
    node: typescriptLib.typescriptMod.ShorthandPropertyAssignment,
    name: typescriptLib.typescriptMod.Identifier,
    objectAssignmentInitializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ShorthandPropertyAssignment = js.native
  def updateSourceFile(
    sourceFile: typescriptLib.typescriptMod.SourceFile,
    newText: java.lang.String,
    textChangeRange: typescriptLib.typescriptMod.TextChangeRange
  ): typescriptLib.typescriptMod.SourceFile = js.native
  def updateSourceFile(
    sourceFile: typescriptLib.typescriptMod.SourceFile,
    newText: java.lang.String,
    textChangeRange: typescriptLib.typescriptMod.TextChangeRange,
    aggressiveChecks: scala.Boolean
  ): typescriptLib.typescriptMod.SourceFile = js.native
  def updateSourceFileNode(
    node: typescriptLib.typescriptMod.SourceFile,
    statements: js.Array[typescriptLib.typescriptMod.Statement]
  ): typescriptLib.typescriptMod.SourceFile = js.native
  def updateSourceFileNode(
    node: typescriptLib.typescriptMod.SourceFile,
    statements: js.Array[typescriptLib.typescriptMod.Statement],
    isDeclarationFile: scala.Boolean
  ): typescriptLib.typescriptMod.SourceFile = js.native
  def updateSourceFileNode(
    node: typescriptLib.typescriptMod.SourceFile,
    statements: js.Array[typescriptLib.typescriptMod.Statement],
    isDeclarationFile: scala.Boolean,
    referencedFiles: js.Array[typescriptLib.typescriptMod.FileReference]
  ): typescriptLib.typescriptMod.SourceFile = js.native
  def updateSourceFileNode(
    node: typescriptLib.typescriptMod.SourceFile,
    statements: js.Array[typescriptLib.typescriptMod.Statement],
    isDeclarationFile: scala.Boolean,
    referencedFiles: js.Array[typescriptLib.typescriptMod.FileReference],
    typeReferences: js.Array[typescriptLib.typescriptMod.FileReference]
  ): typescriptLib.typescriptMod.SourceFile = js.native
  def updateSourceFileNode(
    node: typescriptLib.typescriptMod.SourceFile,
    statements: js.Array[typescriptLib.typescriptMod.Statement],
    isDeclarationFile: scala.Boolean,
    referencedFiles: js.Array[typescriptLib.typescriptMod.FileReference],
    typeReferences: js.Array[typescriptLib.typescriptMod.FileReference],
    hasNoDefaultLib: scala.Boolean
  ): typescriptLib.typescriptMod.SourceFile = js.native
  def updateSourceFileNode(
    node: typescriptLib.typescriptMod.SourceFile,
    statements: js.Array[typescriptLib.typescriptMod.Statement],
    isDeclarationFile: scala.Boolean,
    referencedFiles: js.Array[typescriptLib.typescriptMod.FileReference],
    typeReferences: js.Array[typescriptLib.typescriptMod.FileReference],
    hasNoDefaultLib: scala.Boolean,
    libReferences: js.Array[typescriptLib.typescriptMod.FileReference]
  ): typescriptLib.typescriptMod.SourceFile = js.native
  def updateSpread(
    node: typescriptLib.typescriptMod.SpreadElement,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.SpreadElement = js.native
  def updateSpreadAssignment(
    node: typescriptLib.typescriptMod.SpreadAssignment,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.SpreadAssignment = js.native
  /** @deprecated Use `updateExpressionStatement` instead.  */
  def updateStatement(
    node: typescriptLib.typescriptMod.ExpressionStatement,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ExpressionStatement = js.native
  def updateSwitch(
    node: typescriptLib.typescriptMod.SwitchStatement,
    expression: typescriptLib.typescriptMod.Expression,
    caseBlock: typescriptLib.typescriptMod.CaseBlock
  ): typescriptLib.typescriptMod.SwitchStatement = js.native
  /** @deprecated */ def updateTaggedTemplate(
    node: typescriptLib.typescriptMod.TaggedTemplateExpression,
    tag: typescriptLib.typescriptMod.Expression,
    template: typescriptLib.typescriptMod.TemplateLiteral
  ): typescriptLib.typescriptMod.TaggedTemplateExpression = js.native
  def updateTaggedTemplate(
    node: typescriptLib.typescriptMod.TaggedTemplateExpression,
    tag: typescriptLib.typescriptMod.Expression,
    typeArguments: js.Array[typescriptLib.typescriptMod.TypeNode],
    template: typescriptLib.typescriptMod.TemplateLiteral
  ): typescriptLib.typescriptMod.TaggedTemplateExpression = js.native
  def updateTaggedTemplate(
    node: typescriptLib.typescriptMod.TaggedTemplateExpression,
    tag: typescriptLib.typescriptMod.Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    template: typescriptLib.typescriptMod.TemplateLiteral
  ): typescriptLib.typescriptMod.TaggedTemplateExpression = js.native
  def updateTemplateExpression(
    node: typescriptLib.typescriptMod.TemplateExpression,
    head: typescriptLib.typescriptMod.TemplateHead,
    templateSpans: js.Array[typescriptLib.typescriptMod.TemplateSpan]
  ): typescriptLib.typescriptMod.TemplateExpression = js.native
  def updateTemplateSpan(
    node: typescriptLib.typescriptMod.TemplateSpan,
    expression: typescriptLib.typescriptMod.Expression,
    literal: typescriptLib.typescriptMod.TemplateMiddle
  ): typescriptLib.typescriptMod.TemplateSpan = js.native
  def updateTemplateSpan(
    node: typescriptLib.typescriptMod.TemplateSpan,
    expression: typescriptLib.typescriptMod.Expression,
    literal: typescriptLib.typescriptMod.TemplateTail
  ): typescriptLib.typescriptMod.TemplateSpan = js.native
  def updateThrow(
    node: typescriptLib.typescriptMod.ThrowStatement,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.ThrowStatement = js.native
  def updateTry(node: typescriptLib.typescriptMod.TryStatement, tryBlock: typescriptLib.typescriptMod.Block): typescriptLib.typescriptMod.TryStatement = js.native
  def updateTry(
    node: typescriptLib.typescriptMod.TryStatement,
    tryBlock: typescriptLib.typescriptMod.Block,
    catchClause: js.UndefOr[scala.Nothing],
    finallyBlock: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.TryStatement = js.native
  def updateTry(
    node: typescriptLib.typescriptMod.TryStatement,
    tryBlock: typescriptLib.typescriptMod.Block,
    catchClause: typescriptLib.typescriptMod.CatchClause
  ): typescriptLib.typescriptMod.TryStatement = js.native
  def updateTry(
    node: typescriptLib.typescriptMod.TryStatement,
    tryBlock: typescriptLib.typescriptMod.Block,
    catchClause: typescriptLib.typescriptMod.CatchClause,
    finallyBlock: typescriptLib.typescriptMod.Block
  ): typescriptLib.typescriptMod.TryStatement = js.native
  def updateTupleTypeNode(
    node: typescriptLib.typescriptMod.TupleTypeNode,
    elementTypes: js.Array[typescriptLib.typescriptMod.TypeNode]
  ): typescriptLib.typescriptMod.TupleTypeNode = js.native
  def updateTypeAliasDeclaration(
    node: typescriptLib.typescriptMod.TypeAliasDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: typescriptLib.typescriptMod.TypeAliasDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: typescriptLib.typescriptMod.TypeAliasDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: typescriptLib.typescriptMod.TypeAliasDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: typescriptLib.typescriptMod.TypeAliasDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: typescriptLib.typescriptMod.TypeAliasDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: typescriptLib.typescriptMod.TypeAliasDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: typescriptLib.typescriptMod.TypeAliasDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeAliasDeclaration = js.native
  def updateTypeAssertion(
    node: typescriptLib.typescriptMod.TypeAssertion,
    `type`: typescriptLib.typescriptMod.TypeNode,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.TypeAssertion = js.native
  def updateTypeLiteralNode(
    node: typescriptLib.typescriptMod.TypeLiteralNode,
    members: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeElement]
  ): typescriptLib.typescriptMod.TypeLiteralNode = js.native
  def updateTypeOf(
    node: typescriptLib.typescriptMod.TypeOfExpression,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.TypeOfExpression = js.native
  def updateTypeOperatorNode(node: typescriptLib.typescriptMod.TypeOperatorNode, `type`: typescriptLib.typescriptMod.TypeNode): typescriptLib.typescriptMod.TypeOperatorNode = js.native
  def updateTypeParameterDeclaration(
    node: typescriptLib.typescriptMod.TypeParameterDeclaration,
    name: typescriptLib.typescriptMod.Identifier
  ): typescriptLib.typescriptMod.TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(
    node: typescriptLib.typescriptMod.TypeParameterDeclaration,
    name: typescriptLib.typescriptMod.Identifier,
    constraint: js.UndefOr[scala.Nothing],
    defaultType: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(
    node: typescriptLib.typescriptMod.TypeParameterDeclaration,
    name: typescriptLib.typescriptMod.Identifier,
    constraint: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(
    node: typescriptLib.typescriptMod.TypeParameterDeclaration,
    name: typescriptLib.typescriptMod.Identifier,
    constraint: typescriptLib.typescriptMod.TypeNode,
    defaultType: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypeParameterDeclaration = js.native
  def updateTypePredicateNode(
    node: typescriptLib.typescriptMod.TypePredicateNode,
    parameterName: typescriptLib.typescriptMod.Identifier,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypePredicateNode = js.native
  def updateTypePredicateNode(
    node: typescriptLib.typescriptMod.TypePredicateNode,
    parameterName: typescriptLib.typescriptMod.ThisTypeNode,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.TypePredicateNode = js.native
  def updateTypeQueryNode(node: typescriptLib.typescriptMod.TypeQueryNode, exprName: typescriptLib.typescriptMod.EntityName): typescriptLib.typescriptMod.TypeQueryNode = js.native
  def updateTypeReferenceNode(
    node: typescriptLib.typescriptMod.TypeReferenceNode,
    typeName: typescriptLib.typescriptMod.EntityName
  ): typescriptLib.typescriptMod.TypeReferenceNode = js.native
  def updateTypeReferenceNode(
    node: typescriptLib.typescriptMod.TypeReferenceNode,
    typeName: typescriptLib.typescriptMod.EntityName,
    typeArguments: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeNode]
  ): typescriptLib.typescriptMod.TypeReferenceNode = js.native
  def updateUnionTypeNode(
    node: typescriptLib.typescriptMod.UnionTypeNode,
    types: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeNode]
  ): typescriptLib.typescriptMod.UnionTypeNode = js.native
  def updateVariableDeclaration(
    node: typescriptLib.typescriptMod.VariableDeclaration,
    name: typescriptLib.typescriptMod.BindingName
  ): typescriptLib.typescriptMod.VariableDeclaration = js.native
  def updateVariableDeclaration(
    node: typescriptLib.typescriptMod.VariableDeclaration,
    name: typescriptLib.typescriptMod.BindingName,
    `type`: js.UndefOr[scala.Nothing],
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.VariableDeclaration = js.native
  def updateVariableDeclaration(
    node: typescriptLib.typescriptMod.VariableDeclaration,
    name: typescriptLib.typescriptMod.BindingName,
    `type`: typescriptLib.typescriptMod.TypeNode
  ): typescriptLib.typescriptMod.VariableDeclaration = js.native
  def updateVariableDeclaration(
    node: typescriptLib.typescriptMod.VariableDeclaration,
    name: typescriptLib.typescriptMod.BindingName,
    `type`: typescriptLib.typescriptMod.TypeNode,
    initializer: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.VariableDeclaration = js.native
  def updateVariableDeclarationList(
    node: typescriptLib.typescriptMod.VariableDeclarationList,
    declarations: js.Array[typescriptLib.typescriptMod.VariableDeclaration]
  ): typescriptLib.typescriptMod.VariableDeclarationList = js.native
  def updateVariableStatement(
    node: typescriptLib.typescriptMod.VariableStatement,
    modifiers: js.Array[typescriptLib.typescriptMod.Modifier],
    declarationList: typescriptLib.typescriptMod.VariableDeclarationList
  ): typescriptLib.typescriptMod.VariableStatement = js.native
  def updateVariableStatement(
    node: typescriptLib.typescriptMod.VariableStatement,
    modifiers: js.UndefOr[scala.Nothing],
    declarationList: typescriptLib.typescriptMod.VariableDeclarationList
  ): typescriptLib.typescriptMod.VariableStatement = js.native
  def updateVoid(
    node: typescriptLib.typescriptMod.VoidExpression,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.VoidExpression = js.native
  def updateWhile(
    node: typescriptLib.typescriptMod.WhileStatement,
    expression: typescriptLib.typescriptMod.Expression,
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.WhileStatement = js.native
  def updateWith(
    node: typescriptLib.typescriptMod.WithStatement,
    expression: typescriptLib.typescriptMod.Expression,
    statement: typescriptLib.typescriptMod.Statement
  ): typescriptLib.typescriptMod.WithStatement = js.native
  def updateYield(
    node: typescriptLib.typescriptMod.YieldExpression,
    asteriskToken: js.UndefOr[scala.Nothing],
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.YieldExpression = js.native
  def updateYield(
    node: typescriptLib.typescriptMod.YieldExpression,
    asteriskToken: typescriptLib.typescriptMod.AsteriskToken,
    expression: typescriptLib.typescriptMod.Expression
  ): typescriptLib.typescriptMod.YieldExpression = js.native
  /**
    * Checks to see if the locale is in the appropriate format,
    * and if it is, attempts to set the appropriate language.
    */
  def validateLocaleAndSetLanguage(locale: java.lang.String, sys: typescriptLib.Anon_FileExists): scala.Unit = js.native
  def validateLocaleAndSetLanguage(
    locale: java.lang.String,
    sys: typescriptLib.Anon_FileExists,
    errors: typescriptLib.typescriptMod.Push[typescriptLib.typescriptMod.Diagnostic]
  ): scala.Unit = js.native
  /**
    * Visits each child of a Node using the supplied visitor, possibly returning a new Node of the same kind in its place.
    *
    * @param node The Node whose children will be visited.
    * @param visitor The callback used to visit each child.
    * @param context A lexical environment context for the visitor.
    */
  def visitEachChild[T /* <: typescriptLib.typescriptMod.Node */](
    node: T,
    visitor: typescriptLib.typescriptMod.Visitor,
    context: typescriptLib.typescriptMod.TransformationContext
  ): T = js.native
  def visitEachChild[T /* <: typescriptLib.typescriptMod.Node */](
    node: T,
    visitor: typescriptLib.typescriptMod.Visitor,
    context: typescriptLib.typescriptMod.TransformationContext,
    nodesVisitor: typescriptLib.Anon_Count
  ): js.UndefOr[T] = js.native
  def visitEachChild[T /* <: typescriptLib.typescriptMod.Node */](
    node: T,
    visitor: typescriptLib.typescriptMod.Visitor,
    context: typescriptLib.typescriptMod.TransformationContext,
    nodesVisitor: typescriptLib.Anon_Count,
    tokenVisitor: typescriptLib.typescriptMod.Visitor
  ): js.UndefOr[T] = js.native
  def visitEachChild[T /* <: typescriptLib.typescriptMod.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.Visitor,
    context: typescriptLib.typescriptMod.TransformationContext
  ): js.UndefOr[T] = js.native
  def visitEachChild[T /* <: typescriptLib.typescriptMod.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.Visitor,
    context: typescriptLib.typescriptMod.TransformationContext,
    nodesVisitor: typescriptLib.Anon_Count
  ): js.UndefOr[T] = js.native
  def visitEachChild[T /* <: typescriptLib.typescriptMod.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.Visitor,
    context: typescriptLib.typescriptMod.TransformationContext,
    nodesVisitor: typescriptLib.Anon_Count,
    tokenVisitor: typescriptLib.typescriptMod.Visitor
  ): js.UndefOr[T] = js.native
  /**
    * Visits each child of a Node using the supplied visitor, possibly returning a new Node of the same kind in its place.
    *
    * @param node The Node whose children will be visited.
    * @param visitor The callback used to visit each child.
    * @param context A lexical environment context for the visitor.
    */
  @JSName("visitEachChild")
  def visitEachChild_TNodeUndefOr[T /* <: typescriptLib.typescriptMod.Node */](
    node: T,
    visitor: typescriptLib.typescriptMod.Visitor,
    context: typescriptLib.typescriptMod.TransformationContext
  ): js.UndefOr[T] = js.native
  def visitFunctionBody(
    node: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.Visitor,
    context: typescriptLib.typescriptMod.TransformationContext
  ): js.UndefOr[typescriptLib.typescriptMod.FunctionBody] = js.native
  /**
    * Resumes a suspended lexical environment and visits a function body, ending the lexical
    * environment and merging hoisted declarations upon completion.
    */
  def visitFunctionBody(
    node: typescriptLib.typescriptMod.FunctionBody,
    visitor: typescriptLib.typescriptMod.Visitor,
    context: typescriptLib.typescriptMod.TransformationContext
  ): js.UndefOr[typescriptLib.typescriptMod.FunctionBody] = js.native
  /**
    * Resumes a suspended lexical environment and visits a concise body, ending the lexical
    * environment and merging hoisted declarations upon completion.
    */
  @JSName("visitFunctionBody")
  def visitFunctionBody_ConciseBody(
    node: typescriptLib.typescriptMod.ConciseBody,
    visitor: typescriptLib.typescriptMod.Visitor,
    context: typescriptLib.typescriptMod.TransformationContext
  ): typescriptLib.typescriptMod.ConciseBody = js.native
  /**
    * Resumes a suspended lexical environment and visits a function body, ending the lexical
    * environment and merging hoisted declarations upon completion.
    */
  @JSName("visitFunctionBody")
  def visitFunctionBody_FunctionBody(
    node: typescriptLib.typescriptMod.FunctionBody,
    visitor: typescriptLib.typescriptMod.Visitor,
    context: typescriptLib.typescriptMod.TransformationContext
  ): typescriptLib.typescriptMod.FunctionBody = js.native
  /**
    * Starts a new lexical environment and visits a statement list, ending the lexical environment
    * and merging hoisted declarations upon completion.
    */
  def visitLexicalEnvironment(
    statements: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.Statement],
    visitor: typescriptLib.typescriptMod.Visitor,
    context: typescriptLib.typescriptMod.TransformationContext
  ): typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.Statement] = js.native
  def visitLexicalEnvironment(
    statements: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.Statement],
    visitor: typescriptLib.typescriptMod.Visitor,
    context: typescriptLib.typescriptMod.TransformationContext,
    start: scala.Double
  ): typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.Statement] = js.native
  def visitLexicalEnvironment(
    statements: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.Statement],
    visitor: typescriptLib.typescriptMod.Visitor,
    context: typescriptLib.typescriptMod.TransformationContext,
    start: scala.Double,
    ensureUseStrict: scala.Boolean
  ): typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.Statement] = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.Node */](): T = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.Node */](node: T): T = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.Node */](
    node: T,
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean]
  ): T = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.Node */](
    node: T,
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean],
    lift: js.Function1[
      /* node */ typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.Node], 
      T
    ]
  ): T = js.native
  /**
    * Visits a Node using the supplied visitor, possibly returning a new Node in its place.
    *
    * @param node The Node to visit.
    * @param visitor The callback used to visit the Node.
    * @param test A callback to execute to verify the Node is valid.
    * @param lift An optional callback to execute to lift a NodeArray into a valid Node.
    */
  def visitNode[T /* <: typescriptLib.typescriptMod.Node */](node: T, visitor: typescriptLib.typescriptMod.Visitor): T = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.Node */](
    node: T,
    visitor: typescriptLib.typescriptMod.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean]
  ): T = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.Node */](
    node: T,
    visitor: typescriptLib.typescriptMod.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean],
    lift: js.Function1[
      /* node */ typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.Node], 
      T
    ]
  ): T = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean]
  ): T = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean],
    lift: js.Function1[
      /* node */ typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.Node], 
      T
    ]
  ): T = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.Node */](node: js.UndefOr[scala.Nothing], visitor: typescriptLib.typescriptMod.Visitor): T = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean]
  ): T = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean],
    lift: js.Function1[
      /* node */ typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.Node], 
      T
    ]
  ): T = js.native
  @JSName("visitNode")
  def visitNode_TNodeUndefOr[T /* <: typescriptLib.typescriptMod.Node */](): js.UndefOr[T] = js.native
  @JSName("visitNode")
  def visitNode_TNodeUndefOr[T /* <: typescriptLib.typescriptMod.Node */](node: T): js.UndefOr[T] = js.native
  @JSName("visitNode")
  def visitNode_TNodeUndefOr[T /* <: typescriptLib.typescriptMod.Node */](
    node: T,
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean]
  ): js.UndefOr[T] = js.native
  @JSName("visitNode")
  def visitNode_TNodeUndefOr[T /* <: typescriptLib.typescriptMod.Node */](
    node: T,
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean],
    lift: js.Function1[
      /* node */ typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.Node], 
      T
    ]
  ): js.UndefOr[T] = js.native
  /**
    * Visits a Node using the supplied visitor, possibly returning a new Node in its place.
    *
    * @param node The Node to visit.
    * @param visitor The callback used to visit the Node.
    * @param test A callback to execute to verify the Node is valid.
    * @param lift An optional callback to execute to lift a NodeArray into a valid Node.
    */
  @JSName("visitNode")
  def visitNode_TNodeUndefOr[T /* <: typescriptLib.typescriptMod.Node */](node: T, visitor: typescriptLib.typescriptMod.Visitor): js.UndefOr[T] = js.native
  @JSName("visitNode")
  def visitNode_TNodeUndefOr[T /* <: typescriptLib.typescriptMod.Node */](
    node: T,
    visitor: typescriptLib.typescriptMod.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean]
  ): js.UndefOr[T] = js.native
  @JSName("visitNode")
  def visitNode_TNodeUndefOr[T /* <: typescriptLib.typescriptMod.Node */](
    node: T,
    visitor: typescriptLib.typescriptMod.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean],
    lift: js.Function1[
      /* node */ typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.Node], 
      T
    ]
  ): js.UndefOr[T] = js.native
  @JSName("visitNode")
  def visitNode_TNodeUndefOr[T /* <: typescriptLib.typescriptMod.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean]
  ): js.UndefOr[T] = js.native
  @JSName("visitNode")
  def visitNode_TNodeUndefOr[T /* <: typescriptLib.typescriptMod.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean],
    lift: js.Function1[
      /* node */ typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.Node], 
      T
    ]
  ): js.UndefOr[T] = js.native
  @JSName("visitNode")
  def visitNode_TNodeUndefOr[T /* <: typescriptLib.typescriptMod.Node */](node: js.UndefOr[scala.Nothing], visitor: typescriptLib.typescriptMod.Visitor): js.UndefOr[T] = js.native
  @JSName("visitNode")
  def visitNode_TNodeUndefOr[T /* <: typescriptLib.typescriptMod.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean]
  ): js.UndefOr[T] = js.native
  @JSName("visitNode")
  def visitNode_TNodeUndefOr[T /* <: typescriptLib.typescriptMod.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean],
    lift: js.Function1[
      /* node */ typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.Node], 
      T
    ]
  ): js.UndefOr[T] = js.native
  def visitNodes[T /* <: typescriptLib.typescriptMod.Node */](nodes: js.UndefOr[scala.Nothing], visitor: typescriptLib.typescriptMod.Visitor): js.UndefOr[typescriptLib.typescriptMod.NodeArray[T]] = js.native
  def visitNodes[T /* <: typescriptLib.typescriptMod.Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean]
  ): js.UndefOr[typescriptLib.typescriptMod.NodeArray[T]] = js.native
  def visitNodes[T /* <: typescriptLib.typescriptMod.Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean],
    start: scala.Double
  ): js.UndefOr[typescriptLib.typescriptMod.NodeArray[T]] = js.native
  def visitNodes[T /* <: typescriptLib.typescriptMod.Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean],
    start: scala.Double,
    count: scala.Double
  ): js.UndefOr[typescriptLib.typescriptMod.NodeArray[T]] = js.native
  /**
    * Visits a NodeArray using the supplied visitor, possibly returning a new NodeArray in its place.
    *
    * @param nodes The NodeArray to visit.
    * @param visitor The callback used to visit a Node.
    * @param test A node test to execute for each node.
    * @param start An optional value indicating the starting offset at which to start visiting.
    * @param count An optional value indicating the maximum number of nodes to visit.
    */
  def visitNodes[T /* <: typescriptLib.typescriptMod.Node */](nodes: typescriptLib.typescriptMod.NodeArray[T], visitor: typescriptLib.typescriptMod.Visitor): js.UndefOr[typescriptLib.typescriptMod.NodeArray[T]] = js.native
  def visitNodes[T /* <: typescriptLib.typescriptMod.Node */](
    nodes: typescriptLib.typescriptMod.NodeArray[T],
    visitor: typescriptLib.typescriptMod.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean]
  ): js.UndefOr[typescriptLib.typescriptMod.NodeArray[T]] = js.native
  def visitNodes[T /* <: typescriptLib.typescriptMod.Node */](
    nodes: typescriptLib.typescriptMod.NodeArray[T],
    visitor: typescriptLib.typescriptMod.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean],
    start: scala.Double
  ): js.UndefOr[typescriptLib.typescriptMod.NodeArray[T]] = js.native
  def visitNodes[T /* <: typescriptLib.typescriptMod.Node */](
    nodes: typescriptLib.typescriptMod.NodeArray[T],
    visitor: typescriptLib.typescriptMod.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean],
    start: scala.Double,
    count: scala.Double
  ): js.UndefOr[typescriptLib.typescriptMod.NodeArray[T]] = js.native
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: typescriptLib.typescriptMod.Node */](nodes: js.UndefOr[scala.Nothing], visitor: typescriptLib.typescriptMod.Visitor): typescriptLib.typescriptMod.NodeArray[T] = js.native
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: typescriptLib.typescriptMod.Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean]
  ): typescriptLib.typescriptMod.NodeArray[T] = js.native
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: typescriptLib.typescriptMod.Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean],
    start: scala.Double
  ): typescriptLib.typescriptMod.NodeArray[T] = js.native
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: typescriptLib.typescriptMod.Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean],
    start: scala.Double,
    count: scala.Double
  ): typescriptLib.typescriptMod.NodeArray[T] = js.native
  /**
    * Visits a NodeArray using the supplied visitor, possibly returning a new NodeArray in its place.
    *
    * @param nodes The NodeArray to visit.
    * @param visitor The callback used to visit a Node.
    * @param test A node test to execute for each node.
    * @param start An optional value indicating the starting offset at which to start visiting.
    * @param count An optional value indicating the maximum number of nodes to visit.
    */
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: typescriptLib.typescriptMod.Node */](nodes: typescriptLib.typescriptMod.NodeArray[T], visitor: typescriptLib.typescriptMod.Visitor): typescriptLib.typescriptMod.NodeArray[T] = js.native
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: typescriptLib.typescriptMod.Node */](
    nodes: typescriptLib.typescriptMod.NodeArray[T],
    visitor: typescriptLib.typescriptMod.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean]
  ): typescriptLib.typescriptMod.NodeArray[T] = js.native
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: typescriptLib.typescriptMod.Node */](
    nodes: typescriptLib.typescriptMod.NodeArray[T],
    visitor: typescriptLib.typescriptMod.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean],
    start: scala.Double
  ): typescriptLib.typescriptMod.NodeArray[T] = js.native
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: typescriptLib.typescriptMod.Node */](
    nodes: typescriptLib.typescriptMod.NodeArray[T],
    visitor: typescriptLib.typescriptMod.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Boolean],
    start: scala.Double,
    count: scala.Double
  ): typescriptLib.typescriptMod.NodeArray[T] = js.native
  def visitParameterList(
    nodes: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.Visitor,
    context: typescriptLib.typescriptMod.TransformationContext
  ): typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration] = js.native
  def visitParameterList(
    nodes: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.Visitor,
    context: typescriptLib.typescriptMod.TransformationContext,
    nodesVisitor: typescriptLib.Anon_Count
  ): typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration] = js.native
  /**
    * Starts a new lexical environment and visits a parameter list, suspending the lexical
    * environment upon completion.
    */
  def visitParameterList(
    nodes: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration],
    visitor: typescriptLib.typescriptMod.Visitor,
    context: typescriptLib.typescriptMod.TransformationContext
  ): typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration] = js.native
  def visitParameterList(
    nodes: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration],
    visitor: typescriptLib.typescriptMod.Visitor,
    context: typescriptLib.typescriptMod.TransformationContext,
    nodesVisitor: typescriptLib.Anon_Count
  ): typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.ParameterDeclaration] = js.native
  def walkUpBindingElementsAndPatterns(binding: typescriptLib.typescriptMod.BindingElement): typescriptLib.typescriptMod.VariableDeclaration | typescriptLib.typescriptMod.ParameterDeclaration = js.native
}

