package typings.istanbulLibInstrument

import typings.babelTypes.anon.Raw
import typings.babelTypes.mod.AnyTypeAnnotation_
import typings.babelTypes.mod.ArrayExpression_
import typings.babelTypes.mod.ArrayPattern_
import typings.babelTypes.mod.ArrayTypeAnnotation_
import typings.babelTypes.mod.ArrowFunctionExpression_
import typings.babelTypes.mod.AssignmentExpression_
import typings.babelTypes.mod.AssignmentPattern_
import typings.babelTypes.mod.AssignmentProperty
import typings.babelTypes.mod.AwaitExpression_
import typings.babelTypes.mod.BinaryExpression_
import typings.babelTypes.mod.BindExpression_
import typings.babelTypes.mod.BlockStatement_
import typings.babelTypes.mod.BooleanLiteralTypeAnnotation_
import typings.babelTypes.mod.BooleanLiteral_
import typings.babelTypes.mod.BooleanTypeAnnotation_
import typings.babelTypes.mod.BreakStatement_
import typings.babelTypes.mod.CallExpression_
import typings.babelTypes.mod.CatchClause_
import typings.babelTypes.mod.ClassBody_
import typings.babelTypes.mod.ClassDeclaration_
import typings.babelTypes.mod.ClassExpression_
import typings.babelTypes.mod.ClassImplements_
import typings.babelTypes.mod.ClassMethod_
import typings.babelTypes.mod.ClassProperty_
import typings.babelTypes.mod.Comment
import typings.babelTypes.mod.ConditionalExpression_
import typings.babelTypes.mod.ContinueStatement_
import typings.babelTypes.mod.DebuggerStatement_
import typings.babelTypes.mod.Declaration
import typings.babelTypes.mod.DeclareClass_
import typings.babelTypes.mod.DeclareFunction_
import typings.babelTypes.mod.DeclareInterface_
import typings.babelTypes.mod.DeclareModule_
import typings.babelTypes.mod.DeclareTypeAlias_
import typings.babelTypes.mod.DeclareVariable_
import typings.babelTypes.mod.Decorator_
import typings.babelTypes.mod.DirectiveLiteral_
import typings.babelTypes.mod.Directive_
import typings.babelTypes.mod.DoExpression_
import typings.babelTypes.mod.DoWhileStatement_
import typings.babelTypes.mod.EmptyStatement_
import typings.babelTypes.mod.ExistentialTypeParam_
import typings.babelTypes.mod.ExportAllDeclaration_
import typings.babelTypes.mod.ExportDefaultDeclaration_
import typings.babelTypes.mod.ExportDefaultSpecifier_
import typings.babelTypes.mod.ExportNamedDeclaration_
import typings.babelTypes.mod.ExportNamespaceSpecifier_
import typings.babelTypes.mod.ExportSpecifier_
import typings.babelTypes.mod.Expression
import typings.babelTypes.mod.ExpressionStatement_
import typings.babelTypes.mod.File_
import typings.babelTypes.mod.Flow
import typings.babelTypes.mod.FlowTypeAnnotation
import typings.babelTypes.mod.ForInStatement_
import typings.babelTypes.mod.ForOfStatement_
import typings.babelTypes.mod.ForStatement_
import typings.babelTypes.mod.FunctionDeclaration_
import typings.babelTypes.mod.FunctionExpression_
import typings.babelTypes.mod.FunctionTypeAnnotation_
import typings.babelTypes.mod.FunctionTypeParam_
import typings.babelTypes.mod.GenericTypeAnnotation_
import typings.babelTypes.mod.Identifier_
import typings.babelTypes.mod.IfStatement_
import typings.babelTypes.mod.ImportDeclaration_
import typings.babelTypes.mod.ImportDefaultSpecifier_
import typings.babelTypes.mod.ImportNamespaceSpecifier_
import typings.babelTypes.mod.ImportSpecifier_
import typings.babelTypes.mod.InterfaceDeclaration_
import typings.babelTypes.mod.InterfaceExtends_
import typings.babelTypes.mod.IntersectionTypeAnnotation_
import typings.babelTypes.mod.JSXAttribute_
import typings.babelTypes.mod.JSXClosingElement_
import typings.babelTypes.mod.JSXElement_
import typings.babelTypes.mod.JSXEmptyExpression_
import typings.babelTypes.mod.JSXExpressionContainer_
import typings.babelTypes.mod.JSXIdentifier_
import typings.babelTypes.mod.JSXMemberExpression_
import typings.babelTypes.mod.JSXNamespacedName_
import typings.babelTypes.mod.JSXOpeningElement_
import typings.babelTypes.mod.JSXSpreadAttribute_
import typings.babelTypes.mod.JSXText_
import typings.babelTypes.mod.LVal
import typings.babelTypes.mod.LabeledStatement_
import typings.babelTypes.mod.LogicalExpression_
import typings.babelTypes.mod.MemberExpression_
import typings.babelTypes.mod.MetaProperty_
import typings.babelTypes.mod.MixedTypeAnnotation_
import typings.babelTypes.mod.ModuleDeclaration
import typings.babelTypes.mod.NewExpression_
import typings.babelTypes.mod.Noop_
import typings.babelTypes.mod.NullLiteralTypeAnnotation_
import typings.babelTypes.mod.NullLiteral_
import typings.babelTypes.mod.NullableTypeAnnotation_
import typings.babelTypes.mod.NumberTypeAnnotation_
import typings.babelTypes.mod.NumericLiteralTypeAnnotation_
import typings.babelTypes.mod.NumericLiteral_
import typings.babelTypes.mod.ObjectExpression_
import typings.babelTypes.mod.ObjectMethod_
import typings.babelTypes.mod.ObjectPattern_
import typings.babelTypes.mod.ObjectProperty_
import typings.babelTypes.mod.ObjectTypeAnnotation_
import typings.babelTypes.mod.ObjectTypeCallProperty_
import typings.babelTypes.mod.ObjectTypeIndexer_
import typings.babelTypes.mod.ObjectTypeProperty_
import typings.babelTypes.mod.ParenthesizedExpression_
import typings.babelTypes.mod.Program_
import typings.babelTypes.mod.QualifiedTypeIdentifier_
import typings.babelTypes.mod.ReactHelpers
import typings.babelTypes.mod.RegExpLiteral_
import typings.babelTypes.mod.RestElement_
import typings.babelTypes.mod.RestProperty_
import typings.babelTypes.mod.ReturnStatement_
import typings.babelTypes.mod.SequenceExpression_
import typings.babelTypes.mod.SpreadElement_
import typings.babelTypes.mod.SpreadProperty_
import typings.babelTypes.mod.Statement
import typings.babelTypes.mod.StringLiteralTypeAnnotation_
import typings.babelTypes.mod.StringLiteral_
import typings.babelTypes.mod.StringTypeAnnotation_
import typings.babelTypes.mod.Super
import typings.babelTypes.mod.SwitchCase_
import typings.babelTypes.mod.SwitchStatement_
import typings.babelTypes.mod.TSEntityName
import typings.babelTypes.mod.TSEnumMember
import typings.babelTypes.mod.TSExpressionWithTypeArguments
import typings.babelTypes.mod.TSExternalModuleReference
import typings.babelTypes.mod.TSInterfaceBody
import typings.babelTypes.mod.TSModuleBlock
import typings.babelTypes.mod.TSThisType
import typings.babelTypes.mod.TSType
import typings.babelTypes.mod.TSTypeAnnotation
import typings.babelTypes.mod.TSTypeElement
import typings.babelTypes.mod.TSTypeParameter
import typings.babelTypes.mod.TSTypeParameterInstantiation
import typings.babelTypes.mod.TaggedTemplateExpression_
import typings.babelTypes.mod.TemplateElement_
import typings.babelTypes.mod.TemplateLiteral_
import typings.babelTypes.mod.ThisExpression_
import typings.babelTypes.mod.ThisTypeAnnotation_
import typings.babelTypes.mod.ThrowStatement_
import typings.babelTypes.mod.TryStatement_
import typings.babelTypes.mod.TupleTypeAnnotation_
import typings.babelTypes.mod.TypeAlias_
import typings.babelTypes.mod.TypeAnnotation_
import typings.babelTypes.mod.TypeCastExpression_
import typings.babelTypes.mod.TypeParameterDeclaration_
import typings.babelTypes.mod.TypeParameterInstantiation_
import typings.babelTypes.mod.TypeParameter_
import typings.babelTypes.mod.TypeofTypeAnnotation_
import typings.babelTypes.mod.UnaryExpression_
import typings.babelTypes.mod.UnionTypeAnnotation_
import typings.babelTypes.mod.UpdateExpression_
import typings.babelTypes.mod.VariableDeclaration_
import typings.babelTypes.mod.VariableDeclarator_
import typings.babelTypes.mod.VoidTypeAnnotation_
import typings.babelTypes.mod.WhileStatement_
import typings.babelTypes.mod.WithStatement_
import typings.babelTypes.mod.YieldExpression_
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.Ampersand
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.AmpersandAmpersand
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.Asterisk
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.AsteriskAsterisk
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.EqualssignEqualssign
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.EqualssignEqualssignEqualssign
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.Exclamationmark
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.ExclamationmarkEqualssign
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.ExclamationmarkEqualssignEqualssign
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.Greaterthansign
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.GreaterthansignEqualssign
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.GreaterthansignGreaterthansign
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.GreaterthansignGreaterthansignGreaterthansign
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.Lessthansign
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.LessthansignEqualssign
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.LessthansignLessthansign
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.Percentsign
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.Plussign
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.PlussignPlussign
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.Slash
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.Tilde
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.Verticalline
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.VerticallineVerticalline
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.^
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.`--`
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.`-_`
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.`var`
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.const
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.constructor
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.delete
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.get
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.in
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.instanceof
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.let
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.method
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.set
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.typeof
import typings.istanbulLibInstrument.istanbulLibInstrumentStrings.void
import typings.sourceMap.mod.RawSourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FileCoverage extends StObject {
    
    var fileCoverage: typings.istanbulLibCoverage.mod.FileCoverage
    
    var sourceMappingURL: String
  }
  object FileCoverage {
    
    inline def apply(fileCoverage: typings.istanbulLibCoverage.mod.FileCoverage, sourceMappingURL: String): FileCoverage = {
      val __obj = js.Dynamic.literal(fileCoverage = fileCoverage.asInstanceOf[js.Any], sourceMappingURL = sourceMappingURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileCoverage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileCoverage] (val x: Self) extends AnyVal {
      
      inline def setFileCoverage(value: typings.istanbulLibCoverage.mod.FileCoverage): Self = StObject.set(x, "fileCoverage", value.asInstanceOf[js.Any])
      
      inline def setSourceMappingURL(value: String): Self = StObject.set(x, "sourceMappingURL", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<istanbul-lib-instrument.istanbul-lib-instrument.InstrumenterOptions> */
  trait PartialInstrumenterOption extends StObject {
    
    var autoWrap: js.UndefOr[Boolean] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var coverageVariable: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var esModules: js.UndefOr[Boolean] = js.undefined
    
    var preserveComments: js.UndefOr[Boolean] = js.undefined
    
    var produceSourceMap: js.UndefOr[Boolean] = js.undefined
    
    var sourceMapUrlCallback: js.UndefOr[js.Function2[/* filename */ String, /* url */ String, Unit]] = js.undefined
  }
  object PartialInstrumenterOption {
    
    inline def apply(): PartialInstrumenterOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialInstrumenterOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialInstrumenterOption] (val x: Self) extends AnyVal {
      
      inline def setAutoWrap(value: Boolean): Self = StObject.set(x, "autoWrap", value.asInstanceOf[js.Any])
      
      inline def setAutoWrapUndefined: Self = StObject.set(x, "autoWrap", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setCoverageVariable(value: String): Self = StObject.set(x, "coverageVariable", value.asInstanceOf[js.Any])
      
      inline def setCoverageVariableUndefined: Self = StObject.set(x, "coverageVariable", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setEsModules(value: Boolean): Self = StObject.set(x, "esModules", value.asInstanceOf[js.Any])
      
      inline def setEsModulesUndefined: Self = StObject.set(x, "esModules", js.undefined)
      
      inline def setPreserveComments(value: Boolean): Self = StObject.set(x, "preserveComments", value.asInstanceOf[js.Any])
      
      inline def setPreserveCommentsUndefined: Self = StObject.set(x, "preserveComments", js.undefined)
      
      inline def setProduceSourceMap(value: Boolean): Self = StObject.set(x, "produceSourceMap", value.asInstanceOf[js.Any])
      
      inline def setProduceSourceMapUndefined: Self = StObject.set(x, "produceSourceMap", js.undefined)
      
      inline def setSourceMapUrlCallback(value: (/* filename */ String, /* url */ String) => Unit): Self = StObject.set(x, "sourceMapUrlCallback", js.Any.fromFunction2(value))
      
      inline def setSourceMapUrlCallbackUndefined: Self = StObject.set(x, "sourceMapUrlCallback", js.undefined)
    }
  }
  
  /* Inlined std.Partial<istanbul-lib-instrument.istanbul-lib-instrument.VisitorOptions> */
  trait PartialVisitorOptions extends StObject {
    
    var coverageVariable: js.UndefOr[String] = js.undefined
    
    var inputSourceMap: js.UndefOr[RawSourceMap] = js.undefined
  }
  object PartialVisitorOptions {
    
    inline def apply(): PartialVisitorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialVisitorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialVisitorOptions] (val x: Self) extends AnyVal {
      
      inline def setCoverageVariable(value: String): Self = StObject.set(x, "coverageVariable", value.asInstanceOf[js.Any])
      
      inline def setCoverageVariableUndefined: Self = StObject.set(x, "coverageVariable", js.undefined)
      
      inline def setInputSourceMap(value: RawSourceMap): Self = StObject.set(x, "inputSourceMap", value.asInstanceOf[js.Any])
      
      inline def setInputSourceMapUndefined: Self = StObject.set(x, "inputSourceMap", js.undefined)
    }
  }
  
  @js.native
  trait TypeofbabelTypes extends StObject {
    
    def TSAnyKeyword(): typings.babelTypes.mod.TSAnyKeyword = js.native
    
    def TSArrayType(elementType: TSType): typings.babelTypes.mod.TSArrayType = js.native
    
    def TSAsExpression(expression: Expression, typeAnnotation: TSType): typings.babelTypes.mod.TSAsExpression = js.native
    
    def TSBooleanKeyword(): typings.babelTypes.mod.TSBooleanKeyword = js.native
    
    def TSCallSignatureDeclaration(): typings.babelTypes.mod.TSCallSignatureDeclaration = js.native
    def TSCallSignatureDeclaration(typeParameters: Unit, parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.mod.TSCallSignatureDeclaration = js.native
    def TSCallSignatureDeclaration(
      typeParameters: Unit,
      parameters: js.Array[Identifier_ | RestElement_],
      typeAnnotation: TSTypeAnnotation
    ): typings.babelTypes.mod.TSCallSignatureDeclaration = js.native
    def TSCallSignatureDeclaration(typeParameters: Unit, parameters: Unit, typeAnnotation: TSTypeAnnotation): typings.babelTypes.mod.TSCallSignatureDeclaration = js.native
    def TSCallSignatureDeclaration(typeParameters: TypeParameterDeclaration_): typings.babelTypes.mod.TSCallSignatureDeclaration = js.native
    def TSCallSignatureDeclaration(typeParameters: TypeParameterDeclaration_, parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.mod.TSCallSignatureDeclaration = js.native
    def TSCallSignatureDeclaration(
      typeParameters: TypeParameterDeclaration_,
      parameters: js.Array[Identifier_ | RestElement_],
      typeAnnotation: TSTypeAnnotation
    ): typings.babelTypes.mod.TSCallSignatureDeclaration = js.native
    def TSCallSignatureDeclaration(typeParameters: TypeParameterDeclaration_, parameters: Unit, typeAnnotation: TSTypeAnnotation): typings.babelTypes.mod.TSCallSignatureDeclaration = js.native
    
    def TSConstructSignatureDeclaration(): TSTypeElement = js.native
    def TSConstructSignatureDeclaration(typeParameters: Unit, parameters: js.Array[Identifier_ | RestElement_]): TSTypeElement = js.native
    def TSConstructSignatureDeclaration(
      typeParameters: Unit,
      parameters: js.Array[Identifier_ | RestElement_],
      typeAnnotation: TSTypeAnnotation
    ): TSTypeElement = js.native
    def TSConstructSignatureDeclaration(typeParameters: Unit, parameters: Unit, typeAnnotation: TSTypeAnnotation): TSTypeElement = js.native
    def TSConstructSignatureDeclaration(typeParameters: TypeParameterDeclaration_): TSTypeElement = js.native
    def TSConstructSignatureDeclaration(typeParameters: TypeParameterDeclaration_, parameters: js.Array[Identifier_ | RestElement_]): TSTypeElement = js.native
    def TSConstructSignatureDeclaration(
      typeParameters: TypeParameterDeclaration_,
      parameters: js.Array[Identifier_ | RestElement_],
      typeAnnotation: TSTypeAnnotation
    ): TSTypeElement = js.native
    def TSConstructSignatureDeclaration(typeParameters: TypeParameterDeclaration_, parameters: Unit, typeAnnotation: TSTypeAnnotation): TSTypeElement = js.native
    
    def TSConstructorType(): typings.babelTypes.mod.TSConstructorType = js.native
    def TSConstructorType(typeParameters: Unit, typeAnnotation: TSTypeAnnotation): typings.babelTypes.mod.TSConstructorType = js.native
    def TSConstructorType(typeParameters: TypeParameterDeclaration_): typings.babelTypes.mod.TSConstructorType = js.native
    def TSConstructorType(typeParameters: TypeParameterDeclaration_, typeAnnotation: TSTypeAnnotation): typings.babelTypes.mod.TSConstructorType = js.native
    
    def TSDeclareFunction(
      id: js.UndefOr[Identifier_ | Null],
      typeParameters: js.UndefOr[TypeParameterDeclaration_ | Noop_ | Null],
      params: js.Array[LVal],
      returnType: js.UndefOr[TypeAnnotation_ | TSTypeAnnotation | Noop_ | Null]
    ): typings.babelTypes.mod.TSDeclareFunction = js.native
    
    def TSDeclareMethod(decorators: js.Array[Decorator_], key: Expression, typeParameters: Null, params: js.Array[LVal]): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: Null,
      params: js.Array[LVal],
      returnType: Noop_
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: Null,
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: Null,
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(decorators: js.Array[Decorator_], key: Expression, typeParameters: Unit, params: js.Array[LVal]): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: Unit,
      params: js.Array[LVal],
      returnType: Noop_
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: Unit,
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: Unit,
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(decorators: js.Array[Decorator_], key: Expression, typeParameters: Noop_, params: js.Array[LVal]): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: Noop_,
      params: js.Array[LVal],
      returnType: Noop_
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: Noop_,
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: Noop_,
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal]
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal],
      returnType: Noop_
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(decorators: Null, key: Expression, typeParameters: Null, params: js.Array[LVal]): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(decorators: Null, key: Expression, typeParameters: Null, params: js.Array[LVal], returnType: Noop_): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: Null,
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: Null,
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(decorators: Null, key: Expression, typeParameters: Unit, params: js.Array[LVal]): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(decorators: Null, key: Expression, typeParameters: Unit, params: js.Array[LVal], returnType: Noop_): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: Unit,
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: Unit,
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(decorators: Null, key: Expression, typeParameters: Noop_, params: js.Array[LVal]): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: Noop_,
      params: js.Array[LVal],
      returnType: Noop_
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: Noop_,
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: Noop_,
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal]
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal],
      returnType: Noop_
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(decorators: Unit, key: Expression, typeParameters: Null, params: js.Array[LVal]): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(decorators: Unit, key: Expression, typeParameters: Null, params: js.Array[LVal], returnType: Noop_): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Unit,
      key: Expression,
      typeParameters: Null,
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Unit,
      key: Expression,
      typeParameters: Null,
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(decorators: Unit, key: Expression, typeParameters: Unit, params: js.Array[LVal]): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(decorators: Unit, key: Expression, typeParameters: Unit, params: js.Array[LVal], returnType: Noop_): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Unit,
      key: Expression,
      typeParameters: Unit,
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Unit,
      key: Expression,
      typeParameters: Unit,
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(decorators: Unit, key: Expression, typeParameters: Noop_, params: js.Array[LVal]): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Unit,
      key: Expression,
      typeParameters: Noop_,
      params: js.Array[LVal],
      returnType: Noop_
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Unit,
      key: Expression,
      typeParameters: Noop_,
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Unit,
      key: Expression,
      typeParameters: Noop_,
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Unit,
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal]
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Unit,
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal],
      returnType: Noop_
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Unit,
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    def TSDeclareMethod(
      decorators: Unit,
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typings.babelTypes.mod.TSDeclareMethod = js.native
    
    def TSEnumDeclaration(id: Identifier_, members: js.Array[TSEnumMember]): typings.babelTypes.mod.TSEnumDeclaration = js.native
    
    def TSEnumMember(id: Identifier_): typings.babelTypes.mod.TSEnumMember = js.native
    def TSEnumMember(id: Identifier_, initializer: Expression): typings.babelTypes.mod.TSEnumMember = js.native
    def TSEnumMember(id: StringLiteral_): typings.babelTypes.mod.TSEnumMember = js.native
    def TSEnumMember(id: StringLiteral_, initializer: Expression): typings.babelTypes.mod.TSEnumMember = js.native
    
    def TSExportAssignment(expression: Expression): typings.babelTypes.mod.TSExportAssignment = js.native
    
    def TSExpressionWithTypeArguments(expression: TSEntityName): typings.babelTypes.mod.TSExpressionWithTypeArguments = js.native
    def TSExpressionWithTypeArguments(expression: TSEntityName, typeParameters: TypeParameterInstantiation_): typings.babelTypes.mod.TSExpressionWithTypeArguments = js.native
    
    def TSExternalModuleReference(expression: StringLiteral_): typings.babelTypes.mod.TSExternalModuleReference = js.native
    
    def TSFunctionType(): typings.babelTypes.mod.TSFunctionType = js.native
    def TSFunctionType(typeParameters: Unit, typeAnnotation: TSTypeAnnotation): typings.babelTypes.mod.TSFunctionType = js.native
    def TSFunctionType(typeParameters: TypeParameterDeclaration_): typings.babelTypes.mod.TSFunctionType = js.native
    def TSFunctionType(typeParameters: TypeParameterDeclaration_, typeAnnotation: TSTypeAnnotation): typings.babelTypes.mod.TSFunctionType = js.native
    
    def TSImportEqualsDeclaration(id: Identifier_, moduleReference: TSEntityName): typings.babelTypes.mod.TSImportEqualsDeclaration = js.native
    def TSImportEqualsDeclaration(id: Identifier_, moduleReference: TSExternalModuleReference): typings.babelTypes.mod.TSImportEqualsDeclaration = js.native
    
    def TSIndexSignature(parameters: js.Array[Identifier_]): typings.babelTypes.mod.TSIndexSignature = js.native
    def TSIndexSignature(parameters: js.Array[Identifier_], typeAnnotation: TSTypeAnnotation): typings.babelTypes.mod.TSIndexSignature = js.native
    
    def TSIndexedAccessType(objectType: TSType, indexType: TSType): typings.babelTypes.mod.TSIndexedAccessType = js.native
    
    def TSInterfaceBody(body: js.Array[TSTypeElement]): typings.babelTypes.mod.TSInterfaceBody = js.native
    
    def TSInterfaceDeclaration(
      id: Identifier_,
      typeParameters: Null,
      extends_ : js.Array[TSExpressionWithTypeArguments],
      body: TSInterfaceBody
    ): typings.babelTypes.mod.TSInterfaceDeclaration = js.native
    def TSInterfaceDeclaration(id: Identifier_, typeParameters: Null, extends_ : Null, body: TSInterfaceBody): typings.babelTypes.mod.TSInterfaceDeclaration = js.native
    def TSInterfaceDeclaration(id: Identifier_, typeParameters: Null, extends_ : Unit, body: TSInterfaceBody): typings.babelTypes.mod.TSInterfaceDeclaration = js.native
    def TSInterfaceDeclaration(
      id: Identifier_,
      typeParameters: Unit,
      extends_ : js.Array[TSExpressionWithTypeArguments],
      body: TSInterfaceBody
    ): typings.babelTypes.mod.TSInterfaceDeclaration = js.native
    def TSInterfaceDeclaration(id: Identifier_, typeParameters: Unit, extends_ : Null, body: TSInterfaceBody): typings.babelTypes.mod.TSInterfaceDeclaration = js.native
    def TSInterfaceDeclaration(id: Identifier_, typeParameters: Unit, extends_ : Unit, body: TSInterfaceBody): typings.babelTypes.mod.TSInterfaceDeclaration = js.native
    def TSInterfaceDeclaration(
      id: Identifier_,
      typeParameters: TypeParameterDeclaration_,
      extends_ : js.Array[TSExpressionWithTypeArguments],
      body: TSInterfaceBody
    ): typings.babelTypes.mod.TSInterfaceDeclaration = js.native
    def TSInterfaceDeclaration(id: Identifier_, typeParameters: TypeParameterDeclaration_, extends_ : Null, body: TSInterfaceBody): typings.babelTypes.mod.TSInterfaceDeclaration = js.native
    def TSInterfaceDeclaration(id: Identifier_, typeParameters: TypeParameterDeclaration_, extends_ : Unit, body: TSInterfaceBody): typings.babelTypes.mod.TSInterfaceDeclaration = js.native
    
    def TSIntersectionType(types: js.Array[TSType]): typings.babelTypes.mod.TSIntersectionType = js.native
    
    def TSLiteralType(literal: BooleanLiteral_): typings.babelTypes.mod.TSLiteralType = js.native
    def TSLiteralType(literal: NumericLiteral_): typings.babelTypes.mod.TSLiteralType = js.native
    def TSLiteralType(literal: StringLiteral_): typings.babelTypes.mod.TSLiteralType = js.native
    
    def TSMappedType(typeParameter: TypeParameter_): typings.babelTypes.mod.TSMappedType = js.native
    def TSMappedType(typeParameter: TypeParameter_, typeAnnotation: TSType): typings.babelTypes.mod.TSMappedType = js.native
    
    def TSMethodSignature(key: Expression): typings.babelTypes.mod.TSMethodSignature = js.native
    def TSMethodSignature(key: Expression, typeParameters: Unit, parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.mod.TSMethodSignature = js.native
    def TSMethodSignature(
      key: Expression,
      typeParameters: Unit,
      parameters: js.Array[Identifier_ | RestElement_],
      typeAnnotation: TSTypeAnnotation
    ): typings.babelTypes.mod.TSMethodSignature = js.native
    def TSMethodSignature(key: Expression, typeParameters: Unit, parameters: Unit, typeAnnotation: TSTypeAnnotation): typings.babelTypes.mod.TSMethodSignature = js.native
    def TSMethodSignature(key: Expression, typeParameters: TypeParameterDeclaration_): typings.babelTypes.mod.TSMethodSignature = js.native
    def TSMethodSignature(
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      parameters: js.Array[Identifier_ | RestElement_]
    ): typings.babelTypes.mod.TSMethodSignature = js.native
    def TSMethodSignature(
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      parameters: js.Array[Identifier_ | RestElement_],
      typeAnnotation: TSTypeAnnotation
    ): typings.babelTypes.mod.TSMethodSignature = js.native
    def TSMethodSignature(
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      parameters: Unit,
      typeAnnotation: TSTypeAnnotation
    ): typings.babelTypes.mod.TSMethodSignature = js.native
    
    def TSModuleBlock(body: js.Array[Statement]): typings.babelTypes.mod.TSModuleBlock = js.native
    
    def TSModuleDeclaration(id: Identifier_, body: TSModuleBlock): typings.babelTypes.mod.TSModuleDeclaration = js.native
    def TSModuleDeclaration(id: Identifier_, body: typings.babelTypes.mod.TSModuleDeclaration): typings.babelTypes.mod.TSModuleDeclaration = js.native
    def TSModuleDeclaration(id: StringLiteral_, body: TSModuleBlock): typings.babelTypes.mod.TSModuleDeclaration = js.native
    def TSModuleDeclaration(id: StringLiteral_, body: typings.babelTypes.mod.TSModuleDeclaration): typings.babelTypes.mod.TSModuleDeclaration = js.native
    
    def TSNamespaceExportDeclaration(id: Identifier_): typings.babelTypes.mod.TSNamespaceExportDeclaration = js.native
    
    def TSNeverKeyword(): typings.babelTypes.mod.TSNeverKeyword = js.native
    
    def TSNonNullExpression(expression: Expression): typings.babelTypes.mod.TSNonNullExpression = js.native
    
    def TSNullKeyword(): typings.babelTypes.mod.TSNullKeyword = js.native
    
    def TSNumberKeyword(): typings.babelTypes.mod.TSNumberKeyword = js.native
    
    def TSObjectKeyword(): typings.babelTypes.mod.TSObjectKeyword = js.native
    
    def TSParameterProperty(parameter: AssignmentPattern_): typings.babelTypes.mod.TSParameterProperty = js.native
    def TSParameterProperty(parameter: Identifier_): typings.babelTypes.mod.TSParameterProperty = js.native
    
    def TSParenthesizedType(typeAnnotation: TSType): typings.babelTypes.mod.TSParenthesizedType = js.native
    
    def TSPropertySignature(key: Expression): typings.babelTypes.mod.TSPropertySignature = js.native
    def TSPropertySignature(key: Expression, typeAnnotation: Unit, initializer: Expression): typings.babelTypes.mod.TSPropertySignature = js.native
    def TSPropertySignature(key: Expression, typeAnnotation: TSTypeAnnotation): typings.babelTypes.mod.TSPropertySignature = js.native
    def TSPropertySignature(key: Expression, typeAnnotation: TSTypeAnnotation, initializer: Expression): typings.babelTypes.mod.TSPropertySignature = js.native
    
    def TSQualifiedName(left: TSEntityName, right: Identifier_): typings.babelTypes.mod.TSQualifiedName = js.native
    
    def TSStringKeyword(): typings.babelTypes.mod.TSStringKeyword = js.native
    
    def TSSymbolKeyword(): typings.babelTypes.mod.TSSymbolKeyword = js.native
    
    def TSThisType(): typings.babelTypes.mod.TSThisType = js.native
    
    def TSTupleType(elementTypes: js.Array[TSType]): typings.babelTypes.mod.TSTupleType = js.native
    
    def TSTypeAliasDeclaration(id: Identifier_, typeParameters: Null, typeAnnotation: TSType): typings.babelTypes.mod.TSTypeAliasDeclaration = js.native
    def TSTypeAliasDeclaration(id: Identifier_, typeParameters: Unit, typeAnnotation: TSType): typings.babelTypes.mod.TSTypeAliasDeclaration = js.native
    def TSTypeAliasDeclaration(id: Identifier_, typeParameters: TypeParameterDeclaration_, typeAnnotation: TSType): typings.babelTypes.mod.TSTypeAliasDeclaration = js.native
    
    def TSTypeAnnotation(typeAnnotation: TSType): typings.babelTypes.mod.TSTypeAnnotation = js.native
    
    def TSTypeAssertion(typeAnnotation: TSType, expression: Expression): typings.babelTypes.mod.TSTypeAssertion = js.native
    
    def TSTypeLiteral(members: js.Array[TSTypeElement]): typings.babelTypes.mod.TSTypeLiteral = js.native
    
    def TSTypeOperator(typeAnnotation: TSType): typings.babelTypes.mod.TSTypeOperator = js.native
    
    def TSTypeParameter(): typings.babelTypes.mod.TSTypeParameter = js.native
    def TSTypeParameter(constraint: Unit, default_ : TSType): typings.babelTypes.mod.TSTypeParameter = js.native
    def TSTypeParameter(constraint: TSType): typings.babelTypes.mod.TSTypeParameter = js.native
    def TSTypeParameter(constraint: TSType, default_ : TSType): typings.babelTypes.mod.TSTypeParameter = js.native
    
    def TSTypeParameterDeclaration(params: js.Array[TSTypeParameter]): typings.babelTypes.mod.TSTypeParameterDeclaration = js.native
    
    def TSTypeParameterInstantiation(params: js.Array[TSType]): typings.babelTypes.mod.TSTypeParameterInstantiation = js.native
    
    def TSTypePredicate(parameterName: Identifier_, typeAnnotation: TSTypeAnnotation): typings.babelTypes.mod.TSTypePredicate = js.native
    def TSTypePredicate(parameterName: TSThisType, typeAnnotation: TSTypeAnnotation): typings.babelTypes.mod.TSTypePredicate = js.native
    
    def TSTypeQuery(exprName: TSEntityName): typings.babelTypes.mod.TSTypeQuery = js.native
    
    def TSTypeReference(typeName: TSEntityName): typings.babelTypes.mod.TSTypeReference = js.native
    def TSTypeReference(typeName: TSEntityName, typeParameters: TSTypeParameterInstantiation): typings.babelTypes.mod.TSTypeReference = js.native
    
    def TSUndefinedKeyword(): typings.babelTypes.mod.TSUndefinedKeyword = js.native
    
    def TSUnionType(types: js.Array[TSType]): typings.babelTypes.mod.TSUnionType = js.native
    
    def TSVoidKeyword(): typings.babelTypes.mod.TSVoidKeyword = js.native
    
    def anyTypeAnnotation(): AnyTypeAnnotation_ = js.native
    
    def arrayExpression(): ArrayExpression_ = js.native
    def arrayExpression(elements: js.Array[Null | Expression | SpreadElement_]): ArrayExpression_ = js.native
    
    def arrayPattern(): ArrayPattern_ = js.native
    def arrayPattern(elements: js.Array[Expression]): ArrayPattern_ = js.native
    def arrayPattern(elements: js.Array[Expression], typeAnnotation: TypeAnnotation_): ArrayPattern_ = js.native
    def arrayPattern(elements: Unit, typeAnnotation: TypeAnnotation_): ArrayPattern_ = js.native
    
    def arrayTypeAnnotation(): ArrayTypeAnnotation_ = js.native
    def arrayTypeAnnotation(elementType: FlowTypeAnnotation): ArrayTypeAnnotation_ = js.native
    
    def arrowFunctionExpression(): ArrowFunctionExpression_ = js.native
    def arrowFunctionExpression(params: js.Array[LVal]): ArrowFunctionExpression_ = js.native
    def arrowFunctionExpression(params: js.Array[LVal], body: Unit, async: Boolean): ArrowFunctionExpression_ = js.native
    def arrowFunctionExpression(params: js.Array[LVal], body: BlockStatement_): ArrowFunctionExpression_ = js.native
    def arrowFunctionExpression(params: js.Array[LVal], body: BlockStatement_, async: Boolean): ArrowFunctionExpression_ = js.native
    def arrowFunctionExpression(params: js.Array[LVal], body: Expression): ArrowFunctionExpression_ = js.native
    def arrowFunctionExpression(params: js.Array[LVal], body: Expression, async: Boolean): ArrowFunctionExpression_ = js.native
    def arrowFunctionExpression(params: Unit, body: Unit, async: Boolean): ArrowFunctionExpression_ = js.native
    def arrowFunctionExpression(params: Unit, body: BlockStatement_): ArrowFunctionExpression_ = js.native
    def arrowFunctionExpression(params: Unit, body: BlockStatement_, async: Boolean): ArrowFunctionExpression_ = js.native
    def arrowFunctionExpression(params: Unit, body: Expression): ArrowFunctionExpression_ = js.native
    def arrowFunctionExpression(params: Unit, body: Expression, async: Boolean): ArrowFunctionExpression_ = js.native
    
    def assertAnyTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(AnyTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertAnyTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(AnyTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertAnyTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(AnyTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertAnyTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(AnyTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertAnyTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(AnyTypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertArrayExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ArrayExpression))),IArray())*/ Boolean = js.native
    def assertArrayExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ArrayExpression))),IArray())*/ Boolean = js.native
    def assertArrayExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ArrayExpression))),IArray())*/ Boolean = js.native
    def assertArrayExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ArrayExpression))),IArray())*/ Boolean = js.native
    def assertArrayExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ArrayExpression))),IArray())*/ Boolean = js.native
    
    def assertArrayPattern(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ArrayPattern))),IArray())*/ Boolean = js.native
    def assertArrayPattern(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ArrayPattern))),IArray())*/ Boolean = js.native
    def assertArrayPattern(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ArrayPattern))),IArray())*/ Boolean = js.native
    def assertArrayPattern(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ArrayPattern))),IArray())*/ Boolean = js.native
    def assertArrayPattern(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ArrayPattern))),IArray())*/ Boolean = js.native
    
    def assertArrayTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ArrayTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertArrayTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ArrayTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertArrayTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ArrayTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertArrayTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ArrayTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertArrayTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ArrayTypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertArrowFunctionExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ArrowFunctionExpression))),IArray())*/ Boolean = js.native
    def assertArrowFunctionExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ArrowFunctionExpression))),IArray())*/ Boolean = js.native
    def assertArrowFunctionExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ArrowFunctionExpression))),IArray())*/ Boolean = js.native
    def assertArrowFunctionExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ArrowFunctionExpression))),IArray())*/ Boolean = js.native
    def assertArrowFunctionExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ArrowFunctionExpression))),IArray())*/ Boolean = js.native
    
    def assertAssignmentExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(AssignmentExpression))),IArray())*/ Boolean = js.native
    def assertAssignmentExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(AssignmentExpression))),IArray())*/ Boolean = js.native
    def assertAssignmentExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(AssignmentExpression))),IArray())*/ Boolean = js.native
    def assertAssignmentExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(AssignmentExpression))),IArray())*/ Boolean = js.native
    def assertAssignmentExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(AssignmentExpression))),IArray())*/ Boolean = js.native
    
    def assertAssignmentPattern(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(AssignmentPattern))),IArray())*/ Boolean = js.native
    def assertAssignmentPattern(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(AssignmentPattern))),IArray())*/ Boolean = js.native
    def assertAssignmentPattern(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(AssignmentPattern))),IArray())*/ Boolean = js.native
    def assertAssignmentPattern(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(AssignmentPattern))),IArray())*/ Boolean = js.native
    def assertAssignmentPattern(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(AssignmentPattern))),IArray())*/ Boolean = js.native
    
    def assertAwaitExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(AwaitExpression))),IArray())*/ Boolean = js.native
    def assertAwaitExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(AwaitExpression))),IArray())*/ Boolean = js.native
    def assertAwaitExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(AwaitExpression))),IArray())*/ Boolean = js.native
    def assertAwaitExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(AwaitExpression))),IArray())*/ Boolean = js.native
    def assertAwaitExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(AwaitExpression))),IArray())*/ Boolean = js.native
    
    def assertBinary(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Binary))),IArray())*/ Boolean = js.native
    def assertBinary(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Binary))),IArray())*/ Boolean = js.native
    def assertBinary(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Binary))),IArray())*/ Boolean = js.native
    def assertBinary(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Binary))),IArray())*/ Boolean = js.native
    def assertBinary(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Binary))),IArray())*/ Boolean = js.native
    
    def assertBinaryExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BinaryExpression))),IArray())*/ Boolean = js.native
    def assertBinaryExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BinaryExpression))),IArray())*/ Boolean = js.native
    def assertBinaryExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BinaryExpression))),IArray())*/ Boolean = js.native
    def assertBinaryExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BinaryExpression))),IArray())*/ Boolean = js.native
    def assertBinaryExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BinaryExpression))),IArray())*/ Boolean = js.native
    
    def assertBindExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BindExpression))),IArray())*/ Boolean = js.native
    def assertBindExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BindExpression))),IArray())*/ Boolean = js.native
    def assertBindExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BindExpression))),IArray())*/ Boolean = js.native
    def assertBindExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BindExpression))),IArray())*/ Boolean = js.native
    def assertBindExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BindExpression))),IArray())*/ Boolean = js.native
    
    def assertBlock(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Block))),IArray())*/ Boolean = js.native
    def assertBlock(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Block))),IArray())*/ Boolean = js.native
    def assertBlock(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Block))),IArray())*/ Boolean = js.native
    def assertBlock(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Block))),IArray())*/ Boolean = js.native
    def assertBlock(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Block))),IArray())*/ Boolean = js.native
    
    def assertBlockParent(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BlockParent))),IArray())*/ Boolean = js.native
    def assertBlockParent(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BlockParent))),IArray())*/ Boolean = js.native
    def assertBlockParent(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BlockParent))),IArray())*/ Boolean = js.native
    def assertBlockParent(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BlockParent))),IArray())*/ Boolean = js.native
    def assertBlockParent(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BlockParent))),IArray())*/ Boolean = js.native
    
    def assertBlockStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BlockStatement))),IArray())*/ Boolean = js.native
    def assertBlockStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BlockStatement))),IArray())*/ Boolean = js.native
    def assertBlockStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BlockStatement))),IArray())*/ Boolean = js.native
    def assertBlockStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BlockStatement))),IArray())*/ Boolean = js.native
    def assertBlockStatement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BlockStatement))),IArray())*/ Boolean = js.native
    
    def assertBooleanLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BooleanLiteral))),IArray())*/ Boolean = js.native
    def assertBooleanLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BooleanLiteral))),IArray())*/ Boolean = js.native
    def assertBooleanLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BooleanLiteral))),IArray())*/ Boolean = js.native
    def assertBooleanLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BooleanLiteral))),IArray())*/ Boolean = js.native
    def assertBooleanLiteral(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BooleanLiteral))),IArray())*/ Boolean = js.native
    
    def assertBooleanLiteralTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BooleanLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertBooleanLiteralTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BooleanLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertBooleanLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BooleanLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertBooleanLiteralTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BooleanLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertBooleanLiteralTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BooleanLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertBooleanTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BooleanTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertBooleanTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BooleanTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertBooleanTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BooleanTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertBooleanTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BooleanTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertBooleanTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BooleanTypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertBreakStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BreakStatement))),IArray())*/ Boolean = js.native
    def assertBreakStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BreakStatement))),IArray())*/ Boolean = js.native
    def assertBreakStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BreakStatement))),IArray())*/ Boolean = js.native
    def assertBreakStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BreakStatement))),IArray())*/ Boolean = js.native
    def assertBreakStatement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(BreakStatement))),IArray())*/ Boolean = js.native
    
    def assertCallExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(CallExpression))),IArray())*/ Boolean = js.native
    def assertCallExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(CallExpression))),IArray())*/ Boolean = js.native
    def assertCallExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(CallExpression))),IArray())*/ Boolean = js.native
    def assertCallExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(CallExpression))),IArray())*/ Boolean = js.native
    def assertCallExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(CallExpression))),IArray())*/ Boolean = js.native
    
    def assertCatchClause(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(CatchClause))),IArray())*/ Boolean = js.native
    def assertCatchClause(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(CatchClause))),IArray())*/ Boolean = js.native
    def assertCatchClause(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(CatchClause))),IArray())*/ Boolean = js.native
    def assertCatchClause(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(CatchClause))),IArray())*/ Boolean = js.native
    def assertCatchClause(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(CatchClause))),IArray())*/ Boolean = js.native
    
    def assertClass(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Class))),IArray())*/ Boolean = js.native
    def assertClass(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Class))),IArray())*/ Boolean = js.native
    def assertClass(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Class))),IArray())*/ Boolean = js.native
    def assertClass(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Class))),IArray())*/ Boolean = js.native
    def assertClass(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Class))),IArray())*/ Boolean = js.native
    
    def assertClassBody(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassBody))),IArray())*/ Boolean = js.native
    def assertClassBody(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassBody))),IArray())*/ Boolean = js.native
    def assertClassBody(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassBody))),IArray())*/ Boolean = js.native
    def assertClassBody(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassBody))),IArray())*/ Boolean = js.native
    def assertClassBody(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassBody))),IArray())*/ Boolean = js.native
    
    def assertClassDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassDeclaration))),IArray())*/ Boolean = js.native
    def assertClassDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassDeclaration))),IArray())*/ Boolean = js.native
    def assertClassDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassDeclaration))),IArray())*/ Boolean = js.native
    def assertClassDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassDeclaration))),IArray())*/ Boolean = js.native
    def assertClassDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassDeclaration))),IArray())*/ Boolean = js.native
    
    def assertClassExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassExpression))),IArray())*/ Boolean = js.native
    def assertClassExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassExpression))),IArray())*/ Boolean = js.native
    def assertClassExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassExpression))),IArray())*/ Boolean = js.native
    def assertClassExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassExpression))),IArray())*/ Boolean = js.native
    def assertClassExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassExpression))),IArray())*/ Boolean = js.native
    
    def assertClassImplements(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassImplements))),IArray())*/ Boolean = js.native
    def assertClassImplements(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassImplements))),IArray())*/ Boolean = js.native
    def assertClassImplements(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassImplements))),IArray())*/ Boolean = js.native
    def assertClassImplements(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassImplements))),IArray())*/ Boolean = js.native
    def assertClassImplements(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassImplements))),IArray())*/ Boolean = js.native
    
    def assertClassMethod(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassMethod))),IArray())*/ Boolean = js.native
    def assertClassMethod(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassMethod))),IArray())*/ Boolean = js.native
    def assertClassMethod(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassMethod))),IArray())*/ Boolean = js.native
    def assertClassMethod(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassMethod))),IArray())*/ Boolean = js.native
    def assertClassMethod(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassMethod))),IArray())*/ Boolean = js.native
    
    def assertClassProperty(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassProperty))),IArray())*/ Boolean = js.native
    def assertClassProperty(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassProperty))),IArray())*/ Boolean = js.native
    def assertClassProperty(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassProperty))),IArray())*/ Boolean = js.native
    def assertClassProperty(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassProperty))),IArray())*/ Boolean = js.native
    def assertClassProperty(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ClassProperty))),IArray())*/ Boolean = js.native
    
    def assertCompletionStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(CompletionStatement))),IArray())*/ Boolean = js.native
    def assertCompletionStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(CompletionStatement))),IArray())*/ Boolean = js.native
    def assertCompletionStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(CompletionStatement))),IArray())*/ Boolean = js.native
    def assertCompletionStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(CompletionStatement))),IArray())*/ Boolean = js.native
    def assertCompletionStatement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(CompletionStatement))),IArray())*/ Boolean = js.native
    
    def assertConditional(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Conditional))),IArray())*/ Boolean = js.native
    def assertConditional(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Conditional))),IArray())*/ Boolean = js.native
    def assertConditional(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Conditional))),IArray())*/ Boolean = js.native
    def assertConditional(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Conditional))),IArray())*/ Boolean = js.native
    def assertConditional(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Conditional))),IArray())*/ Boolean = js.native
    
    def assertConditionalExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ConditionalExpression))),IArray())*/ Boolean = js.native
    def assertConditionalExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ConditionalExpression))),IArray())*/ Boolean = js.native
    def assertConditionalExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ConditionalExpression))),IArray())*/ Boolean = js.native
    def assertConditionalExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ConditionalExpression))),IArray())*/ Boolean = js.native
    def assertConditionalExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ConditionalExpression))),IArray())*/ Boolean = js.native
    
    def assertContinueStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ContinueStatement))),IArray())*/ Boolean = js.native
    def assertContinueStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ContinueStatement))),IArray())*/ Boolean = js.native
    def assertContinueStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ContinueStatement))),IArray())*/ Boolean = js.native
    def assertContinueStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ContinueStatement))),IArray())*/ Boolean = js.native
    def assertContinueStatement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ContinueStatement))),IArray())*/ Boolean = js.native
    
    def assertDebuggerStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DebuggerStatement))),IArray())*/ Boolean = js.native
    def assertDebuggerStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DebuggerStatement))),IArray())*/ Boolean = js.native
    def assertDebuggerStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DebuggerStatement))),IArray())*/ Boolean = js.native
    def assertDebuggerStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DebuggerStatement))),IArray())*/ Boolean = js.native
    def assertDebuggerStatement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DebuggerStatement))),IArray())*/ Boolean = js.native
    
    def assertDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Declaration))),IArray())*/ Boolean = js.native
    def assertDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Declaration))),IArray())*/ Boolean = js.native
    def assertDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Declaration))),IArray())*/ Boolean = js.native
    def assertDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Declaration))),IArray())*/ Boolean = js.native
    def assertDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Declaration))),IArray())*/ Boolean = js.native
    
    def assertDeclareClass(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareClass))),IArray())*/ Boolean = js.native
    def assertDeclareClass(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareClass))),IArray())*/ Boolean = js.native
    def assertDeclareClass(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareClass))),IArray())*/ Boolean = js.native
    def assertDeclareClass(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareClass))),IArray())*/ Boolean = js.native
    def assertDeclareClass(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareClass))),IArray())*/ Boolean = js.native
    
    def assertDeclareFunction(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareFunction))),IArray())*/ Boolean = js.native
    def assertDeclareFunction(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareFunction))),IArray())*/ Boolean = js.native
    def assertDeclareFunction(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareFunction))),IArray())*/ Boolean = js.native
    def assertDeclareFunction(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareFunction))),IArray())*/ Boolean = js.native
    def assertDeclareFunction(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareFunction))),IArray())*/ Boolean = js.native
    
    def assertDeclareInterface(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareInterface))),IArray())*/ Boolean = js.native
    def assertDeclareInterface(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareInterface))),IArray())*/ Boolean = js.native
    def assertDeclareInterface(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareInterface))),IArray())*/ Boolean = js.native
    def assertDeclareInterface(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareInterface))),IArray())*/ Boolean = js.native
    def assertDeclareInterface(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareInterface))),IArray())*/ Boolean = js.native
    
    def assertDeclareModule(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareModule))),IArray())*/ Boolean = js.native
    def assertDeclareModule(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareModule))),IArray())*/ Boolean = js.native
    def assertDeclareModule(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareModule))),IArray())*/ Boolean = js.native
    def assertDeclareModule(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareModule))),IArray())*/ Boolean = js.native
    def assertDeclareModule(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareModule))),IArray())*/ Boolean = js.native
    
    def assertDeclareTypeAlias(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareTypeAlias))),IArray())*/ Boolean = js.native
    def assertDeclareTypeAlias(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareTypeAlias))),IArray())*/ Boolean = js.native
    def assertDeclareTypeAlias(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareTypeAlias))),IArray())*/ Boolean = js.native
    def assertDeclareTypeAlias(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareTypeAlias))),IArray())*/ Boolean = js.native
    def assertDeclareTypeAlias(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareTypeAlias))),IArray())*/ Boolean = js.native
    
    def assertDeclareVariable(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareVariable))),IArray())*/ Boolean = js.native
    def assertDeclareVariable(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareVariable))),IArray())*/ Boolean = js.native
    def assertDeclareVariable(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareVariable))),IArray())*/ Boolean = js.native
    def assertDeclareVariable(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareVariable))),IArray())*/ Boolean = js.native
    def assertDeclareVariable(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DeclareVariable))),IArray())*/ Boolean = js.native
    
    def assertDecorator(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Decorator))),IArray())*/ Boolean = js.native
    def assertDecorator(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Decorator))),IArray())*/ Boolean = js.native
    def assertDecorator(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Decorator))),IArray())*/ Boolean = js.native
    def assertDecorator(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Decorator))),IArray())*/ Boolean = js.native
    def assertDecorator(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Decorator))),IArray())*/ Boolean = js.native
    
    def assertDirective(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Directive))),IArray())*/ Boolean = js.native
    def assertDirective(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Directive))),IArray())*/ Boolean = js.native
    def assertDirective(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Directive))),IArray())*/ Boolean = js.native
    def assertDirective(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Directive))),IArray())*/ Boolean = js.native
    def assertDirective(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Directive))),IArray())*/ Boolean = js.native
    
    def assertDirectiveLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DirectiveLiteral))),IArray())*/ Boolean = js.native
    def assertDirectiveLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DirectiveLiteral))),IArray())*/ Boolean = js.native
    def assertDirectiveLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DirectiveLiteral))),IArray())*/ Boolean = js.native
    def assertDirectiveLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DirectiveLiteral))),IArray())*/ Boolean = js.native
    def assertDirectiveLiteral(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DirectiveLiteral))),IArray())*/ Boolean = js.native
    
    def assertDoExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DoExpression))),IArray())*/ Boolean = js.native
    def assertDoExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DoExpression))),IArray())*/ Boolean = js.native
    def assertDoExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DoExpression))),IArray())*/ Boolean = js.native
    def assertDoExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DoExpression))),IArray())*/ Boolean = js.native
    def assertDoExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DoExpression))),IArray())*/ Boolean = js.native
    
    def assertDoWhileStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DoWhileStatement))),IArray())*/ Boolean = js.native
    def assertDoWhileStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DoWhileStatement))),IArray())*/ Boolean = js.native
    def assertDoWhileStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DoWhileStatement))),IArray())*/ Boolean = js.native
    def assertDoWhileStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DoWhileStatement))),IArray())*/ Boolean = js.native
    def assertDoWhileStatement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(DoWhileStatement))),IArray())*/ Boolean = js.native
    
    def assertEmptyStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(EmptyStatement))),IArray())*/ Boolean = js.native
    def assertEmptyStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(EmptyStatement))),IArray())*/ Boolean = js.native
    def assertEmptyStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(EmptyStatement))),IArray())*/ Boolean = js.native
    def assertEmptyStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(EmptyStatement))),IArray())*/ Boolean = js.native
    def assertEmptyStatement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(EmptyStatement))),IArray())*/ Boolean = js.native
    
    def assertExistentialTypeParam(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExistentialTypeParam))),IArray())*/ Boolean = js.native
    def assertExistentialTypeParam(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExistentialTypeParam))),IArray())*/ Boolean = js.native
    def assertExistentialTypeParam(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExistentialTypeParam))),IArray())*/ Boolean = js.native
    def assertExistentialTypeParam(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExistentialTypeParam))),IArray())*/ Boolean = js.native
    def assertExistentialTypeParam(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExistentialTypeParam))),IArray())*/ Boolean = js.native
    
    def assertExportAllDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportAllDeclaration))),IArray())*/ Boolean = js.native
    def assertExportAllDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportAllDeclaration))),IArray())*/ Boolean = js.native
    def assertExportAllDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportAllDeclaration))),IArray())*/ Boolean = js.native
    def assertExportAllDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportAllDeclaration))),IArray())*/ Boolean = js.native
    def assertExportAllDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportAllDeclaration))),IArray())*/ Boolean = js.native
    
    def assertExportDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportDeclaration))),IArray())*/ Boolean = js.native
    def assertExportDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportDeclaration))),IArray())*/ Boolean = js.native
    def assertExportDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportDeclaration))),IArray())*/ Boolean = js.native
    def assertExportDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportDeclaration))),IArray())*/ Boolean = js.native
    def assertExportDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportDeclaration))),IArray())*/ Boolean = js.native
    
    def assertExportDefaultDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportDefaultDeclaration))),IArray())*/ Boolean = js.native
    def assertExportDefaultDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportDefaultDeclaration))),IArray())*/ Boolean = js.native
    def assertExportDefaultDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportDefaultDeclaration))),IArray())*/ Boolean = js.native
    def assertExportDefaultDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportDefaultDeclaration))),IArray())*/ Boolean = js.native
    def assertExportDefaultDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportDefaultDeclaration))),IArray())*/ Boolean = js.native
    
    def assertExportDefaultSpecifier(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportDefaultSpecifier))),IArray())*/ Boolean = js.native
    def assertExportDefaultSpecifier(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportDefaultSpecifier))),IArray())*/ Boolean = js.native
    def assertExportDefaultSpecifier(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportDefaultSpecifier))),IArray())*/ Boolean = js.native
    def assertExportDefaultSpecifier(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportDefaultSpecifier))),IArray())*/ Boolean = js.native
    def assertExportDefaultSpecifier(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportDefaultSpecifier))),IArray())*/ Boolean = js.native
    
    def assertExportNamedDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportNamedDeclaration))),IArray())*/ Boolean = js.native
    def assertExportNamedDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportNamedDeclaration))),IArray())*/ Boolean = js.native
    def assertExportNamedDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportNamedDeclaration))),IArray())*/ Boolean = js.native
    def assertExportNamedDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportNamedDeclaration))),IArray())*/ Boolean = js.native
    def assertExportNamedDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportNamedDeclaration))),IArray())*/ Boolean = js.native
    
    def assertExportNamespaceSpecifier(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportNamespaceSpecifier))),IArray())*/ Boolean = js.native
    def assertExportNamespaceSpecifier(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportNamespaceSpecifier))),IArray())*/ Boolean = js.native
    def assertExportNamespaceSpecifier(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportNamespaceSpecifier))),IArray())*/ Boolean = js.native
    def assertExportNamespaceSpecifier(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportNamespaceSpecifier))),IArray())*/ Boolean = js.native
    def assertExportNamespaceSpecifier(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportNamespaceSpecifier))),IArray())*/ Boolean = js.native
    
    def assertExportSpecifier(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportSpecifier))),IArray())*/ Boolean = js.native
    def assertExportSpecifier(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportSpecifier))),IArray())*/ Boolean = js.native
    def assertExportSpecifier(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportSpecifier))),IArray())*/ Boolean = js.native
    def assertExportSpecifier(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportSpecifier))),IArray())*/ Boolean = js.native
    def assertExportSpecifier(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExportSpecifier))),IArray())*/ Boolean = js.native
    
    def assertExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Expression))),IArray())*/ Boolean = js.native
    def assertExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Expression))),IArray())*/ Boolean = js.native
    def assertExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Expression))),IArray())*/ Boolean = js.native
    def assertExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Expression))),IArray())*/ Boolean = js.native
    def assertExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Expression))),IArray())*/ Boolean = js.native
    
    def assertExpressionStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExpressionStatement))),IArray())*/ Boolean = js.native
    def assertExpressionStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExpressionStatement))),IArray())*/ Boolean = js.native
    def assertExpressionStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExpressionStatement))),IArray())*/ Boolean = js.native
    def assertExpressionStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExpressionStatement))),IArray())*/ Boolean = js.native
    def assertExpressionStatement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExpressionStatement))),IArray())*/ Boolean = js.native
    
    def assertExpressionWrapper(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExpressionWrapper))),IArray())*/ Boolean = js.native
    def assertExpressionWrapper(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExpressionWrapper))),IArray())*/ Boolean = js.native
    def assertExpressionWrapper(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExpressionWrapper))),IArray())*/ Boolean = js.native
    def assertExpressionWrapper(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExpressionWrapper))),IArray())*/ Boolean = js.native
    def assertExpressionWrapper(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ExpressionWrapper))),IArray())*/ Boolean = js.native
    
    def assertFile(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(File))),IArray())*/ Boolean = js.native
    def assertFile(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(File))),IArray())*/ Boolean = js.native
    def assertFile(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(File))),IArray())*/ Boolean = js.native
    def assertFile(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(File))),IArray())*/ Boolean = js.native
    def assertFile(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(File))),IArray())*/ Boolean = js.native
    
    def assertFlow(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Flow))),IArray())*/ Boolean = js.native
    def assertFlow(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Flow))),IArray())*/ Boolean = js.native
    def assertFlow(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Flow))),IArray())*/ Boolean = js.native
    def assertFlow(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Flow))),IArray())*/ Boolean = js.native
    def assertFlow(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Flow))),IArray())*/ Boolean = js.native
    
    def assertFlowBaseAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FlowBaseAnnotation))),IArray())*/ Boolean = js.native
    def assertFlowBaseAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FlowBaseAnnotation))),IArray())*/ Boolean = js.native
    def assertFlowBaseAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FlowBaseAnnotation))),IArray())*/ Boolean = js.native
    def assertFlowBaseAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FlowBaseAnnotation))),IArray())*/ Boolean = js.native
    def assertFlowBaseAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FlowBaseAnnotation))),IArray())*/ Boolean = js.native
    
    def assertFlowDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FlowDeclaration))),IArray())*/ Boolean = js.native
    def assertFlowDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FlowDeclaration))),IArray())*/ Boolean = js.native
    def assertFlowDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FlowDeclaration))),IArray())*/ Boolean = js.native
    def assertFlowDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FlowDeclaration))),IArray())*/ Boolean = js.native
    def assertFlowDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FlowDeclaration))),IArray())*/ Boolean = js.native
    
    def assertFor(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(For))),IArray())*/ Boolean = js.native
    def assertFor(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(For))),IArray())*/ Boolean = js.native
    def assertFor(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(For))),IArray())*/ Boolean = js.native
    def assertFor(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(For))),IArray())*/ Boolean = js.native
    def assertFor(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(For))),IArray())*/ Boolean = js.native
    
    def assertForInStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ForInStatement))),IArray())*/ Boolean = js.native
    def assertForInStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ForInStatement))),IArray())*/ Boolean = js.native
    def assertForInStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ForInStatement))),IArray())*/ Boolean = js.native
    def assertForInStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ForInStatement))),IArray())*/ Boolean = js.native
    def assertForInStatement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ForInStatement))),IArray())*/ Boolean = js.native
    
    def assertForOfStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ForOfStatement))),IArray())*/ Boolean = js.native
    def assertForOfStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ForOfStatement))),IArray())*/ Boolean = js.native
    def assertForOfStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ForOfStatement))),IArray())*/ Boolean = js.native
    def assertForOfStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ForOfStatement))),IArray())*/ Boolean = js.native
    def assertForOfStatement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ForOfStatement))),IArray())*/ Boolean = js.native
    
    def assertForStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ForStatement))),IArray())*/ Boolean = js.native
    def assertForStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ForStatement))),IArray())*/ Boolean = js.native
    def assertForStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ForStatement))),IArray())*/ Boolean = js.native
    def assertForStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ForStatement))),IArray())*/ Boolean = js.native
    def assertForStatement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ForStatement))),IArray())*/ Boolean = js.native
    
    def assertForXStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ForXStatement))),IArray())*/ Boolean = js.native
    def assertForXStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ForXStatement))),IArray())*/ Boolean = js.native
    def assertForXStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ForXStatement))),IArray())*/ Boolean = js.native
    def assertForXStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ForXStatement))),IArray())*/ Boolean = js.native
    def assertForXStatement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ForXStatement))),IArray())*/ Boolean = js.native
    
    def assertFunction(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Function))),IArray())*/ Boolean = js.native
    def assertFunction(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Function))),IArray())*/ Boolean = js.native
    def assertFunction(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Function))),IArray())*/ Boolean = js.native
    def assertFunction(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Function))),IArray())*/ Boolean = js.native
    def assertFunction(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Function))),IArray())*/ Boolean = js.native
    
    def assertFunctionDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionDeclaration))),IArray())*/ Boolean = js.native
    def assertFunctionDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionDeclaration))),IArray())*/ Boolean = js.native
    def assertFunctionDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionDeclaration))),IArray())*/ Boolean = js.native
    def assertFunctionDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionDeclaration))),IArray())*/ Boolean = js.native
    def assertFunctionDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionDeclaration))),IArray())*/ Boolean = js.native
    
    def assertFunctionExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionExpression))),IArray())*/ Boolean = js.native
    def assertFunctionExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionExpression))),IArray())*/ Boolean = js.native
    def assertFunctionExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionExpression))),IArray())*/ Boolean = js.native
    def assertFunctionExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionExpression))),IArray())*/ Boolean = js.native
    def assertFunctionExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionExpression))),IArray())*/ Boolean = js.native
    
    def assertFunctionParent(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionParent))),IArray())*/ Boolean = js.native
    def assertFunctionParent(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionParent))),IArray())*/ Boolean = js.native
    def assertFunctionParent(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionParent))),IArray())*/ Boolean = js.native
    def assertFunctionParent(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionParent))),IArray())*/ Boolean = js.native
    def assertFunctionParent(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionParent))),IArray())*/ Boolean = js.native
    
    def assertFunctionTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertFunctionTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertFunctionTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertFunctionTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertFunctionTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionTypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertFunctionTypeParam(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionTypeParam))),IArray())*/ Boolean = js.native
    def assertFunctionTypeParam(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionTypeParam))),IArray())*/ Boolean = js.native
    def assertFunctionTypeParam(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionTypeParam))),IArray())*/ Boolean = js.native
    def assertFunctionTypeParam(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionTypeParam))),IArray())*/ Boolean = js.native
    def assertFunctionTypeParam(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(FunctionTypeParam))),IArray())*/ Boolean = js.native
    
    def assertGenericTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(GenericTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertGenericTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(GenericTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertGenericTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(GenericTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertGenericTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(GenericTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertGenericTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(GenericTypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertIdentifier(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Identifier))),IArray())*/ Boolean = js.native
    def assertIdentifier(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Identifier))),IArray())*/ Boolean = js.native
    def assertIdentifier(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Identifier))),IArray())*/ Boolean = js.native
    def assertIdentifier(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Identifier))),IArray())*/ Boolean = js.native
    def assertIdentifier(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Identifier))),IArray())*/ Boolean = js.native
    
    def assertIfStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(IfStatement))),IArray())*/ Boolean = js.native
    def assertIfStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(IfStatement))),IArray())*/ Boolean = js.native
    def assertIfStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(IfStatement))),IArray())*/ Boolean = js.native
    def assertIfStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(IfStatement))),IArray())*/ Boolean = js.native
    def assertIfStatement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(IfStatement))),IArray())*/ Boolean = js.native
    
    def assertImmutable(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Immutable))),IArray())*/ Boolean = js.native
    def assertImmutable(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Immutable))),IArray())*/ Boolean = js.native
    def assertImmutable(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Immutable))),IArray())*/ Boolean = js.native
    def assertImmutable(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Immutable))),IArray())*/ Boolean = js.native
    def assertImmutable(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Immutable))),IArray())*/ Boolean = js.native
    
    def assertImportDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ImportDeclaration))),IArray())*/ Boolean = js.native
    def assertImportDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ImportDeclaration))),IArray())*/ Boolean = js.native
    def assertImportDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ImportDeclaration))),IArray())*/ Boolean = js.native
    def assertImportDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ImportDeclaration))),IArray())*/ Boolean = js.native
    def assertImportDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ImportDeclaration))),IArray())*/ Boolean = js.native
    
    def assertImportDefaultSpecifier(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ImportDefaultSpecifier))),IArray())*/ Boolean = js.native
    def assertImportDefaultSpecifier(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ImportDefaultSpecifier))),IArray())*/ Boolean = js.native
    def assertImportDefaultSpecifier(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ImportDefaultSpecifier))),IArray())*/ Boolean = js.native
    def assertImportDefaultSpecifier(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ImportDefaultSpecifier))),IArray())*/ Boolean = js.native
    def assertImportDefaultSpecifier(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ImportDefaultSpecifier))),IArray())*/ Boolean = js.native
    
    def assertImportNamespaceSpecifier(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ImportNamespaceSpecifier))),IArray())*/ Boolean = js.native
    def assertImportNamespaceSpecifier(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ImportNamespaceSpecifier))),IArray())*/ Boolean = js.native
    def assertImportNamespaceSpecifier(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ImportNamespaceSpecifier))),IArray())*/ Boolean = js.native
    def assertImportNamespaceSpecifier(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ImportNamespaceSpecifier))),IArray())*/ Boolean = js.native
    def assertImportNamespaceSpecifier(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ImportNamespaceSpecifier))),IArray())*/ Boolean = js.native
    
    def assertImportSpecifier(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ImportSpecifier))),IArray())*/ Boolean = js.native
    def assertImportSpecifier(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ImportSpecifier))),IArray())*/ Boolean = js.native
    def assertImportSpecifier(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ImportSpecifier))),IArray())*/ Boolean = js.native
    def assertImportSpecifier(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ImportSpecifier))),IArray())*/ Boolean = js.native
    def assertImportSpecifier(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ImportSpecifier))),IArray())*/ Boolean = js.native
    
    def assertInterfaceDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(InterfaceDeclaration))),IArray())*/ Boolean = js.native
    def assertInterfaceDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(InterfaceDeclaration))),IArray())*/ Boolean = js.native
    def assertInterfaceDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(InterfaceDeclaration))),IArray())*/ Boolean = js.native
    def assertInterfaceDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(InterfaceDeclaration))),IArray())*/ Boolean = js.native
    def assertInterfaceDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(InterfaceDeclaration))),IArray())*/ Boolean = js.native
    
    def assertInterfaceExtends(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(InterfaceExtends))),IArray())*/ Boolean = js.native
    def assertInterfaceExtends(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(InterfaceExtends))),IArray())*/ Boolean = js.native
    def assertInterfaceExtends(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(InterfaceExtends))),IArray())*/ Boolean = js.native
    def assertInterfaceExtends(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(InterfaceExtends))),IArray())*/ Boolean = js.native
    def assertInterfaceExtends(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(InterfaceExtends))),IArray())*/ Boolean = js.native
    
    def assertIntersectionTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(IntersectionTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertIntersectionTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(IntersectionTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertIntersectionTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(IntersectionTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertIntersectionTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(IntersectionTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertIntersectionTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(IntersectionTypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertJSX(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSX))),IArray())*/ Boolean = js.native
    def assertJSX(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSX))),IArray())*/ Boolean = js.native
    def assertJSX(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSX))),IArray())*/ Boolean = js.native
    def assertJSX(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSX))),IArray())*/ Boolean = js.native
    def assertJSX(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSX))),IArray())*/ Boolean = js.native
    
    def assertJSXAttribute(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXAttribute))),IArray())*/ Boolean = js.native
    def assertJSXAttribute(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXAttribute))),IArray())*/ Boolean = js.native
    def assertJSXAttribute(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXAttribute))),IArray())*/ Boolean = js.native
    def assertJSXAttribute(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXAttribute))),IArray())*/ Boolean = js.native
    def assertJSXAttribute(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXAttribute))),IArray())*/ Boolean = js.native
    
    def assertJSXClosingElement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXClosingElement))),IArray())*/ Boolean = js.native
    def assertJSXClosingElement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXClosingElement))),IArray())*/ Boolean = js.native
    def assertJSXClosingElement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXClosingElement))),IArray())*/ Boolean = js.native
    def assertJSXClosingElement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXClosingElement))),IArray())*/ Boolean = js.native
    def assertJSXClosingElement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXClosingElement))),IArray())*/ Boolean = js.native
    
    def assertJSXElement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXElement))),IArray())*/ Boolean = js.native
    def assertJSXElement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXElement))),IArray())*/ Boolean = js.native
    def assertJSXElement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXElement))),IArray())*/ Boolean = js.native
    def assertJSXElement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXElement))),IArray())*/ Boolean = js.native
    def assertJSXElement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXElement))),IArray())*/ Boolean = js.native
    
    def assertJSXEmptyExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXEmptyExpression))),IArray())*/ Boolean = js.native
    def assertJSXEmptyExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXEmptyExpression))),IArray())*/ Boolean = js.native
    def assertJSXEmptyExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXEmptyExpression))),IArray())*/ Boolean = js.native
    def assertJSXEmptyExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXEmptyExpression))),IArray())*/ Boolean = js.native
    def assertJSXEmptyExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXEmptyExpression))),IArray())*/ Boolean = js.native
    
    def assertJSXExpressionContainer(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXExpressionContainer))),IArray())*/ Boolean = js.native
    def assertJSXExpressionContainer(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXExpressionContainer))),IArray())*/ Boolean = js.native
    def assertJSXExpressionContainer(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXExpressionContainer))),IArray())*/ Boolean = js.native
    def assertJSXExpressionContainer(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXExpressionContainer))),IArray())*/ Boolean = js.native
    def assertJSXExpressionContainer(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXExpressionContainer))),IArray())*/ Boolean = js.native
    
    def assertJSXIdentifier(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXIdentifier))),IArray())*/ Boolean = js.native
    def assertJSXIdentifier(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXIdentifier))),IArray())*/ Boolean = js.native
    def assertJSXIdentifier(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXIdentifier))),IArray())*/ Boolean = js.native
    def assertJSXIdentifier(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXIdentifier))),IArray())*/ Boolean = js.native
    def assertJSXIdentifier(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXIdentifier))),IArray())*/ Boolean = js.native
    
    def assertJSXMemberExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXMemberExpression))),IArray())*/ Boolean = js.native
    def assertJSXMemberExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXMemberExpression))),IArray())*/ Boolean = js.native
    def assertJSXMemberExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXMemberExpression))),IArray())*/ Boolean = js.native
    def assertJSXMemberExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXMemberExpression))),IArray())*/ Boolean = js.native
    def assertJSXMemberExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXMemberExpression))),IArray())*/ Boolean = js.native
    
    def assertJSXNamespacedName(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXNamespacedName))),IArray())*/ Boolean = js.native
    def assertJSXNamespacedName(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXNamespacedName))),IArray())*/ Boolean = js.native
    def assertJSXNamespacedName(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXNamespacedName))),IArray())*/ Boolean = js.native
    def assertJSXNamespacedName(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXNamespacedName))),IArray())*/ Boolean = js.native
    def assertJSXNamespacedName(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXNamespacedName))),IArray())*/ Boolean = js.native
    
    def assertJSXOpeningElement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXOpeningElement))),IArray())*/ Boolean = js.native
    def assertJSXOpeningElement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXOpeningElement))),IArray())*/ Boolean = js.native
    def assertJSXOpeningElement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXOpeningElement))),IArray())*/ Boolean = js.native
    def assertJSXOpeningElement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXOpeningElement))),IArray())*/ Boolean = js.native
    def assertJSXOpeningElement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXOpeningElement))),IArray())*/ Boolean = js.native
    
    def assertJSXSpreadAttribute(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXSpreadAttribute))),IArray())*/ Boolean = js.native
    def assertJSXSpreadAttribute(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXSpreadAttribute))),IArray())*/ Boolean = js.native
    def assertJSXSpreadAttribute(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXSpreadAttribute))),IArray())*/ Boolean = js.native
    def assertJSXSpreadAttribute(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXSpreadAttribute))),IArray())*/ Boolean = js.native
    def assertJSXSpreadAttribute(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXSpreadAttribute))),IArray())*/ Boolean = js.native
    
    def assertJSXText(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXText))),IArray())*/ Boolean = js.native
    def assertJSXText(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXText))),IArray())*/ Boolean = js.native
    def assertJSXText(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXText))),IArray())*/ Boolean = js.native
    def assertJSXText(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXText))),IArray())*/ Boolean = js.native
    def assertJSXText(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(JSXText))),IArray())*/ Boolean = js.native
    
    def assertLVal(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(LVal))),IArray())*/ Boolean = js.native
    def assertLVal(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(LVal))),IArray())*/ Boolean = js.native
    def assertLVal(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(LVal))),IArray())*/ Boolean = js.native
    def assertLVal(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(LVal))),IArray())*/ Boolean = js.native
    def assertLVal(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(LVal))),IArray())*/ Boolean = js.native
    
    def assertLabeledStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(LabeledStatement))),IArray())*/ Boolean = js.native
    def assertLabeledStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(LabeledStatement))),IArray())*/ Boolean = js.native
    def assertLabeledStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(LabeledStatement))),IArray())*/ Boolean = js.native
    def assertLabeledStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(LabeledStatement))),IArray())*/ Boolean = js.native
    def assertLabeledStatement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(LabeledStatement))),IArray())*/ Boolean = js.native
    
    def assertLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Literal))),IArray())*/ Boolean = js.native
    def assertLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Literal))),IArray())*/ Boolean = js.native
    def assertLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Literal))),IArray())*/ Boolean = js.native
    def assertLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Literal))),IArray())*/ Boolean = js.native
    def assertLiteral(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Literal))),IArray())*/ Boolean = js.native
    
    def assertLogicalExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(LogicalExpression))),IArray())*/ Boolean = js.native
    def assertLogicalExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(LogicalExpression))),IArray())*/ Boolean = js.native
    def assertLogicalExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(LogicalExpression))),IArray())*/ Boolean = js.native
    def assertLogicalExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(LogicalExpression))),IArray())*/ Boolean = js.native
    def assertLogicalExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(LogicalExpression))),IArray())*/ Boolean = js.native
    
    def assertLoop(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Loop))),IArray())*/ Boolean = js.native
    def assertLoop(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Loop))),IArray())*/ Boolean = js.native
    def assertLoop(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Loop))),IArray())*/ Boolean = js.native
    def assertLoop(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Loop))),IArray())*/ Boolean = js.native
    def assertLoop(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Loop))),IArray())*/ Boolean = js.native
    
    def assertMemberExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(MemberExpression))),IArray())*/ Boolean = js.native
    def assertMemberExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(MemberExpression))),IArray())*/ Boolean = js.native
    def assertMemberExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(MemberExpression))),IArray())*/ Boolean = js.native
    def assertMemberExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(MemberExpression))),IArray())*/ Boolean = js.native
    def assertMemberExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(MemberExpression))),IArray())*/ Boolean = js.native
    
    def assertMetaProperty(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(MetaProperty))),IArray())*/ Boolean = js.native
    def assertMetaProperty(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(MetaProperty))),IArray())*/ Boolean = js.native
    def assertMetaProperty(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(MetaProperty))),IArray())*/ Boolean = js.native
    def assertMetaProperty(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(MetaProperty))),IArray())*/ Boolean = js.native
    def assertMetaProperty(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(MetaProperty))),IArray())*/ Boolean = js.native
    
    def assertMethod(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Method))),IArray())*/ Boolean = js.native
    def assertMethod(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Method))),IArray())*/ Boolean = js.native
    def assertMethod(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Method))),IArray())*/ Boolean = js.native
    def assertMethod(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Method))),IArray())*/ Boolean = js.native
    def assertMethod(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Method))),IArray())*/ Boolean = js.native
    
    def assertMixedTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(MixedTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertMixedTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(MixedTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertMixedTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(MixedTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertMixedTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(MixedTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertMixedTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(MixedTypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertModuleDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ModuleDeclaration))),IArray())*/ Boolean = js.native
    def assertModuleDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ModuleDeclaration))),IArray())*/ Boolean = js.native
    def assertModuleDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ModuleDeclaration))),IArray())*/ Boolean = js.native
    def assertModuleDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ModuleDeclaration))),IArray())*/ Boolean = js.native
    def assertModuleDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ModuleDeclaration))),IArray())*/ Boolean = js.native
    
    def assertModuleSpecifier(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ModuleSpecifier))),IArray())*/ Boolean = js.native
    def assertModuleSpecifier(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ModuleSpecifier))),IArray())*/ Boolean = js.native
    def assertModuleSpecifier(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ModuleSpecifier))),IArray())*/ Boolean = js.native
    def assertModuleSpecifier(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ModuleSpecifier))),IArray())*/ Boolean = js.native
    def assertModuleSpecifier(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ModuleSpecifier))),IArray())*/ Boolean = js.native
    
    def assertNewExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NewExpression))),IArray())*/ Boolean = js.native
    def assertNewExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NewExpression))),IArray())*/ Boolean = js.native
    def assertNewExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NewExpression))),IArray())*/ Boolean = js.native
    def assertNewExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NewExpression))),IArray())*/ Boolean = js.native
    def assertNewExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NewExpression))),IArray())*/ Boolean = js.native
    
    def assertNoop(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Noop))),IArray())*/ Boolean = js.native
    def assertNoop(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Noop))),IArray())*/ Boolean = js.native
    def assertNoop(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Noop))),IArray())*/ Boolean = js.native
    def assertNoop(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Noop))),IArray())*/ Boolean = js.native
    def assertNoop(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Noop))),IArray())*/ Boolean = js.native
    
    def assertNullLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NullLiteral))),IArray())*/ Boolean = js.native
    def assertNullLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NullLiteral))),IArray())*/ Boolean = js.native
    def assertNullLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NullLiteral))),IArray())*/ Boolean = js.native
    def assertNullLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NullLiteral))),IArray())*/ Boolean = js.native
    def assertNullLiteral(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NullLiteral))),IArray())*/ Boolean = js.native
    
    def assertNullLiteralTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NullLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertNullLiteralTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NullLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertNullLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NullLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertNullLiteralTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NullLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertNullLiteralTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NullLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertNullableTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NullableTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertNullableTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NullableTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertNullableTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NullableTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertNullableTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NullableTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertNullableTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NullableTypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertNumberLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NumericLiteral))),IArray())*/ Boolean = js.native
    def assertNumberLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NumericLiteral))),IArray())*/ Boolean = js.native
    def assertNumberLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NumericLiteral))),IArray())*/ Boolean = js.native
    def assertNumberLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NumericLiteral))),IArray())*/ Boolean = js.native
    def assertNumberLiteral(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NumericLiteral))),IArray())*/ Boolean = js.native
    
    def assertNumberTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NumberTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertNumberTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NumberTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertNumberTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NumberTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertNumberTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NumberTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertNumberTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NumberTypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertNumericLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NumericLiteral))),IArray())*/ Boolean = js.native
    def assertNumericLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NumericLiteral))),IArray())*/ Boolean = js.native
    def assertNumericLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NumericLiteral))),IArray())*/ Boolean = js.native
    def assertNumericLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NumericLiteral))),IArray())*/ Boolean = js.native
    def assertNumericLiteral(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NumericLiteral))),IArray())*/ Boolean = js.native
    
    def assertNumericLiteralTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NumericLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertNumericLiteralTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NumericLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertNumericLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NumericLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertNumericLiteralTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NumericLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertNumericLiteralTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(NumericLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertObjectExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectExpression))),IArray())*/ Boolean = js.native
    def assertObjectExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectExpression))),IArray())*/ Boolean = js.native
    def assertObjectExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectExpression))),IArray())*/ Boolean = js.native
    def assertObjectExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectExpression))),IArray())*/ Boolean = js.native
    def assertObjectExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectExpression))),IArray())*/ Boolean = js.native
    
    def assertObjectMember(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectMember))),IArray())*/ Boolean = js.native
    def assertObjectMember(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectMember))),IArray())*/ Boolean = js.native
    def assertObjectMember(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectMember))),IArray())*/ Boolean = js.native
    def assertObjectMember(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectMember))),IArray())*/ Boolean = js.native
    def assertObjectMember(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectMember))),IArray())*/ Boolean = js.native
    
    def assertObjectMethod(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectMethod))),IArray())*/ Boolean = js.native
    def assertObjectMethod(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectMethod))),IArray())*/ Boolean = js.native
    def assertObjectMethod(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectMethod))),IArray())*/ Boolean = js.native
    def assertObjectMethod(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectMethod))),IArray())*/ Boolean = js.native
    def assertObjectMethod(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectMethod))),IArray())*/ Boolean = js.native
    
    def assertObjectPattern(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectPattern))),IArray())*/ Boolean = js.native
    def assertObjectPattern(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectPattern))),IArray())*/ Boolean = js.native
    def assertObjectPattern(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectPattern))),IArray())*/ Boolean = js.native
    def assertObjectPattern(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectPattern))),IArray())*/ Boolean = js.native
    def assertObjectPattern(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectPattern))),IArray())*/ Boolean = js.native
    
    def assertObjectProperty(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectProperty))),IArray())*/ Boolean = js.native
    def assertObjectProperty(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectProperty))),IArray())*/ Boolean = js.native
    def assertObjectProperty(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectProperty))),IArray())*/ Boolean = js.native
    def assertObjectProperty(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectProperty))),IArray())*/ Boolean = js.native
    def assertObjectProperty(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectProperty))),IArray())*/ Boolean = js.native
    
    def assertObjectTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertObjectTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertObjectTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertObjectTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertObjectTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectTypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertObjectTypeCallProperty(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectTypeCallProperty))),IArray())*/ Boolean = js.native
    def assertObjectTypeCallProperty(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectTypeCallProperty))),IArray())*/ Boolean = js.native
    def assertObjectTypeCallProperty(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectTypeCallProperty))),IArray())*/ Boolean = js.native
    def assertObjectTypeCallProperty(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectTypeCallProperty))),IArray())*/ Boolean = js.native
    def assertObjectTypeCallProperty(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectTypeCallProperty))),IArray())*/ Boolean = js.native
    
    def assertObjectTypeIndexer(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectTypeIndexer))),IArray())*/ Boolean = js.native
    def assertObjectTypeIndexer(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectTypeIndexer))),IArray())*/ Boolean = js.native
    def assertObjectTypeIndexer(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectTypeIndexer))),IArray())*/ Boolean = js.native
    def assertObjectTypeIndexer(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectTypeIndexer))),IArray())*/ Boolean = js.native
    def assertObjectTypeIndexer(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectTypeIndexer))),IArray())*/ Boolean = js.native
    
    def assertObjectTypeProperty(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectTypeProperty))),IArray())*/ Boolean = js.native
    def assertObjectTypeProperty(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectTypeProperty))),IArray())*/ Boolean = js.native
    def assertObjectTypeProperty(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectTypeProperty))),IArray())*/ Boolean = js.native
    def assertObjectTypeProperty(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectTypeProperty))),IArray())*/ Boolean = js.native
    def assertObjectTypeProperty(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ObjectTypeProperty))),IArray())*/ Boolean = js.native
    
    def assertParenthesizedExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ParenthesizedExpression))),IArray())*/ Boolean = js.native
    def assertParenthesizedExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ParenthesizedExpression))),IArray())*/ Boolean = js.native
    def assertParenthesizedExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ParenthesizedExpression))),IArray())*/ Boolean = js.native
    def assertParenthesizedExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ParenthesizedExpression))),IArray())*/ Boolean = js.native
    def assertParenthesizedExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ParenthesizedExpression))),IArray())*/ Boolean = js.native
    
    def assertPattern(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Pattern))),IArray())*/ Boolean = js.native
    def assertPattern(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Pattern))),IArray())*/ Boolean = js.native
    def assertPattern(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Pattern))),IArray())*/ Boolean = js.native
    def assertPattern(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Pattern))),IArray())*/ Boolean = js.native
    def assertPattern(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Pattern))),IArray())*/ Boolean = js.native
    
    def assertProgram(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Program))),IArray())*/ Boolean = js.native
    def assertProgram(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Program))),IArray())*/ Boolean = js.native
    def assertProgram(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Program))),IArray())*/ Boolean = js.native
    def assertProgram(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Program))),IArray())*/ Boolean = js.native
    def assertProgram(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Program))),IArray())*/ Boolean = js.native
    
    def assertProperty(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Property))),IArray())*/ Boolean = js.native
    def assertProperty(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Property))),IArray())*/ Boolean = js.native
    def assertProperty(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Property))),IArray())*/ Boolean = js.native
    def assertProperty(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Property))),IArray())*/ Boolean = js.native
    def assertProperty(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Property))),IArray())*/ Boolean = js.native
    
    def assertPureish(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Pureish))),IArray())*/ Boolean = js.native
    def assertPureish(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Pureish))),IArray())*/ Boolean = js.native
    def assertPureish(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Pureish))),IArray())*/ Boolean = js.native
    def assertPureish(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Pureish))),IArray())*/ Boolean = js.native
    def assertPureish(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Pureish))),IArray())*/ Boolean = js.native
    
    def assertQualifiedTypeIdentifier(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(QualifiedTypeIdentifier))),IArray())*/ Boolean = js.native
    def assertQualifiedTypeIdentifier(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(QualifiedTypeIdentifier))),IArray())*/ Boolean = js.native
    def assertQualifiedTypeIdentifier(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(QualifiedTypeIdentifier))),IArray())*/ Boolean = js.native
    def assertQualifiedTypeIdentifier(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(QualifiedTypeIdentifier))),IArray())*/ Boolean = js.native
    def assertQualifiedTypeIdentifier(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(QualifiedTypeIdentifier))),IArray())*/ Boolean = js.native
    
    def assertRegExpLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(RegExpLiteral))),IArray())*/ Boolean = js.native
    def assertRegExpLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(RegExpLiteral))),IArray())*/ Boolean = js.native
    def assertRegExpLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(RegExpLiteral))),IArray())*/ Boolean = js.native
    def assertRegExpLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(RegExpLiteral))),IArray())*/ Boolean = js.native
    def assertRegExpLiteral(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(RegExpLiteral))),IArray())*/ Boolean = js.native
    
    def assertRegexLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(RegExpLiteral))),IArray())*/ Boolean = js.native
    def assertRegexLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(RegExpLiteral))),IArray())*/ Boolean = js.native
    def assertRegexLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(RegExpLiteral))),IArray())*/ Boolean = js.native
    def assertRegexLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(RegExpLiteral))),IArray())*/ Boolean = js.native
    def assertRegexLiteral(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(RegExpLiteral))),IArray())*/ Boolean = js.native
    
    def assertRestElement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(RestElement))),IArray())*/ Boolean = js.native
    def assertRestElement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(RestElement))),IArray())*/ Boolean = js.native
    def assertRestElement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(RestElement))),IArray())*/ Boolean = js.native
    def assertRestElement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(RestElement))),IArray())*/ Boolean = js.native
    def assertRestElement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(RestElement))),IArray())*/ Boolean = js.native
    
    def assertRestProperty(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(RestProperty))),IArray())*/ Boolean = js.native
    def assertRestProperty(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(RestProperty))),IArray())*/ Boolean = js.native
    def assertRestProperty(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(RestProperty))),IArray())*/ Boolean = js.native
    def assertRestProperty(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(RestProperty))),IArray())*/ Boolean = js.native
    def assertRestProperty(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(RestProperty))),IArray())*/ Boolean = js.native
    
    def assertReturnStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ReturnStatement))),IArray())*/ Boolean = js.native
    def assertReturnStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ReturnStatement))),IArray())*/ Boolean = js.native
    def assertReturnStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ReturnStatement))),IArray())*/ Boolean = js.native
    def assertReturnStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ReturnStatement))),IArray())*/ Boolean = js.native
    def assertReturnStatement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ReturnStatement))),IArray())*/ Boolean = js.native
    
    def assertScopable(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Scopable))),IArray())*/ Boolean = js.native
    def assertScopable(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Scopable))),IArray())*/ Boolean = js.native
    def assertScopable(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Scopable))),IArray())*/ Boolean = js.native
    def assertScopable(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Scopable))),IArray())*/ Boolean = js.native
    def assertScopable(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Scopable))),IArray())*/ Boolean = js.native
    
    def assertSequenceExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SequenceExpression))),IArray())*/ Boolean = js.native
    def assertSequenceExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SequenceExpression))),IArray())*/ Boolean = js.native
    def assertSequenceExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SequenceExpression))),IArray())*/ Boolean = js.native
    def assertSequenceExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SequenceExpression))),IArray())*/ Boolean = js.native
    def assertSequenceExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SequenceExpression))),IArray())*/ Boolean = js.native
    
    def assertSpreadElement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SpreadElement))),IArray())*/ Boolean = js.native
    def assertSpreadElement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SpreadElement))),IArray())*/ Boolean = js.native
    def assertSpreadElement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SpreadElement))),IArray())*/ Boolean = js.native
    def assertSpreadElement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SpreadElement))),IArray())*/ Boolean = js.native
    def assertSpreadElement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SpreadElement))),IArray())*/ Boolean = js.native
    
    def assertSpreadProperty(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SpreadProperty))),IArray())*/ Boolean = js.native
    def assertSpreadProperty(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SpreadProperty))),IArray())*/ Boolean = js.native
    def assertSpreadProperty(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SpreadProperty))),IArray())*/ Boolean = js.native
    def assertSpreadProperty(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SpreadProperty))),IArray())*/ Boolean = js.native
    def assertSpreadProperty(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SpreadProperty))),IArray())*/ Boolean = js.native
    
    def assertStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Statement))),IArray())*/ Boolean = js.native
    def assertStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Statement))),IArray())*/ Boolean = js.native
    def assertStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Statement))),IArray())*/ Boolean = js.native
    def assertStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Statement))),IArray())*/ Boolean = js.native
    def assertStatement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Statement))),IArray())*/ Boolean = js.native
    
    def assertStringLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(StringLiteral))),IArray())*/ Boolean = js.native
    def assertStringLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(StringLiteral))),IArray())*/ Boolean = js.native
    def assertStringLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(StringLiteral))),IArray())*/ Boolean = js.native
    def assertStringLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(StringLiteral))),IArray())*/ Boolean = js.native
    def assertStringLiteral(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(StringLiteral))),IArray())*/ Boolean = js.native
    
    def assertStringLiteralTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(StringLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertStringLiteralTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(StringLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertStringLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(StringLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertStringLiteralTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(StringLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertStringLiteralTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(StringLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertStringTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(StringTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertStringTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(StringTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertStringTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(StringTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertStringTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(StringTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertStringTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(StringTypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertSuper(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Super))),IArray())*/ Boolean = js.native
    def assertSuper(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Super))),IArray())*/ Boolean = js.native
    def assertSuper(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Super))),IArray())*/ Boolean = js.native
    def assertSuper(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Super))),IArray())*/ Boolean = js.native
    def assertSuper(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Super))),IArray())*/ Boolean = js.native
    
    def assertSwitchCase(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SwitchCase))),IArray())*/ Boolean = js.native
    def assertSwitchCase(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SwitchCase))),IArray())*/ Boolean = js.native
    def assertSwitchCase(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SwitchCase))),IArray())*/ Boolean = js.native
    def assertSwitchCase(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SwitchCase))),IArray())*/ Boolean = js.native
    def assertSwitchCase(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SwitchCase))),IArray())*/ Boolean = js.native
    
    def assertSwitchStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SwitchStatement))),IArray())*/ Boolean = js.native
    def assertSwitchStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SwitchStatement))),IArray())*/ Boolean = js.native
    def assertSwitchStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SwitchStatement))),IArray())*/ Boolean = js.native
    def assertSwitchStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SwitchStatement))),IArray())*/ Boolean = js.native
    def assertSwitchStatement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(SwitchStatement))),IArray())*/ Boolean = js.native
    
    def assertTSAnyKeyword(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSAnyKeyword))),IArray())*/ Boolean = js.native
    def assertTSAnyKeyword(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSAnyKeyword))),IArray())*/ Boolean = js.native
    def assertTSAnyKeyword(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSAnyKeyword))),IArray())*/ Boolean = js.native
    def assertTSAnyKeyword(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSAnyKeyword))),IArray())*/ Boolean = js.native
    def assertTSAnyKeyword(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSAnyKeyword))),IArray())*/ Boolean = js.native
    
    def assertTSArrayType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSArrayType))),IArray())*/ Boolean = js.native
    def assertTSArrayType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSArrayType))),IArray())*/ Boolean = js.native
    def assertTSArrayType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSArrayType))),IArray())*/ Boolean = js.native
    def assertTSArrayType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSArrayType))),IArray())*/ Boolean = js.native
    def assertTSArrayType(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSArrayType))),IArray())*/ Boolean = js.native
    
    def assertTSAsExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSAsExpression))),IArray())*/ Boolean = js.native
    def assertTSAsExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSAsExpression))),IArray())*/ Boolean = js.native
    def assertTSAsExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSAsExpression))),IArray())*/ Boolean = js.native
    def assertTSAsExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSAsExpression))),IArray())*/ Boolean = js.native
    def assertTSAsExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSAsExpression))),IArray())*/ Boolean = js.native
    
    def assertTSBooleanKeyword(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSBooleanKeyword))),IArray())*/ Boolean = js.native
    def assertTSBooleanKeyword(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSBooleanKeyword))),IArray())*/ Boolean = js.native
    def assertTSBooleanKeyword(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSBooleanKeyword))),IArray())*/ Boolean = js.native
    def assertTSBooleanKeyword(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSBooleanKeyword))),IArray())*/ Boolean = js.native
    def assertTSBooleanKeyword(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSBooleanKeyword))),IArray())*/ Boolean = js.native
    
    def assertTSCallSignatureDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSCallSignatureDeclaration))),IArray())*/ Boolean = js.native
    def assertTSCallSignatureDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSCallSignatureDeclaration))),IArray())*/ Boolean = js.native
    def assertTSCallSignatureDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSCallSignatureDeclaration))),IArray())*/ Boolean = js.native
    def assertTSCallSignatureDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSCallSignatureDeclaration))),IArray())*/ Boolean = js.native
    def assertTSCallSignatureDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSCallSignatureDeclaration))),IArray())*/ Boolean = js.native
    
    def assertTSConstructSignatureDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSConstructSignatureDeclaration))),IArray())*/ Boolean = js.native
    def assertTSConstructSignatureDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSConstructSignatureDeclaration))),IArray())*/ Boolean = js.native
    def assertTSConstructSignatureDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSConstructSignatureDeclaration))),IArray())*/ Boolean = js.native
    def assertTSConstructSignatureDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSConstructSignatureDeclaration))),IArray())*/ Boolean = js.native
    def assertTSConstructSignatureDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSConstructSignatureDeclaration))),IArray())*/ Boolean = js.native
    
    def assertTSConstructorType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSConstructorType))),IArray())*/ Boolean = js.native
    def assertTSConstructorType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSConstructorType))),IArray())*/ Boolean = js.native
    def assertTSConstructorType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSConstructorType))),IArray())*/ Boolean = js.native
    def assertTSConstructorType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSConstructorType))),IArray())*/ Boolean = js.native
    def assertTSConstructorType(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSConstructorType))),IArray())*/ Boolean = js.native
    
    def assertTSDeclareFunction(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSDeclareFunction))),IArray())*/ Boolean = js.native
    def assertTSDeclareFunction(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSDeclareFunction))),IArray())*/ Boolean = js.native
    def assertTSDeclareFunction(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSDeclareFunction))),IArray())*/ Boolean = js.native
    def assertTSDeclareFunction(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSDeclareFunction))),IArray())*/ Boolean = js.native
    def assertTSDeclareFunction(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSDeclareFunction))),IArray())*/ Boolean = js.native
    
    def assertTSDeclareMethod(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSDeclareMethod))),IArray())*/ Boolean = js.native
    def assertTSDeclareMethod(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSDeclareMethod))),IArray())*/ Boolean = js.native
    def assertTSDeclareMethod(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSDeclareMethod))),IArray())*/ Boolean = js.native
    def assertTSDeclareMethod(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSDeclareMethod))),IArray())*/ Boolean = js.native
    def assertTSDeclareMethod(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSDeclareMethod))),IArray())*/ Boolean = js.native
    
    def assertTSEnumDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSEnumDeclaration))),IArray())*/ Boolean = js.native
    def assertTSEnumDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSEnumDeclaration))),IArray())*/ Boolean = js.native
    def assertTSEnumDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSEnumDeclaration))),IArray())*/ Boolean = js.native
    def assertTSEnumDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSEnumDeclaration))),IArray())*/ Boolean = js.native
    def assertTSEnumDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSEnumDeclaration))),IArray())*/ Boolean = js.native
    
    def assertTSEnumMember(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSEnumMember))),IArray())*/ Boolean = js.native
    def assertTSEnumMember(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSEnumMember))),IArray())*/ Boolean = js.native
    def assertTSEnumMember(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSEnumMember))),IArray())*/ Boolean = js.native
    def assertTSEnumMember(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSEnumMember))),IArray())*/ Boolean = js.native
    def assertTSEnumMember(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSEnumMember))),IArray())*/ Boolean = js.native
    
    def assertTSExportAssignment(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSExportAssignment))),IArray())*/ Boolean = js.native
    def assertTSExportAssignment(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSExportAssignment))),IArray())*/ Boolean = js.native
    def assertTSExportAssignment(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSExportAssignment))),IArray())*/ Boolean = js.native
    def assertTSExportAssignment(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSExportAssignment))),IArray())*/ Boolean = js.native
    def assertTSExportAssignment(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSExportAssignment))),IArray())*/ Boolean = js.native
    
    def assertTSExpressionWithTypeArguments(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSExpressionWithTypeArguments))),IArray())*/ Boolean = js.native
    def assertTSExpressionWithTypeArguments(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSExpressionWithTypeArguments))),IArray())*/ Boolean = js.native
    def assertTSExpressionWithTypeArguments(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSExpressionWithTypeArguments))),IArray())*/ Boolean = js.native
    def assertTSExpressionWithTypeArguments(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSExpressionWithTypeArguments))),IArray())*/ Boolean = js.native
    def assertTSExpressionWithTypeArguments(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSExpressionWithTypeArguments))),IArray())*/ Boolean = js.native
    
    def assertTSExternalModuleReference(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSExternalModuleReference))),IArray())*/ Boolean = js.native
    def assertTSExternalModuleReference(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSExternalModuleReference))),IArray())*/ Boolean = js.native
    def assertTSExternalModuleReference(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSExternalModuleReference))),IArray())*/ Boolean = js.native
    def assertTSExternalModuleReference(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSExternalModuleReference))),IArray())*/ Boolean = js.native
    def assertTSExternalModuleReference(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSExternalModuleReference))),IArray())*/ Boolean = js.native
    
    def assertTSFunctionType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSFunctionType))),IArray())*/ Boolean = js.native
    def assertTSFunctionType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSFunctionType))),IArray())*/ Boolean = js.native
    def assertTSFunctionType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSFunctionType))),IArray())*/ Boolean = js.native
    def assertTSFunctionType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSFunctionType))),IArray())*/ Boolean = js.native
    def assertTSFunctionType(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSFunctionType))),IArray())*/ Boolean = js.native
    
    def assertTSImportEqualsDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSImportEqualsDeclaration))),IArray())*/ Boolean = js.native
    def assertTSImportEqualsDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSImportEqualsDeclaration))),IArray())*/ Boolean = js.native
    def assertTSImportEqualsDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSImportEqualsDeclaration))),IArray())*/ Boolean = js.native
    def assertTSImportEqualsDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSImportEqualsDeclaration))),IArray())*/ Boolean = js.native
    def assertTSImportEqualsDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSImportEqualsDeclaration))),IArray())*/ Boolean = js.native
    
    def assertTSIndexSignature(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSIndexSignature))),IArray())*/ Boolean = js.native
    def assertTSIndexSignature(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSIndexSignature))),IArray())*/ Boolean = js.native
    def assertTSIndexSignature(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSIndexSignature))),IArray())*/ Boolean = js.native
    def assertTSIndexSignature(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSIndexSignature))),IArray())*/ Boolean = js.native
    def assertTSIndexSignature(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSIndexSignature))),IArray())*/ Boolean = js.native
    
    def assertTSIndexedAccessType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSIndexedAccessType))),IArray())*/ Boolean = js.native
    def assertTSIndexedAccessType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSIndexedAccessType))),IArray())*/ Boolean = js.native
    def assertTSIndexedAccessType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSIndexedAccessType))),IArray())*/ Boolean = js.native
    def assertTSIndexedAccessType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSIndexedAccessType))),IArray())*/ Boolean = js.native
    def assertTSIndexedAccessType(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSIndexedAccessType))),IArray())*/ Boolean = js.native
    
    def assertTSInterfaceBody(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSInterfaceBody))),IArray())*/ Boolean = js.native
    def assertTSInterfaceBody(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSInterfaceBody))),IArray())*/ Boolean = js.native
    def assertTSInterfaceBody(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSInterfaceBody))),IArray())*/ Boolean = js.native
    def assertTSInterfaceBody(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSInterfaceBody))),IArray())*/ Boolean = js.native
    def assertTSInterfaceBody(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSInterfaceBody))),IArray())*/ Boolean = js.native
    
    def assertTSInterfaceDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSInterfaceDeclaration))),IArray())*/ Boolean = js.native
    def assertTSInterfaceDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSInterfaceDeclaration))),IArray())*/ Boolean = js.native
    def assertTSInterfaceDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSInterfaceDeclaration))),IArray())*/ Boolean = js.native
    def assertTSInterfaceDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSInterfaceDeclaration))),IArray())*/ Boolean = js.native
    def assertTSInterfaceDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSInterfaceDeclaration))),IArray())*/ Boolean = js.native
    
    def assertTSIntersectionType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSIntersectionType))),IArray())*/ Boolean = js.native
    def assertTSIntersectionType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSIntersectionType))),IArray())*/ Boolean = js.native
    def assertTSIntersectionType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSIntersectionType))),IArray())*/ Boolean = js.native
    def assertTSIntersectionType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSIntersectionType))),IArray())*/ Boolean = js.native
    def assertTSIntersectionType(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSIntersectionType))),IArray())*/ Boolean = js.native
    
    def assertTSLiteralType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSLiteralType))),IArray())*/ Boolean = js.native
    def assertTSLiteralType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSLiteralType))),IArray())*/ Boolean = js.native
    def assertTSLiteralType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSLiteralType))),IArray())*/ Boolean = js.native
    def assertTSLiteralType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSLiteralType))),IArray())*/ Boolean = js.native
    def assertTSLiteralType(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSLiteralType))),IArray())*/ Boolean = js.native
    
    def assertTSMappedType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSMappedType))),IArray())*/ Boolean = js.native
    def assertTSMappedType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSMappedType))),IArray())*/ Boolean = js.native
    def assertTSMappedType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSMappedType))),IArray())*/ Boolean = js.native
    def assertTSMappedType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSMappedType))),IArray())*/ Boolean = js.native
    def assertTSMappedType(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSMappedType))),IArray())*/ Boolean = js.native
    
    def assertTSMethodSignature(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSMethodSignature))),IArray())*/ Boolean = js.native
    def assertTSMethodSignature(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSMethodSignature))),IArray())*/ Boolean = js.native
    def assertTSMethodSignature(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSMethodSignature))),IArray())*/ Boolean = js.native
    def assertTSMethodSignature(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSMethodSignature))),IArray())*/ Boolean = js.native
    def assertTSMethodSignature(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSMethodSignature))),IArray())*/ Boolean = js.native
    
    def assertTSModuleBlock(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSModuleBlock))),IArray())*/ Boolean = js.native
    def assertTSModuleBlock(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSModuleBlock))),IArray())*/ Boolean = js.native
    def assertTSModuleBlock(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSModuleBlock))),IArray())*/ Boolean = js.native
    def assertTSModuleBlock(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSModuleBlock))),IArray())*/ Boolean = js.native
    def assertTSModuleBlock(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSModuleBlock))),IArray())*/ Boolean = js.native
    
    def assertTSModuleDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSModuleDeclaration))),IArray())*/ Boolean = js.native
    def assertTSModuleDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSModuleDeclaration))),IArray())*/ Boolean = js.native
    def assertTSModuleDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSModuleDeclaration))),IArray())*/ Boolean = js.native
    def assertTSModuleDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSModuleDeclaration))),IArray())*/ Boolean = js.native
    def assertTSModuleDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSModuleDeclaration))),IArray())*/ Boolean = js.native
    
    def assertTSNamespaceExportDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNamespaceExportDeclaration))),IArray())*/ Boolean = js.native
    def assertTSNamespaceExportDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNamespaceExportDeclaration))),IArray())*/ Boolean = js.native
    def assertTSNamespaceExportDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNamespaceExportDeclaration))),IArray())*/ Boolean = js.native
    def assertTSNamespaceExportDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNamespaceExportDeclaration))),IArray())*/ Boolean = js.native
    def assertTSNamespaceExportDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNamespaceExportDeclaration))),IArray())*/ Boolean = js.native
    
    def assertTSNeverKeyword(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNeverKeyword))),IArray())*/ Boolean = js.native
    def assertTSNeverKeyword(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNeverKeyword))),IArray())*/ Boolean = js.native
    def assertTSNeverKeyword(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNeverKeyword))),IArray())*/ Boolean = js.native
    def assertTSNeverKeyword(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNeverKeyword))),IArray())*/ Boolean = js.native
    def assertTSNeverKeyword(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNeverKeyword))),IArray())*/ Boolean = js.native
    
    def assertTSNonNullExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNonNullExpression))),IArray())*/ Boolean = js.native
    def assertTSNonNullExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNonNullExpression))),IArray())*/ Boolean = js.native
    def assertTSNonNullExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNonNullExpression))),IArray())*/ Boolean = js.native
    def assertTSNonNullExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNonNullExpression))),IArray())*/ Boolean = js.native
    def assertTSNonNullExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNonNullExpression))),IArray())*/ Boolean = js.native
    
    def assertTSNullKeyword(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNullKeyword))),IArray())*/ Boolean = js.native
    def assertTSNullKeyword(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNullKeyword))),IArray())*/ Boolean = js.native
    def assertTSNullKeyword(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNullKeyword))),IArray())*/ Boolean = js.native
    def assertTSNullKeyword(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNullKeyword))),IArray())*/ Boolean = js.native
    def assertTSNullKeyword(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNullKeyword))),IArray())*/ Boolean = js.native
    
    def assertTSNumberKeyword(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNumberKeyword))),IArray())*/ Boolean = js.native
    def assertTSNumberKeyword(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNumberKeyword))),IArray())*/ Boolean = js.native
    def assertTSNumberKeyword(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNumberKeyword))),IArray())*/ Boolean = js.native
    def assertTSNumberKeyword(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNumberKeyword))),IArray())*/ Boolean = js.native
    def assertTSNumberKeyword(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSNumberKeyword))),IArray())*/ Boolean = js.native
    
    def assertTSObjectKeyword(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSObjectKeyword))),IArray())*/ Boolean = js.native
    def assertTSObjectKeyword(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSObjectKeyword))),IArray())*/ Boolean = js.native
    def assertTSObjectKeyword(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSObjectKeyword))),IArray())*/ Boolean = js.native
    def assertTSObjectKeyword(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSObjectKeyword))),IArray())*/ Boolean = js.native
    def assertTSObjectKeyword(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSObjectKeyword))),IArray())*/ Boolean = js.native
    
    def assertTSParameterProperty(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSParameterProperty))),IArray())*/ Boolean = js.native
    def assertTSParameterProperty(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSParameterProperty))),IArray())*/ Boolean = js.native
    def assertTSParameterProperty(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSParameterProperty))),IArray())*/ Boolean = js.native
    def assertTSParameterProperty(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSParameterProperty))),IArray())*/ Boolean = js.native
    def assertTSParameterProperty(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSParameterProperty))),IArray())*/ Boolean = js.native
    
    def assertTSParenthesizedType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSParenthesizedType))),IArray())*/ Boolean = js.native
    def assertTSParenthesizedType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSParenthesizedType))),IArray())*/ Boolean = js.native
    def assertTSParenthesizedType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSParenthesizedType))),IArray())*/ Boolean = js.native
    def assertTSParenthesizedType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSParenthesizedType))),IArray())*/ Boolean = js.native
    def assertTSParenthesizedType(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSParenthesizedType))),IArray())*/ Boolean = js.native
    
    def assertTSPropertySignature(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSPropertySignature))),IArray())*/ Boolean = js.native
    def assertTSPropertySignature(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSPropertySignature))),IArray())*/ Boolean = js.native
    def assertTSPropertySignature(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSPropertySignature))),IArray())*/ Boolean = js.native
    def assertTSPropertySignature(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSPropertySignature))),IArray())*/ Boolean = js.native
    def assertTSPropertySignature(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSPropertySignature))),IArray())*/ Boolean = js.native
    
    def assertTSQualifiedName(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSQualifiedName))),IArray())*/ Boolean = js.native
    def assertTSQualifiedName(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSQualifiedName))),IArray())*/ Boolean = js.native
    def assertTSQualifiedName(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSQualifiedName))),IArray())*/ Boolean = js.native
    def assertTSQualifiedName(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSQualifiedName))),IArray())*/ Boolean = js.native
    def assertTSQualifiedName(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSQualifiedName))),IArray())*/ Boolean = js.native
    
    def assertTSStringKeyword(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSStringKeyword))),IArray())*/ Boolean = js.native
    def assertTSStringKeyword(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSStringKeyword))),IArray())*/ Boolean = js.native
    def assertTSStringKeyword(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSStringKeyword))),IArray())*/ Boolean = js.native
    def assertTSStringKeyword(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSStringKeyword))),IArray())*/ Boolean = js.native
    def assertTSStringKeyword(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSStringKeyword))),IArray())*/ Boolean = js.native
    
    def assertTSSymbolKeyword(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSSymbolKeyword))),IArray())*/ Boolean = js.native
    def assertTSSymbolKeyword(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSSymbolKeyword))),IArray())*/ Boolean = js.native
    def assertTSSymbolKeyword(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSSymbolKeyword))),IArray())*/ Boolean = js.native
    def assertTSSymbolKeyword(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSSymbolKeyword))),IArray())*/ Boolean = js.native
    def assertTSSymbolKeyword(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSSymbolKeyword))),IArray())*/ Boolean = js.native
    
    def assertTSThisType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSThisType))),IArray())*/ Boolean = js.native
    def assertTSThisType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSThisType))),IArray())*/ Boolean = js.native
    def assertTSThisType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSThisType))),IArray())*/ Boolean = js.native
    def assertTSThisType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSThisType))),IArray())*/ Boolean = js.native
    def assertTSThisType(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSThisType))),IArray())*/ Boolean = js.native
    
    def assertTSTupleType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTupleType))),IArray())*/ Boolean = js.native
    def assertTSTupleType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTupleType))),IArray())*/ Boolean = js.native
    def assertTSTupleType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTupleType))),IArray())*/ Boolean = js.native
    def assertTSTupleType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTupleType))),IArray())*/ Boolean = js.native
    def assertTSTupleType(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTupleType))),IArray())*/ Boolean = js.native
    
    def assertTSTypeAliasDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeAliasDeclaration))),IArray())*/ Boolean = js.native
    def assertTSTypeAliasDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeAliasDeclaration))),IArray())*/ Boolean = js.native
    def assertTSTypeAliasDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeAliasDeclaration))),IArray())*/ Boolean = js.native
    def assertTSTypeAliasDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeAliasDeclaration))),IArray())*/ Boolean = js.native
    def assertTSTypeAliasDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeAliasDeclaration))),IArray())*/ Boolean = js.native
    
    def assertTSTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertTSTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertTSTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertTSTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertTSTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertTSTypeAssertion(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeAssertion))),IArray())*/ Boolean = js.native
    def assertTSTypeAssertion(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeAssertion))),IArray())*/ Boolean = js.native
    def assertTSTypeAssertion(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeAssertion))),IArray())*/ Boolean = js.native
    def assertTSTypeAssertion(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeAssertion))),IArray())*/ Boolean = js.native
    def assertTSTypeAssertion(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeAssertion))),IArray())*/ Boolean = js.native
    
    def assertTSTypeLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeLiteral))),IArray())*/ Boolean = js.native
    def assertTSTypeLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeLiteral))),IArray())*/ Boolean = js.native
    def assertTSTypeLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeLiteral))),IArray())*/ Boolean = js.native
    def assertTSTypeLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeLiteral))),IArray())*/ Boolean = js.native
    def assertTSTypeLiteral(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeLiteral))),IArray())*/ Boolean = js.native
    
    def assertTSTypeOperator(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeOperator))),IArray())*/ Boolean = js.native
    def assertTSTypeOperator(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeOperator))),IArray())*/ Boolean = js.native
    def assertTSTypeOperator(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeOperator))),IArray())*/ Boolean = js.native
    def assertTSTypeOperator(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeOperator))),IArray())*/ Boolean = js.native
    def assertTSTypeOperator(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeOperator))),IArray())*/ Boolean = js.native
    
    def assertTSTypeParameter(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeParameter))),IArray())*/ Boolean = js.native
    def assertTSTypeParameter(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeParameter))),IArray())*/ Boolean = js.native
    def assertTSTypeParameter(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeParameter))),IArray())*/ Boolean = js.native
    def assertTSTypeParameter(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeParameter))),IArray())*/ Boolean = js.native
    def assertTSTypeParameter(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeParameter))),IArray())*/ Boolean = js.native
    
    def assertTSTypeParameterDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeParameterDeclaration))),IArray())*/ Boolean = js.native
    def assertTSTypeParameterDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeParameterDeclaration))),IArray())*/ Boolean = js.native
    def assertTSTypeParameterDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeParameterDeclaration))),IArray())*/ Boolean = js.native
    def assertTSTypeParameterDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeParameterDeclaration))),IArray())*/ Boolean = js.native
    def assertTSTypeParameterDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeParameterDeclaration))),IArray())*/ Boolean = js.native
    
    def assertTSTypeParameterInstantiation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeParameterInstantiation))),IArray())*/ Boolean = js.native
    def assertTSTypeParameterInstantiation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeParameterInstantiation))),IArray())*/ Boolean = js.native
    def assertTSTypeParameterInstantiation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeParameterInstantiation))),IArray())*/ Boolean = js.native
    def assertTSTypeParameterInstantiation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeParameterInstantiation))),IArray())*/ Boolean = js.native
    def assertTSTypeParameterInstantiation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeParameterInstantiation))),IArray())*/ Boolean = js.native
    
    def assertTSTypePredicate(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypePredicate))),IArray())*/ Boolean = js.native
    def assertTSTypePredicate(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypePredicate))),IArray())*/ Boolean = js.native
    def assertTSTypePredicate(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypePredicate))),IArray())*/ Boolean = js.native
    def assertTSTypePredicate(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypePredicate))),IArray())*/ Boolean = js.native
    def assertTSTypePredicate(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypePredicate))),IArray())*/ Boolean = js.native
    
    def assertTSTypeQuery(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeQuery))),IArray())*/ Boolean = js.native
    def assertTSTypeQuery(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeQuery))),IArray())*/ Boolean = js.native
    def assertTSTypeQuery(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeQuery))),IArray())*/ Boolean = js.native
    def assertTSTypeQuery(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeQuery))),IArray())*/ Boolean = js.native
    def assertTSTypeQuery(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeQuery))),IArray())*/ Boolean = js.native
    
    def assertTSTypeReference(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeReference))),IArray())*/ Boolean = js.native
    def assertTSTypeReference(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeReference))),IArray())*/ Boolean = js.native
    def assertTSTypeReference(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeReference))),IArray())*/ Boolean = js.native
    def assertTSTypeReference(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeReference))),IArray())*/ Boolean = js.native
    def assertTSTypeReference(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSTypeReference))),IArray())*/ Boolean = js.native
    
    def assertTSUndefinedKeyword(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSUndefinedKeyword))),IArray())*/ Boolean = js.native
    def assertTSUndefinedKeyword(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSUndefinedKeyword))),IArray())*/ Boolean = js.native
    def assertTSUndefinedKeyword(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSUndefinedKeyword))),IArray())*/ Boolean = js.native
    def assertTSUndefinedKeyword(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSUndefinedKeyword))),IArray())*/ Boolean = js.native
    def assertTSUndefinedKeyword(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSUndefinedKeyword))),IArray())*/ Boolean = js.native
    
    def assertTSUnionType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSUnionType))),IArray())*/ Boolean = js.native
    def assertTSUnionType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSUnionType))),IArray())*/ Boolean = js.native
    def assertTSUnionType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSUnionType))),IArray())*/ Boolean = js.native
    def assertTSUnionType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSUnionType))),IArray())*/ Boolean = js.native
    def assertTSUnionType(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSUnionType))),IArray())*/ Boolean = js.native
    
    def assertTSVoidKeyword(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSVoidKeyword))),IArray())*/ Boolean = js.native
    def assertTSVoidKeyword(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSVoidKeyword))),IArray())*/ Boolean = js.native
    def assertTSVoidKeyword(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSVoidKeyword))),IArray())*/ Boolean = js.native
    def assertTSVoidKeyword(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSVoidKeyword))),IArray())*/ Boolean = js.native
    def assertTSVoidKeyword(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TSVoidKeyword))),IArray())*/ Boolean = js.native
    
    def assertTaggedTemplateExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TaggedTemplateExpression))),IArray())*/ Boolean = js.native
    def assertTaggedTemplateExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TaggedTemplateExpression))),IArray())*/ Boolean = js.native
    def assertTaggedTemplateExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TaggedTemplateExpression))),IArray())*/ Boolean = js.native
    def assertTaggedTemplateExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TaggedTemplateExpression))),IArray())*/ Boolean = js.native
    def assertTaggedTemplateExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TaggedTemplateExpression))),IArray())*/ Boolean = js.native
    
    def assertTemplateElement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TemplateElement))),IArray())*/ Boolean = js.native
    def assertTemplateElement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TemplateElement))),IArray())*/ Boolean = js.native
    def assertTemplateElement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TemplateElement))),IArray())*/ Boolean = js.native
    def assertTemplateElement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TemplateElement))),IArray())*/ Boolean = js.native
    def assertTemplateElement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TemplateElement))),IArray())*/ Boolean = js.native
    
    def assertTemplateLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TemplateLiteral))),IArray())*/ Boolean = js.native
    def assertTemplateLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TemplateLiteral))),IArray())*/ Boolean = js.native
    def assertTemplateLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TemplateLiteral))),IArray())*/ Boolean = js.native
    def assertTemplateLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TemplateLiteral))),IArray())*/ Boolean = js.native
    def assertTemplateLiteral(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TemplateLiteral))),IArray())*/ Boolean = js.native
    
    def assertTerminatorless(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Terminatorless))),IArray())*/ Boolean = js.native
    def assertTerminatorless(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Terminatorless))),IArray())*/ Boolean = js.native
    def assertTerminatorless(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Terminatorless))),IArray())*/ Boolean = js.native
    def assertTerminatorless(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Terminatorless))),IArray())*/ Boolean = js.native
    def assertTerminatorless(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(Terminatorless))),IArray())*/ Boolean = js.native
    
    def assertThisExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ThisExpression))),IArray())*/ Boolean = js.native
    def assertThisExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ThisExpression))),IArray())*/ Boolean = js.native
    def assertThisExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ThisExpression))),IArray())*/ Boolean = js.native
    def assertThisExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ThisExpression))),IArray())*/ Boolean = js.native
    def assertThisExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ThisExpression))),IArray())*/ Boolean = js.native
    
    def assertThisTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ThisTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertThisTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ThisTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertThisTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ThisTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertThisTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ThisTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertThisTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ThisTypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertThrowStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ThrowStatement))),IArray())*/ Boolean = js.native
    def assertThrowStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ThrowStatement))),IArray())*/ Boolean = js.native
    def assertThrowStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ThrowStatement))),IArray())*/ Boolean = js.native
    def assertThrowStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ThrowStatement))),IArray())*/ Boolean = js.native
    def assertThrowStatement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(ThrowStatement))),IArray())*/ Boolean = js.native
    
    def assertTryStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TryStatement))),IArray())*/ Boolean = js.native
    def assertTryStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TryStatement))),IArray())*/ Boolean = js.native
    def assertTryStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TryStatement))),IArray())*/ Boolean = js.native
    def assertTryStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TryStatement))),IArray())*/ Boolean = js.native
    def assertTryStatement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TryStatement))),IArray())*/ Boolean = js.native
    
    def assertTupleTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TupleTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertTupleTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TupleTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertTupleTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TupleTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertTupleTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TupleTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertTupleTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TupleTypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertTypeAlias(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeAlias))),IArray())*/ Boolean = js.native
    def assertTypeAlias(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeAlias))),IArray())*/ Boolean = js.native
    def assertTypeAlias(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeAlias))),IArray())*/ Boolean = js.native
    def assertTypeAlias(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeAlias))),IArray())*/ Boolean = js.native
    def assertTypeAlias(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeAlias))),IArray())*/ Boolean = js.native
    
    def assertTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeAnnotation))),IArray())*/ Boolean = js.native
    def assertTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeAnnotation))),IArray())*/ Boolean = js.native
    def assertTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeAnnotation))),IArray())*/ Boolean = js.native
    def assertTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeAnnotation))),IArray())*/ Boolean = js.native
    def assertTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertTypeCastExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeCastExpression))),IArray())*/ Boolean = js.native
    def assertTypeCastExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeCastExpression))),IArray())*/ Boolean = js.native
    def assertTypeCastExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeCastExpression))),IArray())*/ Boolean = js.native
    def assertTypeCastExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeCastExpression))),IArray())*/ Boolean = js.native
    def assertTypeCastExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeCastExpression))),IArray())*/ Boolean = js.native
    
    def assertTypeParameter(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeParameter))),IArray())*/ Boolean = js.native
    def assertTypeParameter(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeParameter))),IArray())*/ Boolean = js.native
    def assertTypeParameter(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeParameter))),IArray())*/ Boolean = js.native
    def assertTypeParameter(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeParameter))),IArray())*/ Boolean = js.native
    def assertTypeParameter(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeParameter))),IArray())*/ Boolean = js.native
    
    def assertTypeParameterDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeParameterDeclaration))),IArray())*/ Boolean = js.native
    def assertTypeParameterDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeParameterDeclaration))),IArray())*/ Boolean = js.native
    def assertTypeParameterDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeParameterDeclaration))),IArray())*/ Boolean = js.native
    def assertTypeParameterDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeParameterDeclaration))),IArray())*/ Boolean = js.native
    def assertTypeParameterDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeParameterDeclaration))),IArray())*/ Boolean = js.native
    
    def assertTypeParameterInstantiation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeParameterInstantiation))),IArray())*/ Boolean = js.native
    def assertTypeParameterInstantiation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeParameterInstantiation))),IArray())*/ Boolean = js.native
    def assertTypeParameterInstantiation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeParameterInstantiation))),IArray())*/ Boolean = js.native
    def assertTypeParameterInstantiation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeParameterInstantiation))),IArray())*/ Boolean = js.native
    def assertTypeParameterInstantiation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeParameterInstantiation))),IArray())*/ Boolean = js.native
    
    def assertTypeofTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeofTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertTypeofTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeofTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertTypeofTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeofTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertTypeofTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeofTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertTypeofTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(TypeofTypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertUnaryExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UnaryExpression))),IArray())*/ Boolean = js.native
    def assertUnaryExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UnaryExpression))),IArray())*/ Boolean = js.native
    def assertUnaryExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UnaryExpression))),IArray())*/ Boolean = js.native
    def assertUnaryExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UnaryExpression))),IArray())*/ Boolean = js.native
    def assertUnaryExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UnaryExpression))),IArray())*/ Boolean = js.native
    
    def assertUnaryLike(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UnaryLike))),IArray())*/ Boolean = js.native
    def assertUnaryLike(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UnaryLike))),IArray())*/ Boolean = js.native
    def assertUnaryLike(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UnaryLike))),IArray())*/ Boolean = js.native
    def assertUnaryLike(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UnaryLike))),IArray())*/ Boolean = js.native
    def assertUnaryLike(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UnaryLike))),IArray())*/ Boolean = js.native
    
    def assertUnionTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UnionTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertUnionTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UnionTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertUnionTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UnionTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertUnionTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UnionTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertUnionTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UnionTypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertUpdateExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UpdateExpression))),IArray())*/ Boolean = js.native
    def assertUpdateExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UpdateExpression))),IArray())*/ Boolean = js.native
    def assertUpdateExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UpdateExpression))),IArray())*/ Boolean = js.native
    def assertUpdateExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UpdateExpression))),IArray())*/ Boolean = js.native
    def assertUpdateExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UpdateExpression))),IArray())*/ Boolean = js.native
    
    def assertUserWhitespacable(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UserWhitespacable))),IArray())*/ Boolean = js.native
    def assertUserWhitespacable(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UserWhitespacable))),IArray())*/ Boolean = js.native
    def assertUserWhitespacable(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UserWhitespacable))),IArray())*/ Boolean = js.native
    def assertUserWhitespacable(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UserWhitespacable))),IArray())*/ Boolean = js.native
    def assertUserWhitespacable(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(UserWhitespacable))),IArray())*/ Boolean = js.native
    
    def assertVariableDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(VariableDeclaration))),IArray())*/ Boolean = js.native
    def assertVariableDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(VariableDeclaration))),IArray())*/ Boolean = js.native
    def assertVariableDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(VariableDeclaration))),IArray())*/ Boolean = js.native
    def assertVariableDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(VariableDeclaration))),IArray())*/ Boolean = js.native
    def assertVariableDeclaration(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(VariableDeclaration))),IArray())*/ Boolean = js.native
    
    def assertVariableDeclarator(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(VariableDeclarator))),IArray())*/ Boolean = js.native
    def assertVariableDeclarator(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(VariableDeclarator))),IArray())*/ Boolean = js.native
    def assertVariableDeclarator(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(VariableDeclarator))),IArray())*/ Boolean = js.native
    def assertVariableDeclarator(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(VariableDeclarator))),IArray())*/ Boolean = js.native
    def assertVariableDeclarator(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(VariableDeclarator))),IArray())*/ Boolean = js.native
    
    def assertVoidTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(VoidTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertVoidTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(VoidTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertVoidTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(VoidTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertVoidTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(VoidTypeAnnotation))),IArray())*/ Boolean = js.native
    def assertVoidTypeAnnotation(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(VoidTypeAnnotation))),IArray())*/ Boolean = js.native
    
    def assertWhile(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(While))),IArray())*/ Boolean = js.native
    def assertWhile(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(While))),IArray())*/ Boolean = js.native
    def assertWhile(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(While))),IArray())*/ Boolean = js.native
    def assertWhile(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(While))),IArray())*/ Boolean = js.native
    def assertWhile(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(While))),IArray())*/ Boolean = js.native
    
    def assertWhileStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(WhileStatement))),IArray())*/ Boolean = js.native
    def assertWhileStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(WhileStatement))),IArray())*/ Boolean = js.native
    def assertWhileStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(WhileStatement))),IArray())*/ Boolean = js.native
    def assertWhileStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(WhileStatement))),IArray())*/ Boolean = js.native
    def assertWhileStatement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(WhileStatement))),IArray())*/ Boolean = js.native
    
    def assertWithStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(WithStatement))),IArray())*/ Boolean = js.native
    def assertWithStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(WithStatement))),IArray())*/ Boolean = js.native
    def assertWithStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(WithStatement))),IArray())*/ Boolean = js.native
    def assertWithStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(WithStatement))),IArray())*/ Boolean = js.native
    def assertWithStatement(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(WithStatement))),IArray())*/ Boolean = js.native
    
    def assertYieldExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(YieldExpression))),IArray())*/ Boolean = js.native
    def assertYieldExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(YieldExpression))),IArray())*/ Boolean = js.native
    def assertYieldExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(YieldExpression))),IArray())*/ Boolean = js.native
    def assertYieldExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(YieldExpression))),IArray())*/ Boolean = js.native
    def assertYieldExpression(node: Unit, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types)), TsIdentSimple(YieldExpression))),IArray())*/ Boolean = js.native
    
    def assignmentExpression(): AssignmentExpression_ = js.native
    def assignmentExpression(operator: String): AssignmentExpression_ = js.native
    def assignmentExpression(operator: String, left: Unit, right: Expression): AssignmentExpression_ = js.native
    def assignmentExpression(operator: String, left: LVal): AssignmentExpression_ = js.native
    def assignmentExpression(operator: String, left: LVal, right: Expression): AssignmentExpression_ = js.native
    def assignmentExpression(operator: Unit, left: Unit, right: Expression): AssignmentExpression_ = js.native
    def assignmentExpression(operator: Unit, left: LVal): AssignmentExpression_ = js.native
    def assignmentExpression(operator: Unit, left: LVal, right: Expression): AssignmentExpression_ = js.native
    
    def assignmentPattern(): AssignmentPattern_ = js.native
    def assignmentPattern(left: Unit, right: Expression): AssignmentPattern_ = js.native
    def assignmentPattern(left: Identifier_): AssignmentPattern_ = js.native
    def assignmentPattern(left: Identifier_, right: Expression): AssignmentPattern_ = js.native
    
    def awaitExpression(): AwaitExpression_ = js.native
    def awaitExpression(argument: Expression): AwaitExpression_ = js.native
    
    def binaryExpression(): BinaryExpression_ = js.native
    def binaryExpression(
      operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | ^ | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign
    ): BinaryExpression_ = js.native
    def binaryExpression(
      operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | ^ | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign,
      left: Unit,
      right: Expression
    ): BinaryExpression_ = js.native
    def binaryExpression(
      operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | ^ | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign,
      left: Expression
    ): BinaryExpression_ = js.native
    def binaryExpression(
      operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | ^ | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign,
      left: Expression,
      right: Expression
    ): BinaryExpression_ = js.native
    def binaryExpression(operator: Unit, left: Unit, right: Expression): BinaryExpression_ = js.native
    def binaryExpression(operator: Unit, left: Expression): BinaryExpression_ = js.native
    def binaryExpression(operator: Unit, left: Expression, right: Expression): BinaryExpression_ = js.native
    
    def bindExpression(): BindExpression_ = js.native
    def bindExpression(`object`: Unit, callee: Expression): BindExpression_ = js.native
    def bindExpression(`object`: Expression): BindExpression_ = js.native
    def bindExpression(`object`: Expression, callee: Expression): BindExpression_ = js.native
    
    def blockStatement(): BlockStatement_ = js.native
    def blockStatement(body: js.Array[Statement]): BlockStatement_ = js.native
    def blockStatement(body: js.Array[Statement], directives: js.Array[Directive_]): BlockStatement_ = js.native
    def blockStatement(body: Unit, directives: js.Array[Directive_]): BlockStatement_ = js.native
    
    def booleanLiteral(): BooleanLiteral_ = js.native
    def booleanLiteral(value: Boolean): BooleanLiteral_ = js.native
    
    def booleanLiteralTypeAnnotation(): BooleanLiteralTypeAnnotation_ = js.native
    
    def booleanTypeAnnotation(): BooleanTypeAnnotation_ = js.native
    
    def breakStatement(): BreakStatement_ = js.native
    def breakStatement(label: Identifier_): BreakStatement_ = js.native
    
    def callExpression(): CallExpression_ = js.native
    def callExpression(callee: Unit, _arguments: js.Array[Expression | SpreadElement_]): CallExpression_ = js.native
    def callExpression(callee: Expression): CallExpression_ = js.native
    def callExpression(callee: Expression, _arguments: js.Array[Expression | SpreadElement_]): CallExpression_ = js.native
    
    def catchClause(): CatchClause_ = js.native
    def catchClause(param: Unit, body: BlockStatement_): CatchClause_ = js.native
    def catchClause(param: Identifier_): CatchClause_ = js.native
    def catchClause(param: Identifier_, body: BlockStatement_): CatchClause_ = js.native
    
    def classBody(): ClassBody_ = js.native
    def classBody(body: js.Array[ClassMethod_ | ClassProperty_]): ClassBody_ = js.native
    
    def classDeclaration(): ClassDeclaration_ = js.native
    def classDeclaration(id: Unit, superClass: Unit, body: Unit, decorators: js.Array[Decorator_]): ClassDeclaration_ = js.native
    def classDeclaration(id: Unit, superClass: Unit, body: ClassBody_): ClassDeclaration_ = js.native
    def classDeclaration(id: Unit, superClass: Unit, body: ClassBody_, decorators: js.Array[Decorator_]): ClassDeclaration_ = js.native
    def classDeclaration(id: Unit, superClass: Expression): ClassDeclaration_ = js.native
    def classDeclaration(id: Unit, superClass: Expression, body: Unit, decorators: js.Array[Decorator_]): ClassDeclaration_ = js.native
    def classDeclaration(id: Unit, superClass: Expression, body: ClassBody_): ClassDeclaration_ = js.native
    def classDeclaration(id: Unit, superClass: Expression, body: ClassBody_, decorators: js.Array[Decorator_]): ClassDeclaration_ = js.native
    def classDeclaration(id: Identifier_): ClassDeclaration_ = js.native
    def classDeclaration(id: Identifier_, superClass: Unit, body: Unit, decorators: js.Array[Decorator_]): ClassDeclaration_ = js.native
    def classDeclaration(id: Identifier_, superClass: Unit, body: ClassBody_): ClassDeclaration_ = js.native
    def classDeclaration(id: Identifier_, superClass: Unit, body: ClassBody_, decorators: js.Array[Decorator_]): ClassDeclaration_ = js.native
    def classDeclaration(id: Identifier_, superClass: Expression): ClassDeclaration_ = js.native
    def classDeclaration(id: Identifier_, superClass: Expression, body: Unit, decorators: js.Array[Decorator_]): ClassDeclaration_ = js.native
    def classDeclaration(id: Identifier_, superClass: Expression, body: ClassBody_): ClassDeclaration_ = js.native
    def classDeclaration(id: Identifier_, superClass: Expression, body: ClassBody_, decorators: js.Array[Decorator_]): ClassDeclaration_ = js.native
    
    def classExpression(): ClassExpression_ = js.native
    def classExpression(id: Unit, superClass: Unit, body: Unit, decorators: js.Array[Decorator_]): ClassExpression_ = js.native
    def classExpression(id: Unit, superClass: Unit, body: ClassBody_): ClassExpression_ = js.native
    def classExpression(id: Unit, superClass: Unit, body: ClassBody_, decorators: js.Array[Decorator_]): ClassExpression_ = js.native
    def classExpression(id: Unit, superClass: Expression): ClassExpression_ = js.native
    def classExpression(id: Unit, superClass: Expression, body: Unit, decorators: js.Array[Decorator_]): ClassExpression_ = js.native
    def classExpression(id: Unit, superClass: Expression, body: ClassBody_): ClassExpression_ = js.native
    def classExpression(id: Unit, superClass: Expression, body: ClassBody_, decorators: js.Array[Decorator_]): ClassExpression_ = js.native
    def classExpression(id: Identifier_): ClassExpression_ = js.native
    def classExpression(id: Identifier_, superClass: Unit, body: Unit, decorators: js.Array[Decorator_]): ClassExpression_ = js.native
    def classExpression(id: Identifier_, superClass: Unit, body: ClassBody_): ClassExpression_ = js.native
    def classExpression(id: Identifier_, superClass: Unit, body: ClassBody_, decorators: js.Array[Decorator_]): ClassExpression_ = js.native
    def classExpression(id: Identifier_, superClass: Expression): ClassExpression_ = js.native
    def classExpression(id: Identifier_, superClass: Expression, body: Unit, decorators: js.Array[Decorator_]): ClassExpression_ = js.native
    def classExpression(id: Identifier_, superClass: Expression, body: ClassBody_): ClassExpression_ = js.native
    def classExpression(id: Identifier_, superClass: Expression, body: ClassBody_, decorators: js.Array[Decorator_]): ClassExpression_ = js.native
    
    def classImplements(): ClassImplements_ = js.native
    def classImplements(id: Unit, typeParameters: TypeParameterInstantiation_): ClassImplements_ = js.native
    def classImplements(id: Identifier_): ClassImplements_ = js.native
    def classImplements(id: Identifier_, typeParameters: TypeParameterInstantiation_): ClassImplements_ = js.native
    
    def classMethod(
      kind: js.UndefOr[constructor | method | get | set],
      key: js.UndefOr[Expression],
      params: js.UndefOr[js.Array[LVal]],
      body: js.UndefOr[BlockStatement_],
      computed: js.UndefOr[Boolean],
      _static: js.UndefOr[Boolean]
    ): ClassMethod_ = js.native
    
    def classProperty(): ClassProperty_ = js.native
    def classProperty(key: Unit, value: Unit, typeAnnotation: Unit, decorators: js.Array[Decorator_]): ClassProperty_ = js.native
    def classProperty(key: Unit, value: Unit, typeAnnotation: TypeAnnotation_): ClassProperty_ = js.native
    def classProperty(key: Unit, value: Unit, typeAnnotation: TypeAnnotation_, decorators: js.Array[Decorator_]): ClassProperty_ = js.native
    def classProperty(key: Unit, value: Expression): ClassProperty_ = js.native
    def classProperty(key: Unit, value: Expression, typeAnnotation: Unit, decorators: js.Array[Decorator_]): ClassProperty_ = js.native
    def classProperty(key: Unit, value: Expression, typeAnnotation: TypeAnnotation_): ClassProperty_ = js.native
    def classProperty(key: Unit, value: Expression, typeAnnotation: TypeAnnotation_, decorators: js.Array[Decorator_]): ClassProperty_ = js.native
    def classProperty(key: Identifier_): ClassProperty_ = js.native
    def classProperty(key: Identifier_, value: Unit, typeAnnotation: Unit, decorators: js.Array[Decorator_]): ClassProperty_ = js.native
    def classProperty(key: Identifier_, value: Unit, typeAnnotation: TypeAnnotation_): ClassProperty_ = js.native
    def classProperty(key: Identifier_, value: Unit, typeAnnotation: TypeAnnotation_, decorators: js.Array[Decorator_]): ClassProperty_ = js.native
    def classProperty(key: Identifier_, value: Expression): ClassProperty_ = js.native
    def classProperty(key: Identifier_, value: Expression, typeAnnotation: Unit, decorators: js.Array[Decorator_]): ClassProperty_ = js.native
    def classProperty(key: Identifier_, value: Expression, typeAnnotation: TypeAnnotation_): ClassProperty_ = js.native
    def classProperty(
      key: Identifier_,
      value: Expression,
      typeAnnotation: TypeAnnotation_,
      decorators: js.Array[Decorator_]
    ): ClassProperty_ = js.native
    
    def conditionalExpression(): ConditionalExpression_ = js.native
    def conditionalExpression(test: Unit, consequent: Unit, alternate: Expression): ConditionalExpression_ = js.native
    def conditionalExpression(test: Unit, consequent: Expression): ConditionalExpression_ = js.native
    def conditionalExpression(test: Unit, consequent: Expression, alternate: Expression): ConditionalExpression_ = js.native
    def conditionalExpression(test: Expression): ConditionalExpression_ = js.native
    def conditionalExpression(test: Expression, consequent: Unit, alternate: Expression): ConditionalExpression_ = js.native
    def conditionalExpression(test: Expression, consequent: Expression): ConditionalExpression_ = js.native
    def conditionalExpression(test: Expression, consequent: Expression, alternate: Expression): ConditionalExpression_ = js.native
    
    def continueStatement(): ContinueStatement_ = js.native
    def continueStatement(label: Identifier_): ContinueStatement_ = js.native
    
    def debuggerStatement(): DebuggerStatement_ = js.native
    
    def declareClass(): DeclareClass_ = js.native
    def declareClass(id: Unit, typeParameters: Unit, _extends: js.Array[InterfaceExtends_]): DeclareClass_ = js.native
    def declareClass(id: Unit, typeParameters: Unit, _extends: js.Array[InterfaceExtends_], body: ObjectTypeAnnotation_): DeclareClass_ = js.native
    def declareClass(id: Unit, typeParameters: Unit, _extends: Unit, body: ObjectTypeAnnotation_): DeclareClass_ = js.native
    def declareClass(id: Unit, typeParameters: TypeParameterDeclaration_): DeclareClass_ = js.native
    def declareClass(id: Unit, typeParameters: TypeParameterDeclaration_, _extends: js.Array[InterfaceExtends_]): DeclareClass_ = js.native
    def declareClass(
      id: Unit,
      typeParameters: TypeParameterDeclaration_,
      _extends: js.Array[InterfaceExtends_],
      body: ObjectTypeAnnotation_
    ): DeclareClass_ = js.native
    def declareClass(id: Unit, typeParameters: TypeParameterDeclaration_, _extends: Unit, body: ObjectTypeAnnotation_): DeclareClass_ = js.native
    def declareClass(id: Identifier_): DeclareClass_ = js.native
    def declareClass(id: Identifier_, typeParameters: Unit, _extends: js.Array[InterfaceExtends_]): DeclareClass_ = js.native
    def declareClass(
      id: Identifier_,
      typeParameters: Unit,
      _extends: js.Array[InterfaceExtends_],
      body: ObjectTypeAnnotation_
    ): DeclareClass_ = js.native
    def declareClass(id: Identifier_, typeParameters: Unit, _extends: Unit, body: ObjectTypeAnnotation_): DeclareClass_ = js.native
    def declareClass(id: Identifier_, typeParameters: TypeParameterDeclaration_): DeclareClass_ = js.native
    def declareClass(id: Identifier_, typeParameters: TypeParameterDeclaration_, _extends: js.Array[InterfaceExtends_]): DeclareClass_ = js.native
    def declareClass(
      id: Identifier_,
      typeParameters: TypeParameterDeclaration_,
      _extends: js.Array[InterfaceExtends_],
      body: ObjectTypeAnnotation_
    ): DeclareClass_ = js.native
    def declareClass(
      id: Identifier_,
      typeParameters: TypeParameterDeclaration_,
      _extends: Unit,
      body: ObjectTypeAnnotation_
    ): DeclareClass_ = js.native
    
    def declareFunction(): DeclareFunction_ = js.native
    def declareFunction(id: Identifier_): DeclareFunction_ = js.native
    
    def declareInterface(): DeclareInterface_ = js.native
    def declareInterface(id: Unit, typeParameters: Unit, _extends: js.Array[InterfaceExtends_]): DeclareInterface_ = js.native
    def declareInterface(id: Unit, typeParameters: Unit, _extends: js.Array[InterfaceExtends_], body: ObjectTypeAnnotation_): DeclareInterface_ = js.native
    def declareInterface(id: Unit, typeParameters: Unit, _extends: Unit, body: ObjectTypeAnnotation_): DeclareInterface_ = js.native
    def declareInterface(id: Unit, typeParameters: TypeParameterDeclaration_): DeclareInterface_ = js.native
    def declareInterface(id: Unit, typeParameters: TypeParameterDeclaration_, _extends: js.Array[InterfaceExtends_]): DeclareInterface_ = js.native
    def declareInterface(
      id: Unit,
      typeParameters: TypeParameterDeclaration_,
      _extends: js.Array[InterfaceExtends_],
      body: ObjectTypeAnnotation_
    ): DeclareInterface_ = js.native
    def declareInterface(id: Unit, typeParameters: TypeParameterDeclaration_, _extends: Unit, body: ObjectTypeAnnotation_): DeclareInterface_ = js.native
    def declareInterface(id: Identifier_): DeclareInterface_ = js.native
    def declareInterface(id: Identifier_, typeParameters: Unit, _extends: js.Array[InterfaceExtends_]): DeclareInterface_ = js.native
    def declareInterface(
      id: Identifier_,
      typeParameters: Unit,
      _extends: js.Array[InterfaceExtends_],
      body: ObjectTypeAnnotation_
    ): DeclareInterface_ = js.native
    def declareInterface(id: Identifier_, typeParameters: Unit, _extends: Unit, body: ObjectTypeAnnotation_): DeclareInterface_ = js.native
    def declareInterface(id: Identifier_, typeParameters: TypeParameterDeclaration_): DeclareInterface_ = js.native
    def declareInterface(id: Identifier_, typeParameters: TypeParameterDeclaration_, _extends: js.Array[InterfaceExtends_]): DeclareInterface_ = js.native
    def declareInterface(
      id: Identifier_,
      typeParameters: TypeParameterDeclaration_,
      _extends: js.Array[InterfaceExtends_],
      body: ObjectTypeAnnotation_
    ): DeclareInterface_ = js.native
    def declareInterface(
      id: Identifier_,
      typeParameters: TypeParameterDeclaration_,
      _extends: Unit,
      body: ObjectTypeAnnotation_
    ): DeclareInterface_ = js.native
    
    def declareModule(): DeclareModule_ = js.native
    def declareModule(id: Unit, body: BlockStatement_): DeclareModule_ = js.native
    def declareModule(id: Identifier_): DeclareModule_ = js.native
    def declareModule(id: Identifier_, body: BlockStatement_): DeclareModule_ = js.native
    def declareModule(id: StringLiteral_): DeclareModule_ = js.native
    def declareModule(id: StringLiteral_, body: BlockStatement_): DeclareModule_ = js.native
    
    def declareTypeAlias(): DeclareTypeAlias_ = js.native
    def declareTypeAlias(id: Unit, typeParameters: Unit, right: FlowTypeAnnotation): DeclareTypeAlias_ = js.native
    def declareTypeAlias(id: Unit, typeParameters: TypeParameterDeclaration_): DeclareTypeAlias_ = js.native
    def declareTypeAlias(id: Unit, typeParameters: TypeParameterDeclaration_, right: FlowTypeAnnotation): DeclareTypeAlias_ = js.native
    def declareTypeAlias(id: Identifier_): DeclareTypeAlias_ = js.native
    def declareTypeAlias(id: Identifier_, typeParameters: Unit, right: FlowTypeAnnotation): DeclareTypeAlias_ = js.native
    def declareTypeAlias(id: Identifier_, typeParameters: TypeParameterDeclaration_): DeclareTypeAlias_ = js.native
    def declareTypeAlias(id: Identifier_, typeParameters: TypeParameterDeclaration_, right: FlowTypeAnnotation): DeclareTypeAlias_ = js.native
    
    def declareVariable(): DeclareVariable_ = js.native
    def declareVariable(id: Identifier_): DeclareVariable_ = js.native
    
    def decorator(): Decorator_ = js.native
    def decorator(expression: Expression): Decorator_ = js.native
    
    def directive(): Directive_ = js.native
    def directive(value: DirectiveLiteral_): Directive_ = js.native
    
    def directiveLiteral(): DirectiveLiteral_ = js.native
    def directiveLiteral(value: String): DirectiveLiteral_ = js.native
    
    def doExpression(): DoExpression_ = js.native
    def doExpression(body: BlockStatement_): DoExpression_ = js.native
    
    def doWhileStatement(): DoWhileStatement_ = js.native
    def doWhileStatement(test: Unit, body: Statement): DoWhileStatement_ = js.native
    def doWhileStatement(test: Expression): DoWhileStatement_ = js.native
    def doWhileStatement(test: Expression, body: Statement): DoWhileStatement_ = js.native
    
    def emptyStatement(): EmptyStatement_ = js.native
    
    def existentialTypeParam(): ExistentialTypeParam_ = js.native
    
    def exportAllDeclaration(): ExportAllDeclaration_ = js.native
    def exportAllDeclaration(source: StringLiteral_): ExportAllDeclaration_ = js.native
    
    def exportDefaultDeclaration(): ExportDefaultDeclaration_ = js.native
    def exportDefaultDeclaration(declaration: ClassDeclaration_): ExportDefaultDeclaration_ = js.native
    def exportDefaultDeclaration(declaration: Expression): ExportDefaultDeclaration_ = js.native
    def exportDefaultDeclaration(declaration: FunctionDeclaration_): ExportDefaultDeclaration_ = js.native
    
    def exportDefaultSpecifier(): ExportDefaultSpecifier_ = js.native
    def exportDefaultSpecifier(exported: Identifier_): ExportDefaultSpecifier_ = js.native
    
    def exportNamedDeclaration(): ExportNamedDeclaration_ = js.native
    def exportNamedDeclaration(declaration: Unit, specifiers: js.Array[ExportSpecifier_]): ExportNamedDeclaration_ = js.native
    def exportNamedDeclaration(declaration: Unit, specifiers: js.Array[ExportSpecifier_], source: StringLiteral_): ExportNamedDeclaration_ = js.native
    def exportNamedDeclaration(declaration: Unit, specifiers: Unit, source: StringLiteral_): ExportNamedDeclaration_ = js.native
    def exportNamedDeclaration(declaration: Declaration): ExportNamedDeclaration_ = js.native
    def exportNamedDeclaration(declaration: Declaration, specifiers: js.Array[ExportSpecifier_]): ExportNamedDeclaration_ = js.native
    def exportNamedDeclaration(declaration: Declaration, specifiers: js.Array[ExportSpecifier_], source: StringLiteral_): ExportNamedDeclaration_ = js.native
    def exportNamedDeclaration(declaration: Declaration, specifiers: Unit, source: StringLiteral_): ExportNamedDeclaration_ = js.native
    
    def exportNamespaceSpecifier(): ExportNamespaceSpecifier_ = js.native
    def exportNamespaceSpecifier(exported: Identifier_): ExportNamespaceSpecifier_ = js.native
    
    def exportSpecifier(): ExportSpecifier_ = js.native
    def exportSpecifier(local: Unit, exported: Identifier_): ExportSpecifier_ = js.native
    def exportSpecifier(local: Identifier_): ExportSpecifier_ = js.native
    def exportSpecifier(local: Identifier_, exported: Identifier_): ExportSpecifier_ = js.native
    
    def expressionStatement(): ExpressionStatement_ = js.native
    def expressionStatement(expression: Expression): ExpressionStatement_ = js.native
    
    def file(): File_ = js.native
    def file(program: Unit, comments: js.Array[Comment]): File_ = js.native
    def file(program: Unit, comments: js.Array[Comment], tokens: js.Array[Any]): File_ = js.native
    def file(program: Unit, comments: Unit, tokens: js.Array[Any]): File_ = js.native
    def file(program: Program_): File_ = js.native
    def file(program: Program_, comments: js.Array[Comment]): File_ = js.native
    def file(program: Program_, comments: js.Array[Comment], tokens: js.Array[Any]): File_ = js.native
    def file(program: Program_, comments: Unit, tokens: js.Array[Any]): File_ = js.native
    
    def forInStatement(): ForInStatement_ = js.native
    def forInStatement(left: Unit, right: Unit, body: Statement): ForInStatement_ = js.native
    def forInStatement(left: Unit, right: Expression): ForInStatement_ = js.native
    def forInStatement(left: Unit, right: Expression, body: Statement): ForInStatement_ = js.native
    def forInStatement(left: LVal): ForInStatement_ = js.native
    def forInStatement(left: LVal, right: Unit, body: Statement): ForInStatement_ = js.native
    def forInStatement(left: LVal, right: Expression): ForInStatement_ = js.native
    def forInStatement(left: LVal, right: Expression, body: Statement): ForInStatement_ = js.native
    def forInStatement(left: VariableDeclaration_): ForInStatement_ = js.native
    def forInStatement(left: VariableDeclaration_, right: Unit, body: Statement): ForInStatement_ = js.native
    def forInStatement(left: VariableDeclaration_, right: Expression): ForInStatement_ = js.native
    def forInStatement(left: VariableDeclaration_, right: Expression, body: Statement): ForInStatement_ = js.native
    
    def forOfStatement(): ForOfStatement_ = js.native
    def forOfStatement(left: Unit, right: Unit, body: Statement): ForOfStatement_ = js.native
    def forOfStatement(left: Unit, right: Expression): ForOfStatement_ = js.native
    def forOfStatement(left: Unit, right: Expression, body: Statement): ForOfStatement_ = js.native
    def forOfStatement(left: LVal): ForOfStatement_ = js.native
    def forOfStatement(left: LVal, right: Unit, body: Statement): ForOfStatement_ = js.native
    def forOfStatement(left: LVal, right: Expression): ForOfStatement_ = js.native
    def forOfStatement(left: LVal, right: Expression, body: Statement): ForOfStatement_ = js.native
    def forOfStatement(left: VariableDeclaration_): ForOfStatement_ = js.native
    def forOfStatement(left: VariableDeclaration_, right: Unit, body: Statement): ForOfStatement_ = js.native
    def forOfStatement(left: VariableDeclaration_, right: Expression): ForOfStatement_ = js.native
    def forOfStatement(left: VariableDeclaration_, right: Expression, body: Statement): ForOfStatement_ = js.native
    
    def forStatement(): ForStatement_ = js.native
    def forStatement(init: Unit, test: Unit, update: Unit, body: Statement): ForStatement_ = js.native
    def forStatement(init: Unit, test: Unit, update: Expression): ForStatement_ = js.native
    def forStatement(init: Unit, test: Unit, update: Expression, body: Statement): ForStatement_ = js.native
    def forStatement(init: Unit, test: Expression): ForStatement_ = js.native
    def forStatement(init: Unit, test: Expression, update: Unit, body: Statement): ForStatement_ = js.native
    def forStatement(init: Unit, test: Expression, update: Expression): ForStatement_ = js.native
    def forStatement(init: Unit, test: Expression, update: Expression, body: Statement): ForStatement_ = js.native
    def forStatement(init: Expression): ForStatement_ = js.native
    def forStatement(init: Expression, test: Unit, update: Unit, body: Statement): ForStatement_ = js.native
    def forStatement(init: Expression, test: Unit, update: Expression): ForStatement_ = js.native
    def forStatement(init: Expression, test: Unit, update: Expression, body: Statement): ForStatement_ = js.native
    def forStatement(init: Expression, test: Expression): ForStatement_ = js.native
    def forStatement(init: Expression, test: Expression, update: Unit, body: Statement): ForStatement_ = js.native
    def forStatement(init: Expression, test: Expression, update: Expression): ForStatement_ = js.native
    def forStatement(init: Expression, test: Expression, update: Expression, body: Statement): ForStatement_ = js.native
    def forStatement(init: VariableDeclaration_): ForStatement_ = js.native
    def forStatement(init: VariableDeclaration_, test: Unit, update: Unit, body: Statement): ForStatement_ = js.native
    def forStatement(init: VariableDeclaration_, test: Unit, update: Expression): ForStatement_ = js.native
    def forStatement(init: VariableDeclaration_, test: Unit, update: Expression, body: Statement): ForStatement_ = js.native
    def forStatement(init: VariableDeclaration_, test: Expression): ForStatement_ = js.native
    def forStatement(init: VariableDeclaration_, test: Expression, update: Unit, body: Statement): ForStatement_ = js.native
    def forStatement(init: VariableDeclaration_, test: Expression, update: Expression): ForStatement_ = js.native
    def forStatement(init: VariableDeclaration_, test: Expression, update: Expression, body: Statement): ForStatement_ = js.native
    
    def functionDeclaration(): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Unit, params: js.Array[LVal]): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Unit, params: js.Array[LVal], body: Unit, generator: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Unit, params: js.Array[LVal], body: Unit, generator: Boolean, async: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Unit, params: js.Array[LVal], body: Unit, generator: Unit, async: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Unit, params: js.Array[LVal], body: BlockStatement_): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Unit, params: js.Array[LVal], body: BlockStatement_, generator: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Unit, params: js.Array[LVal], body: BlockStatement_, generator: Boolean, async: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Unit, params: js.Array[LVal], body: BlockStatement_, generator: Unit, async: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Unit, params: Unit, body: Unit, generator: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Unit, params: Unit, body: Unit, generator: Boolean, async: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Unit, params: Unit, body: Unit, generator: Unit, async: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Unit, params: Unit, body: BlockStatement_): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Unit, params: Unit, body: BlockStatement_, generator: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Unit, params: Unit, body: BlockStatement_, generator: Boolean, async: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Unit, params: Unit, body: BlockStatement_, generator: Unit, async: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Identifier_): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Identifier_, params: js.Array[LVal]): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Identifier_, params: js.Array[LVal], body: Unit, generator: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Identifier_, params: js.Array[LVal], body: Unit, generator: Boolean, async: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Identifier_, params: js.Array[LVal], body: Unit, generator: Unit, async: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Identifier_, params: js.Array[LVal], body: BlockStatement_): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Identifier_, params: js.Array[LVal], body: BlockStatement_, generator: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Identifier_, params: js.Array[LVal], body: BlockStatement_, generator: Boolean, async: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Identifier_, params: js.Array[LVal], body: BlockStatement_, generator: Unit, async: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Identifier_, params: Unit, body: Unit, generator: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Identifier_, params: Unit, body: Unit, generator: Boolean, async: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Identifier_, params: Unit, body: Unit, generator: Unit, async: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Identifier_, params: Unit, body: BlockStatement_): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Identifier_, params: Unit, body: BlockStatement_, generator: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Identifier_, params: Unit, body: BlockStatement_, generator: Boolean, async: Boolean): FunctionDeclaration_ = js.native
    def functionDeclaration(id: Identifier_, params: Unit, body: BlockStatement_, generator: Unit, async: Boolean): FunctionDeclaration_ = js.native
    
    def functionExpression(): FunctionExpression_ = js.native
    def functionExpression(id: Unit, params: js.Array[LVal]): FunctionExpression_ = js.native
    def functionExpression(id: Unit, params: js.Array[LVal], body: Unit, generator: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Unit, params: js.Array[LVal], body: Unit, generator: Boolean, async: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Unit, params: js.Array[LVal], body: Unit, generator: Unit, async: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Unit, params: js.Array[LVal], body: BlockStatement_): FunctionExpression_ = js.native
    def functionExpression(id: Unit, params: js.Array[LVal], body: BlockStatement_, generator: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Unit, params: js.Array[LVal], body: BlockStatement_, generator: Boolean, async: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Unit, params: js.Array[LVal], body: BlockStatement_, generator: Unit, async: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Unit, params: Unit, body: Unit, generator: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Unit, params: Unit, body: Unit, generator: Boolean, async: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Unit, params: Unit, body: Unit, generator: Unit, async: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Unit, params: Unit, body: BlockStatement_): FunctionExpression_ = js.native
    def functionExpression(id: Unit, params: Unit, body: BlockStatement_, generator: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Unit, params: Unit, body: BlockStatement_, generator: Boolean, async: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Unit, params: Unit, body: BlockStatement_, generator: Unit, async: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Identifier_): FunctionExpression_ = js.native
    def functionExpression(id: Identifier_, params: js.Array[LVal]): FunctionExpression_ = js.native
    def functionExpression(id: Identifier_, params: js.Array[LVal], body: Unit, generator: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Identifier_, params: js.Array[LVal], body: Unit, generator: Boolean, async: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Identifier_, params: js.Array[LVal], body: Unit, generator: Unit, async: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Identifier_, params: js.Array[LVal], body: BlockStatement_): FunctionExpression_ = js.native
    def functionExpression(id: Identifier_, params: js.Array[LVal], body: BlockStatement_, generator: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Identifier_, params: js.Array[LVal], body: BlockStatement_, generator: Boolean, async: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Identifier_, params: js.Array[LVal], body: BlockStatement_, generator: Unit, async: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Identifier_, params: Unit, body: Unit, generator: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Identifier_, params: Unit, body: Unit, generator: Boolean, async: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Identifier_, params: Unit, body: Unit, generator: Unit, async: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Identifier_, params: Unit, body: BlockStatement_): FunctionExpression_ = js.native
    def functionExpression(id: Identifier_, params: Unit, body: BlockStatement_, generator: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Identifier_, params: Unit, body: BlockStatement_, generator: Boolean, async: Boolean): FunctionExpression_ = js.native
    def functionExpression(id: Identifier_, params: Unit, body: BlockStatement_, generator: Unit, async: Boolean): FunctionExpression_ = js.native
    
    def functionTypeAnnotation(): FunctionTypeAnnotation_ = js.native
    def functionTypeAnnotation(typeParameters: Unit, params: js.Array[FunctionTypeParam_]): FunctionTypeAnnotation_ = js.native
    def functionTypeAnnotation(
      typeParameters: Unit,
      params: js.Array[FunctionTypeParam_],
      rest: Unit,
      returnType: FlowTypeAnnotation
    ): FunctionTypeAnnotation_ = js.native
    def functionTypeAnnotation(typeParameters: Unit, params: js.Array[FunctionTypeParam_], rest: FunctionTypeParam_): FunctionTypeAnnotation_ = js.native
    def functionTypeAnnotation(
      typeParameters: Unit,
      params: js.Array[FunctionTypeParam_],
      rest: FunctionTypeParam_,
      returnType: FlowTypeAnnotation
    ): FunctionTypeAnnotation_ = js.native
    def functionTypeAnnotation(typeParameters: Unit, params: Unit, rest: Unit, returnType: FlowTypeAnnotation): FunctionTypeAnnotation_ = js.native
    def functionTypeAnnotation(typeParameters: Unit, params: Unit, rest: FunctionTypeParam_): FunctionTypeAnnotation_ = js.native
    def functionTypeAnnotation(typeParameters: Unit, params: Unit, rest: FunctionTypeParam_, returnType: FlowTypeAnnotation): FunctionTypeAnnotation_ = js.native
    def functionTypeAnnotation(typeParameters: TypeParameterDeclaration_): FunctionTypeAnnotation_ = js.native
    def functionTypeAnnotation(typeParameters: TypeParameterDeclaration_, params: js.Array[FunctionTypeParam_]): FunctionTypeAnnotation_ = js.native
    def functionTypeAnnotation(
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[FunctionTypeParam_],
      rest: Unit,
      returnType: FlowTypeAnnotation
    ): FunctionTypeAnnotation_ = js.native
    def functionTypeAnnotation(
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[FunctionTypeParam_],
      rest: FunctionTypeParam_
    ): FunctionTypeAnnotation_ = js.native
    def functionTypeAnnotation(
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[FunctionTypeParam_],
      rest: FunctionTypeParam_,
      returnType: FlowTypeAnnotation
    ): FunctionTypeAnnotation_ = js.native
    def functionTypeAnnotation(
      typeParameters: TypeParameterDeclaration_,
      params: Unit,
      rest: Unit,
      returnType: FlowTypeAnnotation
    ): FunctionTypeAnnotation_ = js.native
    def functionTypeAnnotation(typeParameters: TypeParameterDeclaration_, params: Unit, rest: FunctionTypeParam_): FunctionTypeAnnotation_ = js.native
    def functionTypeAnnotation(
      typeParameters: TypeParameterDeclaration_,
      params: Unit,
      rest: FunctionTypeParam_,
      returnType: FlowTypeAnnotation
    ): FunctionTypeAnnotation_ = js.native
    
    def functionTypeParam(): FunctionTypeParam_ = js.native
    def functionTypeParam(name: Unit, typeAnnotation: FlowTypeAnnotation): FunctionTypeParam_ = js.native
    def functionTypeParam(name: Identifier_): FunctionTypeParam_ = js.native
    def functionTypeParam(name: Identifier_, typeAnnotation: FlowTypeAnnotation): FunctionTypeParam_ = js.native
    
    def genericTypeAnnotation(): GenericTypeAnnotation_ = js.native
    def genericTypeAnnotation(id: Unit, typeParameters: TypeParameterInstantiation_): GenericTypeAnnotation_ = js.native
    def genericTypeAnnotation(id: Identifier_): GenericTypeAnnotation_ = js.native
    def genericTypeAnnotation(id: Identifier_, typeParameters: TypeParameterInstantiation_): GenericTypeAnnotation_ = js.native
    
    def identifier(): Identifier_ = js.native
    def identifier(name: String): Identifier_ = js.native
    
    def ifStatement(): IfStatement_ = js.native
    def ifStatement(test: Unit, consequent: Unit, alternate: Statement): IfStatement_ = js.native
    def ifStatement(test: Unit, consequent: Statement): IfStatement_ = js.native
    def ifStatement(test: Unit, consequent: Statement, alternate: Statement): IfStatement_ = js.native
    def ifStatement(test: Expression): IfStatement_ = js.native
    def ifStatement(test: Expression, consequent: Unit, alternate: Statement): IfStatement_ = js.native
    def ifStatement(test: Expression, consequent: Statement): IfStatement_ = js.native
    def ifStatement(test: Expression, consequent: Statement, alternate: Statement): IfStatement_ = js.native
    
    def importDeclaration(): ImportDeclaration_ = js.native
    def importDeclaration(specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_]): ImportDeclaration_ = js.native
    def importDeclaration(
      specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_],
      source: StringLiteral_
    ): ImportDeclaration_ = js.native
    def importDeclaration(specifiers: Unit, source: StringLiteral_): ImportDeclaration_ = js.native
    
    def importDefaultSpecifier(): ImportDefaultSpecifier_ = js.native
    def importDefaultSpecifier(local: Identifier_): ImportDefaultSpecifier_ = js.native
    
    def importNamespaceSpecifier(): ImportNamespaceSpecifier_ = js.native
    def importNamespaceSpecifier(local: Identifier_): ImportNamespaceSpecifier_ = js.native
    
    def importSpecifier(): ImportSpecifier_ = js.native
    def importSpecifier(local: Unit, imported: Identifier_): ImportSpecifier_ = js.native
    def importSpecifier(local: Identifier_): ImportSpecifier_ = js.native
    def importSpecifier(local: Identifier_, imported: Identifier_): ImportSpecifier_ = js.native
    
    def interfaceDeclaration(): InterfaceDeclaration_ = js.native
    def interfaceDeclaration(id: Unit, typeParameters: Unit, _extends: js.Array[InterfaceExtends_]): InterfaceDeclaration_ = js.native
    def interfaceDeclaration(id: Unit, typeParameters: Unit, _extends: js.Array[InterfaceExtends_], body: ObjectTypeAnnotation_): InterfaceDeclaration_ = js.native
    def interfaceDeclaration(id: Unit, typeParameters: Unit, _extends: Unit, body: ObjectTypeAnnotation_): InterfaceDeclaration_ = js.native
    def interfaceDeclaration(id: Unit, typeParameters: TypeParameterDeclaration_): InterfaceDeclaration_ = js.native
    def interfaceDeclaration(id: Unit, typeParameters: TypeParameterDeclaration_, _extends: js.Array[InterfaceExtends_]): InterfaceDeclaration_ = js.native
    def interfaceDeclaration(
      id: Unit,
      typeParameters: TypeParameterDeclaration_,
      _extends: js.Array[InterfaceExtends_],
      body: ObjectTypeAnnotation_
    ): InterfaceDeclaration_ = js.native
    def interfaceDeclaration(id: Unit, typeParameters: TypeParameterDeclaration_, _extends: Unit, body: ObjectTypeAnnotation_): InterfaceDeclaration_ = js.native
    def interfaceDeclaration(id: Identifier_): InterfaceDeclaration_ = js.native
    def interfaceDeclaration(id: Identifier_, typeParameters: Unit, _extends: js.Array[InterfaceExtends_]): InterfaceDeclaration_ = js.native
    def interfaceDeclaration(
      id: Identifier_,
      typeParameters: Unit,
      _extends: js.Array[InterfaceExtends_],
      body: ObjectTypeAnnotation_
    ): InterfaceDeclaration_ = js.native
    def interfaceDeclaration(id: Identifier_, typeParameters: Unit, _extends: Unit, body: ObjectTypeAnnotation_): InterfaceDeclaration_ = js.native
    def interfaceDeclaration(id: Identifier_, typeParameters: TypeParameterDeclaration_): InterfaceDeclaration_ = js.native
    def interfaceDeclaration(id: Identifier_, typeParameters: TypeParameterDeclaration_, _extends: js.Array[InterfaceExtends_]): InterfaceDeclaration_ = js.native
    def interfaceDeclaration(
      id: Identifier_,
      typeParameters: TypeParameterDeclaration_,
      _extends: js.Array[InterfaceExtends_],
      body: ObjectTypeAnnotation_
    ): InterfaceDeclaration_ = js.native
    def interfaceDeclaration(
      id: Identifier_,
      typeParameters: TypeParameterDeclaration_,
      _extends: Unit,
      body: ObjectTypeAnnotation_
    ): InterfaceDeclaration_ = js.native
    
    def interfaceExtends(): InterfaceExtends_ = js.native
    def interfaceExtends(id: Unit, typeParameters: TypeParameterInstantiation_): InterfaceExtends_ = js.native
    def interfaceExtends(id: Identifier_): InterfaceExtends_ = js.native
    def interfaceExtends(id: Identifier_, typeParameters: TypeParameterInstantiation_): InterfaceExtends_ = js.native
    
    def intersectionTypeAnnotation(): IntersectionTypeAnnotation_ = js.native
    def intersectionTypeAnnotation(types: js.Array[FlowTypeAnnotation]): IntersectionTypeAnnotation_ = js.native
    
    def isAnyTypeAnnotation(): /* is babel-types.babel-types.AnyTypeAnnotation */ Boolean = js.native
    def isAnyTypeAnnotation(node: js.Object): /* is babel-types.babel-types.AnyTypeAnnotation */ Boolean = js.native
    def isAnyTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.AnyTypeAnnotation */ Boolean = js.native
    def isAnyTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.AnyTypeAnnotation */ Boolean = js.native
    def isAnyTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.AnyTypeAnnotation */ Boolean = js.native
    
    def isArrayExpression(): /* is babel-types.babel-types.ArrayExpression */ Boolean = js.native
    def isArrayExpression(node: js.Object): /* is babel-types.babel-types.ArrayExpression */ Boolean = js.native
    def isArrayExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ArrayExpression */ Boolean = js.native
    def isArrayExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.ArrayExpression */ Boolean = js.native
    def isArrayExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.ArrayExpression */ Boolean = js.native
    
    def isArrayPattern(): /* is babel-types.babel-types.ArrayPattern */ Boolean = js.native
    def isArrayPattern(node: js.Object): /* is babel-types.babel-types.ArrayPattern */ Boolean = js.native
    def isArrayPattern(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ArrayPattern */ Boolean = js.native
    def isArrayPattern(node: Null, opts: js.Object): /* is babel-types.babel-types.ArrayPattern */ Boolean = js.native
    def isArrayPattern(node: Unit, opts: js.Object): /* is babel-types.babel-types.ArrayPattern */ Boolean = js.native
    
    def isArrayTypeAnnotation(): /* is babel-types.babel-types.ArrayTypeAnnotation */ Boolean = js.native
    def isArrayTypeAnnotation(node: js.Object): /* is babel-types.babel-types.ArrayTypeAnnotation */ Boolean = js.native
    def isArrayTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ArrayTypeAnnotation */ Boolean = js.native
    def isArrayTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.ArrayTypeAnnotation */ Boolean = js.native
    def isArrayTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.ArrayTypeAnnotation */ Boolean = js.native
    
    def isArrowFunctionExpression(): /* is babel-types.babel-types.ArrowFunctionExpression */ Boolean = js.native
    def isArrowFunctionExpression(node: js.Object): /* is babel-types.babel-types.ArrowFunctionExpression */ Boolean = js.native
    def isArrowFunctionExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ArrowFunctionExpression */ Boolean = js.native
    def isArrowFunctionExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.ArrowFunctionExpression */ Boolean = js.native
    def isArrowFunctionExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.ArrowFunctionExpression */ Boolean = js.native
    
    def isAssignmentExpression(): /* is babel-types.babel-types.AssignmentExpression */ Boolean = js.native
    def isAssignmentExpression(node: js.Object): /* is babel-types.babel-types.AssignmentExpression */ Boolean = js.native
    def isAssignmentExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.AssignmentExpression */ Boolean = js.native
    def isAssignmentExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.AssignmentExpression */ Boolean = js.native
    def isAssignmentExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.AssignmentExpression */ Boolean = js.native
    
    def isAssignmentPattern(): /* is babel-types.babel-types.AssignmentPattern */ Boolean = js.native
    def isAssignmentPattern(node: js.Object): /* is babel-types.babel-types.AssignmentPattern */ Boolean = js.native
    def isAssignmentPattern(node: js.Object, opts: js.Object): /* is babel-types.babel-types.AssignmentPattern */ Boolean = js.native
    def isAssignmentPattern(node: Null, opts: js.Object): /* is babel-types.babel-types.AssignmentPattern */ Boolean = js.native
    def isAssignmentPattern(node: Unit, opts: js.Object): /* is babel-types.babel-types.AssignmentPattern */ Boolean = js.native
    
    def isAwaitExpression(): /* is babel-types.babel-types.AwaitExpression */ Boolean = js.native
    def isAwaitExpression(node: js.Object): /* is babel-types.babel-types.AwaitExpression */ Boolean = js.native
    def isAwaitExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.AwaitExpression */ Boolean = js.native
    def isAwaitExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.AwaitExpression */ Boolean = js.native
    def isAwaitExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.AwaitExpression */ Boolean = js.native
    
    def isBinary(): /* is babel-types.babel-types.Binary */ Boolean = js.native
    def isBinary(node: js.Object): /* is babel-types.babel-types.Binary */ Boolean = js.native
    def isBinary(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Binary */ Boolean = js.native
    def isBinary(node: Null, opts: js.Object): /* is babel-types.babel-types.Binary */ Boolean = js.native
    def isBinary(node: Unit, opts: js.Object): /* is babel-types.babel-types.Binary */ Boolean = js.native
    
    def isBinaryExpression(): /* is babel-types.babel-types.BinaryExpression */ Boolean = js.native
    def isBinaryExpression(node: js.Object): /* is babel-types.babel-types.BinaryExpression */ Boolean = js.native
    def isBinaryExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.BinaryExpression */ Boolean = js.native
    def isBinaryExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.BinaryExpression */ Boolean = js.native
    def isBinaryExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.BinaryExpression */ Boolean = js.native
    
    def isBindExpression(): /* is babel-types.babel-types.BindExpression */ Boolean = js.native
    def isBindExpression(node: js.Object): /* is babel-types.babel-types.BindExpression */ Boolean = js.native
    def isBindExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.BindExpression */ Boolean = js.native
    def isBindExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.BindExpression */ Boolean = js.native
    def isBindExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.BindExpression */ Boolean = js.native
    
    def isBindingIdentifier(): /* is babel-types.babel-types.Identifier */ Boolean = js.native
    def isBindingIdentifier(node: js.Object): /* is babel-types.babel-types.Identifier */ Boolean = js.native
    def isBindingIdentifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Identifier */ Boolean = js.native
    def isBindingIdentifier(node: Null, opts: js.Object): /* is babel-types.babel-types.Identifier */ Boolean = js.native
    def isBindingIdentifier(node: Unit, opts: js.Object): /* is babel-types.babel-types.Identifier */ Boolean = js.native
    
    def isBlock(): /* is babel-types.babel-types.Block */ Boolean = js.native
    def isBlock(node: js.Object): /* is babel-types.babel-types.Block */ Boolean = js.native
    def isBlock(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Block */ Boolean = js.native
    def isBlock(node: Null, opts: js.Object): /* is babel-types.babel-types.Block */ Boolean = js.native
    def isBlock(node: Unit, opts: js.Object): /* is babel-types.babel-types.Block */ Boolean = js.native
    
    def isBlockParent(): /* is babel-types.babel-types.BlockParent */ Boolean = js.native
    def isBlockParent(node: js.Object): /* is babel-types.babel-types.BlockParent */ Boolean = js.native
    def isBlockParent(node: js.Object, opts: js.Object): /* is babel-types.babel-types.BlockParent */ Boolean = js.native
    def isBlockParent(node: Null, opts: js.Object): /* is babel-types.babel-types.BlockParent */ Boolean = js.native
    def isBlockParent(node: Unit, opts: js.Object): /* is babel-types.babel-types.BlockParent */ Boolean = js.native
    
    def isBlockScoped(): Boolean = js.native
    def isBlockScoped(node: js.Object): Boolean = js.native
    def isBlockScoped(node: js.Object, opts: js.Object): Boolean = js.native
    def isBlockScoped(node: Null, opts: js.Object): Boolean = js.native
    def isBlockScoped(node: Unit, opts: js.Object): Boolean = js.native
    
    def isBlockStatement(): /* is babel-types.babel-types.BlockStatement */ Boolean = js.native
    def isBlockStatement(node: js.Object): /* is babel-types.babel-types.BlockStatement */ Boolean = js.native
    def isBlockStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.BlockStatement */ Boolean = js.native
    def isBlockStatement(node: Null, opts: js.Object): /* is babel-types.babel-types.BlockStatement */ Boolean = js.native
    def isBlockStatement(node: Unit, opts: js.Object): /* is babel-types.babel-types.BlockStatement */ Boolean = js.native
    
    def isBooleanLiteral(): /* is babel-types.babel-types.BooleanLiteral */ Boolean = js.native
    def isBooleanLiteral(node: js.Object): /* is babel-types.babel-types.BooleanLiteral */ Boolean = js.native
    def isBooleanLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.BooleanLiteral */ Boolean = js.native
    def isBooleanLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types.BooleanLiteral */ Boolean = js.native
    def isBooleanLiteral(node: Unit, opts: js.Object): /* is babel-types.babel-types.BooleanLiteral */ Boolean = js.native
    
    def isBooleanLiteralTypeAnnotation(): /* is babel-types.babel-types.BooleanLiteralTypeAnnotation */ Boolean = js.native
    def isBooleanLiteralTypeAnnotation(node: js.Object): /* is babel-types.babel-types.BooleanLiteralTypeAnnotation */ Boolean = js.native
    def isBooleanLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.BooleanLiteralTypeAnnotation */ Boolean = js.native
    def isBooleanLiteralTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.BooleanLiteralTypeAnnotation */ Boolean = js.native
    def isBooleanLiteralTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.BooleanLiteralTypeAnnotation */ Boolean = js.native
    
    def isBooleanTypeAnnotation(): /* is babel-types.babel-types.BooleanTypeAnnotation */ Boolean = js.native
    def isBooleanTypeAnnotation(node: js.Object): /* is babel-types.babel-types.BooleanTypeAnnotation */ Boolean = js.native
    def isBooleanTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.BooleanTypeAnnotation */ Boolean = js.native
    def isBooleanTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.BooleanTypeAnnotation */ Boolean = js.native
    def isBooleanTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.BooleanTypeAnnotation */ Boolean = js.native
    
    def isBreakStatement(): /* is babel-types.babel-types.BreakStatement */ Boolean = js.native
    def isBreakStatement(node: js.Object): /* is babel-types.babel-types.BreakStatement */ Boolean = js.native
    def isBreakStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.BreakStatement */ Boolean = js.native
    def isBreakStatement(node: Null, opts: js.Object): /* is babel-types.babel-types.BreakStatement */ Boolean = js.native
    def isBreakStatement(node: Unit, opts: js.Object): /* is babel-types.babel-types.BreakStatement */ Boolean = js.native
    
    def isCallExpression(): /* is babel-types.babel-types.CallExpression */ Boolean = js.native
    def isCallExpression(node: js.Object): /* is babel-types.babel-types.CallExpression */ Boolean = js.native
    def isCallExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.CallExpression */ Boolean = js.native
    def isCallExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.CallExpression */ Boolean = js.native
    def isCallExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.CallExpression */ Boolean = js.native
    
    def isCatchClause(): /* is babel-types.babel-types.CatchClause */ Boolean = js.native
    def isCatchClause(node: js.Object): /* is babel-types.babel-types.CatchClause */ Boolean = js.native
    def isCatchClause(node: js.Object, opts: js.Object): /* is babel-types.babel-types.CatchClause */ Boolean = js.native
    def isCatchClause(node: Null, opts: js.Object): /* is babel-types.babel-types.CatchClause */ Boolean = js.native
    def isCatchClause(node: Unit, opts: js.Object): /* is babel-types.babel-types.CatchClause */ Boolean = js.native
    
    def isClass(): /* is babel-types.babel-types.Class */ Boolean = js.native
    def isClass(node: js.Object): /* is babel-types.babel-types.Class */ Boolean = js.native
    def isClass(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Class */ Boolean = js.native
    def isClass(node: Null, opts: js.Object): /* is babel-types.babel-types.Class */ Boolean = js.native
    def isClass(node: Unit, opts: js.Object): /* is babel-types.babel-types.Class */ Boolean = js.native
    
    def isClassBody(): /* is babel-types.babel-types.ClassBody */ Boolean = js.native
    def isClassBody(node: js.Object): /* is babel-types.babel-types.ClassBody */ Boolean = js.native
    def isClassBody(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ClassBody */ Boolean = js.native
    def isClassBody(node: Null, opts: js.Object): /* is babel-types.babel-types.ClassBody */ Boolean = js.native
    def isClassBody(node: Unit, opts: js.Object): /* is babel-types.babel-types.ClassBody */ Boolean = js.native
    
    def isClassDeclaration(): /* is babel-types.babel-types.ClassDeclaration */ Boolean = js.native
    def isClassDeclaration(node: js.Object): /* is babel-types.babel-types.ClassDeclaration */ Boolean = js.native
    def isClassDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ClassDeclaration */ Boolean = js.native
    def isClassDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.ClassDeclaration */ Boolean = js.native
    def isClassDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.ClassDeclaration */ Boolean = js.native
    
    def isClassExpression(): /* is babel-types.babel-types.ClassExpression */ Boolean = js.native
    def isClassExpression(node: js.Object): /* is babel-types.babel-types.ClassExpression */ Boolean = js.native
    def isClassExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ClassExpression */ Boolean = js.native
    def isClassExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.ClassExpression */ Boolean = js.native
    def isClassExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.ClassExpression */ Boolean = js.native
    
    def isClassImplements(): /* is babel-types.babel-types.ClassImplements */ Boolean = js.native
    def isClassImplements(node: js.Object): /* is babel-types.babel-types.ClassImplements */ Boolean = js.native
    def isClassImplements(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ClassImplements */ Boolean = js.native
    def isClassImplements(node: Null, opts: js.Object): /* is babel-types.babel-types.ClassImplements */ Boolean = js.native
    def isClassImplements(node: Unit, opts: js.Object): /* is babel-types.babel-types.ClassImplements */ Boolean = js.native
    
    def isClassMethod(): /* is babel-types.babel-types.ClassMethod */ Boolean = js.native
    def isClassMethod(node: js.Object): /* is babel-types.babel-types.ClassMethod */ Boolean = js.native
    def isClassMethod(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ClassMethod */ Boolean = js.native
    def isClassMethod(node: Null, opts: js.Object): /* is babel-types.babel-types.ClassMethod */ Boolean = js.native
    def isClassMethod(node: Unit, opts: js.Object): /* is babel-types.babel-types.ClassMethod */ Boolean = js.native
    
    def isClassProperty(): /* is babel-types.babel-types.ClassProperty */ Boolean = js.native
    def isClassProperty(node: js.Object): /* is babel-types.babel-types.ClassProperty */ Boolean = js.native
    def isClassProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ClassProperty */ Boolean = js.native
    def isClassProperty(node: Null, opts: js.Object): /* is babel-types.babel-types.ClassProperty */ Boolean = js.native
    def isClassProperty(node: Unit, opts: js.Object): /* is babel-types.babel-types.ClassProperty */ Boolean = js.native
    
    def isCompletionStatement(): /* is babel-types.babel-types.CompletionStatement */ Boolean = js.native
    def isCompletionStatement(node: js.Object): /* is babel-types.babel-types.CompletionStatement */ Boolean = js.native
    def isCompletionStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.CompletionStatement */ Boolean = js.native
    def isCompletionStatement(node: Null, opts: js.Object): /* is babel-types.babel-types.CompletionStatement */ Boolean = js.native
    def isCompletionStatement(node: Unit, opts: js.Object): /* is babel-types.babel-types.CompletionStatement */ Boolean = js.native
    
    def isConditional(): /* is babel-types.babel-types.Conditional */ Boolean = js.native
    def isConditional(node: js.Object): /* is babel-types.babel-types.Conditional */ Boolean = js.native
    def isConditional(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Conditional */ Boolean = js.native
    def isConditional(node: Null, opts: js.Object): /* is babel-types.babel-types.Conditional */ Boolean = js.native
    def isConditional(node: Unit, opts: js.Object): /* is babel-types.babel-types.Conditional */ Boolean = js.native
    
    def isConditionalExpression(): /* is babel-types.babel-types.ConditionalExpression */ Boolean = js.native
    def isConditionalExpression(node: js.Object): /* is babel-types.babel-types.ConditionalExpression */ Boolean = js.native
    def isConditionalExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ConditionalExpression */ Boolean = js.native
    def isConditionalExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.ConditionalExpression */ Boolean = js.native
    def isConditionalExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.ConditionalExpression */ Boolean = js.native
    
    def isContinueStatement(): /* is babel-types.babel-types.ContinueStatement */ Boolean = js.native
    def isContinueStatement(node: js.Object): /* is babel-types.babel-types.ContinueStatement */ Boolean = js.native
    def isContinueStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ContinueStatement */ Boolean = js.native
    def isContinueStatement(node: Null, opts: js.Object): /* is babel-types.babel-types.ContinueStatement */ Boolean = js.native
    def isContinueStatement(node: Unit, opts: js.Object): /* is babel-types.babel-types.ContinueStatement */ Boolean = js.native
    
    def isDebuggerStatement(): /* is babel-types.babel-types.DebuggerStatement */ Boolean = js.native
    def isDebuggerStatement(node: js.Object): /* is babel-types.babel-types.DebuggerStatement */ Boolean = js.native
    def isDebuggerStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.DebuggerStatement */ Boolean = js.native
    def isDebuggerStatement(node: Null, opts: js.Object): /* is babel-types.babel-types.DebuggerStatement */ Boolean = js.native
    def isDebuggerStatement(node: Unit, opts: js.Object): /* is babel-types.babel-types.DebuggerStatement */ Boolean = js.native
    
    def isDeclaration(): /* is babel-types.babel-types.Declaration */ Boolean = js.native
    def isDeclaration(node: js.Object): /* is babel-types.babel-types.Declaration */ Boolean = js.native
    def isDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Declaration */ Boolean = js.native
    def isDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.Declaration */ Boolean = js.native
    def isDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.Declaration */ Boolean = js.native
    
    def isDeclareClass(): /* is babel-types.babel-types.DeclareClass */ Boolean = js.native
    def isDeclareClass(node: js.Object): /* is babel-types.babel-types.DeclareClass */ Boolean = js.native
    def isDeclareClass(node: js.Object, opts: js.Object): /* is babel-types.babel-types.DeclareClass */ Boolean = js.native
    def isDeclareClass(node: Null, opts: js.Object): /* is babel-types.babel-types.DeclareClass */ Boolean = js.native
    def isDeclareClass(node: Unit, opts: js.Object): /* is babel-types.babel-types.DeclareClass */ Boolean = js.native
    
    def isDeclareFunction(): /* is babel-types.babel-types.DeclareFunction */ Boolean = js.native
    def isDeclareFunction(node: js.Object): /* is babel-types.babel-types.DeclareFunction */ Boolean = js.native
    def isDeclareFunction(node: js.Object, opts: js.Object): /* is babel-types.babel-types.DeclareFunction */ Boolean = js.native
    def isDeclareFunction(node: Null, opts: js.Object): /* is babel-types.babel-types.DeclareFunction */ Boolean = js.native
    def isDeclareFunction(node: Unit, opts: js.Object): /* is babel-types.babel-types.DeclareFunction */ Boolean = js.native
    
    def isDeclareInterface(): /* is babel-types.babel-types.DeclareInterface */ Boolean = js.native
    def isDeclareInterface(node: js.Object): /* is babel-types.babel-types.DeclareInterface */ Boolean = js.native
    def isDeclareInterface(node: js.Object, opts: js.Object): /* is babel-types.babel-types.DeclareInterface */ Boolean = js.native
    def isDeclareInterface(node: Null, opts: js.Object): /* is babel-types.babel-types.DeclareInterface */ Boolean = js.native
    def isDeclareInterface(node: Unit, opts: js.Object): /* is babel-types.babel-types.DeclareInterface */ Boolean = js.native
    
    def isDeclareModule(): /* is babel-types.babel-types.DeclareModule */ Boolean = js.native
    def isDeclareModule(node: js.Object): /* is babel-types.babel-types.DeclareModule */ Boolean = js.native
    def isDeclareModule(node: js.Object, opts: js.Object): /* is babel-types.babel-types.DeclareModule */ Boolean = js.native
    def isDeclareModule(node: Null, opts: js.Object): /* is babel-types.babel-types.DeclareModule */ Boolean = js.native
    def isDeclareModule(node: Unit, opts: js.Object): /* is babel-types.babel-types.DeclareModule */ Boolean = js.native
    
    def isDeclareTypeAlias(): /* is babel-types.babel-types.DeclareTypeAlias */ Boolean = js.native
    def isDeclareTypeAlias(node: js.Object): /* is babel-types.babel-types.DeclareTypeAlias */ Boolean = js.native
    def isDeclareTypeAlias(node: js.Object, opts: js.Object): /* is babel-types.babel-types.DeclareTypeAlias */ Boolean = js.native
    def isDeclareTypeAlias(node: Null, opts: js.Object): /* is babel-types.babel-types.DeclareTypeAlias */ Boolean = js.native
    def isDeclareTypeAlias(node: Unit, opts: js.Object): /* is babel-types.babel-types.DeclareTypeAlias */ Boolean = js.native
    
    def isDeclareVariable(): /* is babel-types.babel-types.DeclareVariable */ Boolean = js.native
    def isDeclareVariable(node: js.Object): /* is babel-types.babel-types.DeclareVariable */ Boolean = js.native
    def isDeclareVariable(node: js.Object, opts: js.Object): /* is babel-types.babel-types.DeclareVariable */ Boolean = js.native
    def isDeclareVariable(node: Null, opts: js.Object): /* is babel-types.babel-types.DeclareVariable */ Boolean = js.native
    def isDeclareVariable(node: Unit, opts: js.Object): /* is babel-types.babel-types.DeclareVariable */ Boolean = js.native
    
    def isDecorator(): /* is babel-types.babel-types.Decorator */ Boolean = js.native
    def isDecorator(node: js.Object): /* is babel-types.babel-types.Decorator */ Boolean = js.native
    def isDecorator(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Decorator */ Boolean = js.native
    def isDecorator(node: Null, opts: js.Object): /* is babel-types.babel-types.Decorator */ Boolean = js.native
    def isDecorator(node: Unit, opts: js.Object): /* is babel-types.babel-types.Decorator */ Boolean = js.native
    
    def isDirective(): /* is babel-types.babel-types.Directive */ Boolean = js.native
    def isDirective(node: js.Object): /* is babel-types.babel-types.Directive */ Boolean = js.native
    def isDirective(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Directive */ Boolean = js.native
    def isDirective(node: Null, opts: js.Object): /* is babel-types.babel-types.Directive */ Boolean = js.native
    def isDirective(node: Unit, opts: js.Object): /* is babel-types.babel-types.Directive */ Boolean = js.native
    
    def isDirectiveLiteral(): /* is babel-types.babel-types.DirectiveLiteral */ Boolean = js.native
    def isDirectiveLiteral(node: js.Object): /* is babel-types.babel-types.DirectiveLiteral */ Boolean = js.native
    def isDirectiveLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.DirectiveLiteral */ Boolean = js.native
    def isDirectiveLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types.DirectiveLiteral */ Boolean = js.native
    def isDirectiveLiteral(node: Unit, opts: js.Object): /* is babel-types.babel-types.DirectiveLiteral */ Boolean = js.native
    
    def isDoExpression(): /* is babel-types.babel-types.DoExpression */ Boolean = js.native
    def isDoExpression(node: js.Object): /* is babel-types.babel-types.DoExpression */ Boolean = js.native
    def isDoExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.DoExpression */ Boolean = js.native
    def isDoExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.DoExpression */ Boolean = js.native
    def isDoExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.DoExpression */ Boolean = js.native
    
    def isDoWhileStatement(): /* is babel-types.babel-types.DoWhileStatement */ Boolean = js.native
    def isDoWhileStatement(node: js.Object): /* is babel-types.babel-types.DoWhileStatement */ Boolean = js.native
    def isDoWhileStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.DoWhileStatement */ Boolean = js.native
    def isDoWhileStatement(node: Null, opts: js.Object): /* is babel-types.babel-types.DoWhileStatement */ Boolean = js.native
    def isDoWhileStatement(node: Unit, opts: js.Object): /* is babel-types.babel-types.DoWhileStatement */ Boolean = js.native
    
    def isEmptyStatement(): /* is babel-types.babel-types.EmptyStatement */ Boolean = js.native
    def isEmptyStatement(node: js.Object): /* is babel-types.babel-types.EmptyStatement */ Boolean = js.native
    def isEmptyStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.EmptyStatement */ Boolean = js.native
    def isEmptyStatement(node: Null, opts: js.Object): /* is babel-types.babel-types.EmptyStatement */ Boolean = js.native
    def isEmptyStatement(node: Unit, opts: js.Object): /* is babel-types.babel-types.EmptyStatement */ Boolean = js.native
    
    def isExistentialTypeParam(): /* is babel-types.babel-types.ExistentialTypeParam */ Boolean = js.native
    def isExistentialTypeParam(node: js.Object): /* is babel-types.babel-types.ExistentialTypeParam */ Boolean = js.native
    def isExistentialTypeParam(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ExistentialTypeParam */ Boolean = js.native
    def isExistentialTypeParam(node: Null, opts: js.Object): /* is babel-types.babel-types.ExistentialTypeParam */ Boolean = js.native
    def isExistentialTypeParam(node: Unit, opts: js.Object): /* is babel-types.babel-types.ExistentialTypeParam */ Boolean = js.native
    
    def isExportAllDeclaration(): /* is babel-types.babel-types.ExportAllDeclaration */ Boolean = js.native
    def isExportAllDeclaration(node: js.Object): /* is babel-types.babel-types.ExportAllDeclaration */ Boolean = js.native
    def isExportAllDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ExportAllDeclaration */ Boolean = js.native
    def isExportAllDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.ExportAllDeclaration */ Boolean = js.native
    def isExportAllDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.ExportAllDeclaration */ Boolean = js.native
    
    def isExportDeclaration(): /* is babel-types.babel-types.ExportDeclaration */ Boolean = js.native
    def isExportDeclaration(node: js.Object): /* is babel-types.babel-types.ExportDeclaration */ Boolean = js.native
    def isExportDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ExportDeclaration */ Boolean = js.native
    def isExportDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.ExportDeclaration */ Boolean = js.native
    def isExportDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.ExportDeclaration */ Boolean = js.native
    
    def isExportDefaultDeclaration(): /* is babel-types.babel-types.ExportDefaultDeclaration */ Boolean = js.native
    def isExportDefaultDeclaration(node: js.Object): /* is babel-types.babel-types.ExportDefaultDeclaration */ Boolean = js.native
    def isExportDefaultDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ExportDefaultDeclaration */ Boolean = js.native
    def isExportDefaultDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.ExportDefaultDeclaration */ Boolean = js.native
    def isExportDefaultDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.ExportDefaultDeclaration */ Boolean = js.native
    
    def isExportDefaultSpecifier(): /* is babel-types.babel-types.ExportDefaultSpecifier */ Boolean = js.native
    def isExportDefaultSpecifier(node: js.Object): /* is babel-types.babel-types.ExportDefaultSpecifier */ Boolean = js.native
    def isExportDefaultSpecifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ExportDefaultSpecifier */ Boolean = js.native
    def isExportDefaultSpecifier(node: Null, opts: js.Object): /* is babel-types.babel-types.ExportDefaultSpecifier */ Boolean = js.native
    def isExportDefaultSpecifier(node: Unit, opts: js.Object): /* is babel-types.babel-types.ExportDefaultSpecifier */ Boolean = js.native
    
    def isExportNamedDeclaration(): /* is babel-types.babel-types.ExportNamedDeclaration */ Boolean = js.native
    def isExportNamedDeclaration(node: js.Object): /* is babel-types.babel-types.ExportNamedDeclaration */ Boolean = js.native
    def isExportNamedDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ExportNamedDeclaration */ Boolean = js.native
    def isExportNamedDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.ExportNamedDeclaration */ Boolean = js.native
    def isExportNamedDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.ExportNamedDeclaration */ Boolean = js.native
    
    def isExportNamespaceSpecifier(): /* is babel-types.babel-types.ExportNamespaceSpecifier */ Boolean = js.native
    def isExportNamespaceSpecifier(node: js.Object): /* is babel-types.babel-types.ExportNamespaceSpecifier */ Boolean = js.native
    def isExportNamespaceSpecifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ExportNamespaceSpecifier */ Boolean = js.native
    def isExportNamespaceSpecifier(node: Null, opts: js.Object): /* is babel-types.babel-types.ExportNamespaceSpecifier */ Boolean = js.native
    def isExportNamespaceSpecifier(node: Unit, opts: js.Object): /* is babel-types.babel-types.ExportNamespaceSpecifier */ Boolean = js.native
    
    def isExportSpecifier(): /* is babel-types.babel-types.ExportSpecifier */ Boolean = js.native
    def isExportSpecifier(node: js.Object): /* is babel-types.babel-types.ExportSpecifier */ Boolean = js.native
    def isExportSpecifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ExportSpecifier */ Boolean = js.native
    def isExportSpecifier(node: Null, opts: js.Object): /* is babel-types.babel-types.ExportSpecifier */ Boolean = js.native
    def isExportSpecifier(node: Unit, opts: js.Object): /* is babel-types.babel-types.ExportSpecifier */ Boolean = js.native
    
    def isExpression(): /* is babel-types.babel-types.Expression */ Boolean = js.native
    def isExpression(node: js.Object): /* is babel-types.babel-types.Expression */ Boolean = js.native
    def isExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Expression */ Boolean = js.native
    def isExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.Expression */ Boolean = js.native
    def isExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.Expression */ Boolean = js.native
    
    def isExpressionStatement(): /* is babel-types.babel-types.ExpressionStatement */ Boolean = js.native
    def isExpressionStatement(node: js.Object): /* is babel-types.babel-types.ExpressionStatement */ Boolean = js.native
    def isExpressionStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ExpressionStatement */ Boolean = js.native
    def isExpressionStatement(node: Null, opts: js.Object): /* is babel-types.babel-types.ExpressionStatement */ Boolean = js.native
    def isExpressionStatement(node: Unit, opts: js.Object): /* is babel-types.babel-types.ExpressionStatement */ Boolean = js.native
    
    def isExpressionWrapper(): /* is babel-types.babel-types.ExpressionWrapper */ Boolean = js.native
    def isExpressionWrapper(node: js.Object): /* is babel-types.babel-types.ExpressionWrapper */ Boolean = js.native
    def isExpressionWrapper(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ExpressionWrapper */ Boolean = js.native
    def isExpressionWrapper(node: Null, opts: js.Object): /* is babel-types.babel-types.ExpressionWrapper */ Boolean = js.native
    def isExpressionWrapper(node: Unit, opts: js.Object): /* is babel-types.babel-types.ExpressionWrapper */ Boolean = js.native
    
    def isFile(): /* is babel-types.babel-types.File */ Boolean = js.native
    def isFile(node: js.Object): /* is babel-types.babel-types.File */ Boolean = js.native
    def isFile(node: js.Object, opts: js.Object): /* is babel-types.babel-types.File */ Boolean = js.native
    def isFile(node: Null, opts: js.Object): /* is babel-types.babel-types.File */ Boolean = js.native
    def isFile(node: Unit, opts: js.Object): /* is babel-types.babel-types.File */ Boolean = js.native
    
    def isFlow(): /* is babel-types.babel-types.Flow */ Boolean = js.native
    def isFlow(node: js.Object): /* is babel-types.babel-types.Flow */ Boolean = js.native
    def isFlow(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Flow */ Boolean = js.native
    def isFlow(node: Null, opts: js.Object): /* is babel-types.babel-types.Flow */ Boolean = js.native
    def isFlow(node: Unit, opts: js.Object): /* is babel-types.babel-types.Flow */ Boolean = js.native
    
    def isFlowBaseAnnotation(): /* is babel-types.babel-types.FlowBaseAnnotation */ Boolean = js.native
    def isFlowBaseAnnotation(node: js.Object): /* is babel-types.babel-types.FlowBaseAnnotation */ Boolean = js.native
    def isFlowBaseAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.FlowBaseAnnotation */ Boolean = js.native
    def isFlowBaseAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.FlowBaseAnnotation */ Boolean = js.native
    def isFlowBaseAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.FlowBaseAnnotation */ Boolean = js.native
    
    def isFlowDeclaration(): /* is babel-types.babel-types.FlowDeclaration */ Boolean = js.native
    def isFlowDeclaration(node: js.Object): /* is babel-types.babel-types.FlowDeclaration */ Boolean = js.native
    def isFlowDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.FlowDeclaration */ Boolean = js.native
    def isFlowDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.FlowDeclaration */ Boolean = js.native
    def isFlowDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.FlowDeclaration */ Boolean = js.native
    
    def isFor(): /* is babel-types.babel-types.For */ Boolean = js.native
    def isFor(node: js.Object): /* is babel-types.babel-types.For */ Boolean = js.native
    def isFor(node: js.Object, opts: js.Object): /* is babel-types.babel-types.For */ Boolean = js.native
    def isFor(node: Null, opts: js.Object): /* is babel-types.babel-types.For */ Boolean = js.native
    def isFor(node: Unit, opts: js.Object): /* is babel-types.babel-types.For */ Boolean = js.native
    
    def isForInStatement(): /* is babel-types.babel-types.ForInStatement */ Boolean = js.native
    def isForInStatement(node: js.Object): /* is babel-types.babel-types.ForInStatement */ Boolean = js.native
    def isForInStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ForInStatement */ Boolean = js.native
    def isForInStatement(node: Null, opts: js.Object): /* is babel-types.babel-types.ForInStatement */ Boolean = js.native
    def isForInStatement(node: Unit, opts: js.Object): /* is babel-types.babel-types.ForInStatement */ Boolean = js.native
    
    def isForOfStatement(): /* is babel-types.babel-types.ForOfStatement */ Boolean = js.native
    def isForOfStatement(node: js.Object): /* is babel-types.babel-types.ForOfStatement */ Boolean = js.native
    def isForOfStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ForOfStatement */ Boolean = js.native
    def isForOfStatement(node: Null, opts: js.Object): /* is babel-types.babel-types.ForOfStatement */ Boolean = js.native
    def isForOfStatement(node: Unit, opts: js.Object): /* is babel-types.babel-types.ForOfStatement */ Boolean = js.native
    
    def isForStatement(): /* is babel-types.babel-types.ForStatement */ Boolean = js.native
    def isForStatement(node: js.Object): /* is babel-types.babel-types.ForStatement */ Boolean = js.native
    def isForStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ForStatement */ Boolean = js.native
    def isForStatement(node: Null, opts: js.Object): /* is babel-types.babel-types.ForStatement */ Boolean = js.native
    def isForStatement(node: Unit, opts: js.Object): /* is babel-types.babel-types.ForStatement */ Boolean = js.native
    
    def isForXStatement(): /* is babel-types.babel-types.ForXStatement */ Boolean = js.native
    def isForXStatement(node: js.Object): /* is babel-types.babel-types.ForXStatement */ Boolean = js.native
    def isForXStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ForXStatement */ Boolean = js.native
    def isForXStatement(node: Null, opts: js.Object): /* is babel-types.babel-types.ForXStatement */ Boolean = js.native
    def isForXStatement(node: Unit, opts: js.Object): /* is babel-types.babel-types.ForXStatement */ Boolean = js.native
    
    def isFunction(): /* is babel-types.babel-types.Function */ Boolean = js.native
    def isFunction(node: js.Object): /* is babel-types.babel-types.Function */ Boolean = js.native
    def isFunction(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Function */ Boolean = js.native
    def isFunction(node: Null, opts: js.Object): /* is babel-types.babel-types.Function */ Boolean = js.native
    def isFunction(node: Unit, opts: js.Object): /* is babel-types.babel-types.Function */ Boolean = js.native
    
    def isFunctionDeclaration(): /* is babel-types.babel-types.FunctionDeclaration */ Boolean = js.native
    def isFunctionDeclaration(node: js.Object): /* is babel-types.babel-types.FunctionDeclaration */ Boolean = js.native
    def isFunctionDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.FunctionDeclaration */ Boolean = js.native
    def isFunctionDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.FunctionDeclaration */ Boolean = js.native
    def isFunctionDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.FunctionDeclaration */ Boolean = js.native
    
    def isFunctionExpression(): /* is babel-types.babel-types.FunctionExpression */ Boolean = js.native
    def isFunctionExpression(node: js.Object): /* is babel-types.babel-types.FunctionExpression */ Boolean = js.native
    def isFunctionExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.FunctionExpression */ Boolean = js.native
    def isFunctionExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.FunctionExpression */ Boolean = js.native
    def isFunctionExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.FunctionExpression */ Boolean = js.native
    
    def isFunctionParent(): /* is babel-types.babel-types.FunctionParent */ Boolean = js.native
    def isFunctionParent(node: js.Object): /* is babel-types.babel-types.FunctionParent */ Boolean = js.native
    def isFunctionParent(node: js.Object, opts: js.Object): /* is babel-types.babel-types.FunctionParent */ Boolean = js.native
    def isFunctionParent(node: Null, opts: js.Object): /* is babel-types.babel-types.FunctionParent */ Boolean = js.native
    def isFunctionParent(node: Unit, opts: js.Object): /* is babel-types.babel-types.FunctionParent */ Boolean = js.native
    
    def isFunctionTypeAnnotation(): /* is babel-types.babel-types.FunctionTypeAnnotation */ Boolean = js.native
    def isFunctionTypeAnnotation(node: js.Object): /* is babel-types.babel-types.FunctionTypeAnnotation */ Boolean = js.native
    def isFunctionTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.FunctionTypeAnnotation */ Boolean = js.native
    def isFunctionTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.FunctionTypeAnnotation */ Boolean = js.native
    def isFunctionTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.FunctionTypeAnnotation */ Boolean = js.native
    
    def isFunctionTypeParam(): /* is babel-types.babel-types.FunctionTypeParam */ Boolean = js.native
    def isFunctionTypeParam(node: js.Object): /* is babel-types.babel-types.FunctionTypeParam */ Boolean = js.native
    def isFunctionTypeParam(node: js.Object, opts: js.Object): /* is babel-types.babel-types.FunctionTypeParam */ Boolean = js.native
    def isFunctionTypeParam(node: Null, opts: js.Object): /* is babel-types.babel-types.FunctionTypeParam */ Boolean = js.native
    def isFunctionTypeParam(node: Unit, opts: js.Object): /* is babel-types.babel-types.FunctionTypeParam */ Boolean = js.native
    
    def isGenerated(): Boolean = js.native
    def isGenerated(node: js.Object): Boolean = js.native
    def isGenerated(node: js.Object, opts: js.Object): Boolean = js.native
    def isGenerated(node: Null, opts: js.Object): Boolean = js.native
    def isGenerated(node: Unit, opts: js.Object): Boolean = js.native
    
    def isGenericTypeAnnotation(): /* is babel-types.babel-types.GenericTypeAnnotation */ Boolean = js.native
    def isGenericTypeAnnotation(node: js.Object): /* is babel-types.babel-types.GenericTypeAnnotation */ Boolean = js.native
    def isGenericTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.GenericTypeAnnotation */ Boolean = js.native
    def isGenericTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.GenericTypeAnnotation */ Boolean = js.native
    def isGenericTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.GenericTypeAnnotation */ Boolean = js.native
    
    def isIdentifier(): /* is babel-types.babel-types.Identifier */ Boolean = js.native
    def isIdentifier(node: js.Object): /* is babel-types.babel-types.Identifier */ Boolean = js.native
    def isIdentifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Identifier */ Boolean = js.native
    def isIdentifier(node: Null, opts: js.Object): /* is babel-types.babel-types.Identifier */ Boolean = js.native
    def isIdentifier(node: Unit, opts: js.Object): /* is babel-types.babel-types.Identifier */ Boolean = js.native
    
    def isIfStatement(): /* is babel-types.babel-types.IfStatement */ Boolean = js.native
    def isIfStatement(node: js.Object): /* is babel-types.babel-types.IfStatement */ Boolean = js.native
    def isIfStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.IfStatement */ Boolean = js.native
    def isIfStatement(node: Null, opts: js.Object): /* is babel-types.babel-types.IfStatement */ Boolean = js.native
    def isIfStatement(node: Unit, opts: js.Object): /* is babel-types.babel-types.IfStatement */ Boolean = js.native
    
    def isImmutable(): /* is babel-types.babel-types.Immutable */ Boolean = js.native
    def isImmutable(node: js.Object): /* is babel-types.babel-types.Immutable */ Boolean = js.native
    def isImmutable(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Immutable */ Boolean = js.native
    def isImmutable(node: Null, opts: js.Object): /* is babel-types.babel-types.Immutable */ Boolean = js.native
    def isImmutable(node: Unit, opts: js.Object): /* is babel-types.babel-types.Immutable */ Boolean = js.native
    
    def isImportDeclaration(): /* is babel-types.babel-types.ImportDeclaration */ Boolean = js.native
    def isImportDeclaration(node: js.Object): /* is babel-types.babel-types.ImportDeclaration */ Boolean = js.native
    def isImportDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ImportDeclaration */ Boolean = js.native
    def isImportDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.ImportDeclaration */ Boolean = js.native
    def isImportDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.ImportDeclaration */ Boolean = js.native
    
    def isImportDefaultSpecifier(): /* is babel-types.babel-types.ImportDefaultSpecifier */ Boolean = js.native
    def isImportDefaultSpecifier(node: js.Object): /* is babel-types.babel-types.ImportDefaultSpecifier */ Boolean = js.native
    def isImportDefaultSpecifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ImportDefaultSpecifier */ Boolean = js.native
    def isImportDefaultSpecifier(node: Null, opts: js.Object): /* is babel-types.babel-types.ImportDefaultSpecifier */ Boolean = js.native
    def isImportDefaultSpecifier(node: Unit, opts: js.Object): /* is babel-types.babel-types.ImportDefaultSpecifier */ Boolean = js.native
    
    def isImportNamespaceSpecifier(): /* is babel-types.babel-types.ImportNamespaceSpecifier */ Boolean = js.native
    def isImportNamespaceSpecifier(node: js.Object): /* is babel-types.babel-types.ImportNamespaceSpecifier */ Boolean = js.native
    def isImportNamespaceSpecifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ImportNamespaceSpecifier */ Boolean = js.native
    def isImportNamespaceSpecifier(node: Null, opts: js.Object): /* is babel-types.babel-types.ImportNamespaceSpecifier */ Boolean = js.native
    def isImportNamespaceSpecifier(node: Unit, opts: js.Object): /* is babel-types.babel-types.ImportNamespaceSpecifier */ Boolean = js.native
    
    def isImportSpecifier(): /* is babel-types.babel-types.ImportSpecifier */ Boolean = js.native
    def isImportSpecifier(node: js.Object): /* is babel-types.babel-types.ImportSpecifier */ Boolean = js.native
    def isImportSpecifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ImportSpecifier */ Boolean = js.native
    def isImportSpecifier(node: Null, opts: js.Object): /* is babel-types.babel-types.ImportSpecifier */ Boolean = js.native
    def isImportSpecifier(node: Unit, opts: js.Object): /* is babel-types.babel-types.ImportSpecifier */ Boolean = js.native
    
    def isInterfaceDeclaration(): /* is babel-types.babel-types.InterfaceDeclaration */ Boolean = js.native
    def isInterfaceDeclaration(node: js.Object): /* is babel-types.babel-types.InterfaceDeclaration */ Boolean = js.native
    def isInterfaceDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.InterfaceDeclaration */ Boolean = js.native
    def isInterfaceDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.InterfaceDeclaration */ Boolean = js.native
    def isInterfaceDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.InterfaceDeclaration */ Boolean = js.native
    
    def isInterfaceExtends(): /* is babel-types.babel-types.InterfaceExtends */ Boolean = js.native
    def isInterfaceExtends(node: js.Object): /* is babel-types.babel-types.InterfaceExtends */ Boolean = js.native
    def isInterfaceExtends(node: js.Object, opts: js.Object): /* is babel-types.babel-types.InterfaceExtends */ Boolean = js.native
    def isInterfaceExtends(node: Null, opts: js.Object): /* is babel-types.babel-types.InterfaceExtends */ Boolean = js.native
    def isInterfaceExtends(node: Unit, opts: js.Object): /* is babel-types.babel-types.InterfaceExtends */ Boolean = js.native
    
    def isIntersectionTypeAnnotation(): /* is babel-types.babel-types.IntersectionTypeAnnotation */ Boolean = js.native
    def isIntersectionTypeAnnotation(node: js.Object): /* is babel-types.babel-types.IntersectionTypeAnnotation */ Boolean = js.native
    def isIntersectionTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.IntersectionTypeAnnotation */ Boolean = js.native
    def isIntersectionTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.IntersectionTypeAnnotation */ Boolean = js.native
    def isIntersectionTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.IntersectionTypeAnnotation */ Boolean = js.native
    
    def isJSX(): /* is babel-types.babel-types.JSX */ Boolean = js.native
    def isJSX(node: js.Object): /* is babel-types.babel-types.JSX */ Boolean = js.native
    def isJSX(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSX */ Boolean = js.native
    def isJSX(node: Null, opts: js.Object): /* is babel-types.babel-types.JSX */ Boolean = js.native
    def isJSX(node: Unit, opts: js.Object): /* is babel-types.babel-types.JSX */ Boolean = js.native
    
    def isJSXAttribute(): /* is babel-types.babel-types.JSXAttribute */ Boolean = js.native
    def isJSXAttribute(node: js.Object): /* is babel-types.babel-types.JSXAttribute */ Boolean = js.native
    def isJSXAttribute(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXAttribute */ Boolean = js.native
    def isJSXAttribute(node: Null, opts: js.Object): /* is babel-types.babel-types.JSXAttribute */ Boolean = js.native
    def isJSXAttribute(node: Unit, opts: js.Object): /* is babel-types.babel-types.JSXAttribute */ Boolean = js.native
    
    def isJSXClosingElement(): /* is babel-types.babel-types.JSXClosingElement */ Boolean = js.native
    def isJSXClosingElement(node: js.Object): /* is babel-types.babel-types.JSXClosingElement */ Boolean = js.native
    def isJSXClosingElement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXClosingElement */ Boolean = js.native
    def isJSXClosingElement(node: Null, opts: js.Object): /* is babel-types.babel-types.JSXClosingElement */ Boolean = js.native
    def isJSXClosingElement(node: Unit, opts: js.Object): /* is babel-types.babel-types.JSXClosingElement */ Boolean = js.native
    
    def isJSXElement(): /* is babel-types.babel-types.JSXElement */ Boolean = js.native
    def isJSXElement(node: js.Object): /* is babel-types.babel-types.JSXElement */ Boolean = js.native
    def isJSXElement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXElement */ Boolean = js.native
    def isJSXElement(node: Null, opts: js.Object): /* is babel-types.babel-types.JSXElement */ Boolean = js.native
    def isJSXElement(node: Unit, opts: js.Object): /* is babel-types.babel-types.JSXElement */ Boolean = js.native
    
    def isJSXEmptyExpression(): /* is babel-types.babel-types.JSXEmptyExpression */ Boolean = js.native
    def isJSXEmptyExpression(node: js.Object): /* is babel-types.babel-types.JSXEmptyExpression */ Boolean = js.native
    def isJSXEmptyExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXEmptyExpression */ Boolean = js.native
    def isJSXEmptyExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.JSXEmptyExpression */ Boolean = js.native
    def isJSXEmptyExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.JSXEmptyExpression */ Boolean = js.native
    
    def isJSXExpressionContainer(): /* is babel-types.babel-types.JSXExpressionContainer */ Boolean = js.native
    def isJSXExpressionContainer(node: js.Object): /* is babel-types.babel-types.JSXExpressionContainer */ Boolean = js.native
    def isJSXExpressionContainer(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXExpressionContainer */ Boolean = js.native
    def isJSXExpressionContainer(node: Null, opts: js.Object): /* is babel-types.babel-types.JSXExpressionContainer */ Boolean = js.native
    def isJSXExpressionContainer(node: Unit, opts: js.Object): /* is babel-types.babel-types.JSXExpressionContainer */ Boolean = js.native
    
    def isJSXIdentifier(): /* is babel-types.babel-types.JSXIdentifier */ Boolean = js.native
    def isJSXIdentifier(node: js.Object): /* is babel-types.babel-types.JSXIdentifier */ Boolean = js.native
    def isJSXIdentifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXIdentifier */ Boolean = js.native
    def isJSXIdentifier(node: Null, opts: js.Object): /* is babel-types.babel-types.JSXIdentifier */ Boolean = js.native
    def isJSXIdentifier(node: Unit, opts: js.Object): /* is babel-types.babel-types.JSXIdentifier */ Boolean = js.native
    
    def isJSXMemberExpression(): /* is babel-types.babel-types.JSXMemberExpression */ Boolean = js.native
    def isJSXMemberExpression(node: js.Object): /* is babel-types.babel-types.JSXMemberExpression */ Boolean = js.native
    def isJSXMemberExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXMemberExpression */ Boolean = js.native
    def isJSXMemberExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.JSXMemberExpression */ Boolean = js.native
    def isJSXMemberExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.JSXMemberExpression */ Boolean = js.native
    
    def isJSXNamespacedName(): /* is babel-types.babel-types.JSXNamespacedName */ Boolean = js.native
    def isJSXNamespacedName(node: js.Object): /* is babel-types.babel-types.JSXNamespacedName */ Boolean = js.native
    def isJSXNamespacedName(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXNamespacedName */ Boolean = js.native
    def isJSXNamespacedName(node: Null, opts: js.Object): /* is babel-types.babel-types.JSXNamespacedName */ Boolean = js.native
    def isJSXNamespacedName(node: Unit, opts: js.Object): /* is babel-types.babel-types.JSXNamespacedName */ Boolean = js.native
    
    def isJSXOpeningElement(): /* is babel-types.babel-types.JSXOpeningElement */ Boolean = js.native
    def isJSXOpeningElement(node: js.Object): /* is babel-types.babel-types.JSXOpeningElement */ Boolean = js.native
    def isJSXOpeningElement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXOpeningElement */ Boolean = js.native
    def isJSXOpeningElement(node: Null, opts: js.Object): /* is babel-types.babel-types.JSXOpeningElement */ Boolean = js.native
    def isJSXOpeningElement(node: Unit, opts: js.Object): /* is babel-types.babel-types.JSXOpeningElement */ Boolean = js.native
    
    def isJSXSpreadAttribute(): /* is babel-types.babel-types.JSXSpreadAttribute */ Boolean = js.native
    def isJSXSpreadAttribute(node: js.Object): /* is babel-types.babel-types.JSXSpreadAttribute */ Boolean = js.native
    def isJSXSpreadAttribute(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXSpreadAttribute */ Boolean = js.native
    def isJSXSpreadAttribute(node: Null, opts: js.Object): /* is babel-types.babel-types.JSXSpreadAttribute */ Boolean = js.native
    def isJSXSpreadAttribute(node: Unit, opts: js.Object): /* is babel-types.babel-types.JSXSpreadAttribute */ Boolean = js.native
    
    def isJSXText(): /* is babel-types.babel-types.JSXText */ Boolean = js.native
    def isJSXText(node: js.Object): /* is babel-types.babel-types.JSXText */ Boolean = js.native
    def isJSXText(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXText */ Boolean = js.native
    def isJSXText(node: Null, opts: js.Object): /* is babel-types.babel-types.JSXText */ Boolean = js.native
    def isJSXText(node: Unit, opts: js.Object): /* is babel-types.babel-types.JSXText */ Boolean = js.native
    
    def isLVal(): /* is babel-types.babel-types.LVal */ Boolean = js.native
    def isLVal(node: js.Object): /* is babel-types.babel-types.LVal */ Boolean = js.native
    def isLVal(node: js.Object, opts: js.Object): /* is babel-types.babel-types.LVal */ Boolean = js.native
    def isLVal(node: Null, opts: js.Object): /* is babel-types.babel-types.LVal */ Boolean = js.native
    def isLVal(node: Unit, opts: js.Object): /* is babel-types.babel-types.LVal */ Boolean = js.native
    
    def isLabeledStatement(): /* is babel-types.babel-types.LabeledStatement */ Boolean = js.native
    def isLabeledStatement(node: js.Object): /* is babel-types.babel-types.LabeledStatement */ Boolean = js.native
    def isLabeledStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.LabeledStatement */ Boolean = js.native
    def isLabeledStatement(node: Null, opts: js.Object): /* is babel-types.babel-types.LabeledStatement */ Boolean = js.native
    def isLabeledStatement(node: Unit, opts: js.Object): /* is babel-types.babel-types.LabeledStatement */ Boolean = js.native
    
    def isLiteral(): /* is babel-types.babel-types.Literal */ Boolean = js.native
    def isLiteral(node: js.Object): /* is babel-types.babel-types.Literal */ Boolean = js.native
    def isLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Literal */ Boolean = js.native
    def isLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types.Literal */ Boolean = js.native
    def isLiteral(node: Unit, opts: js.Object): /* is babel-types.babel-types.Literal */ Boolean = js.native
    
    def isLogicalExpression(): /* is babel-types.babel-types.LogicalExpression */ Boolean = js.native
    def isLogicalExpression(node: js.Object): /* is babel-types.babel-types.LogicalExpression */ Boolean = js.native
    def isLogicalExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.LogicalExpression */ Boolean = js.native
    def isLogicalExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.LogicalExpression */ Boolean = js.native
    def isLogicalExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.LogicalExpression */ Boolean = js.native
    
    def isLoop(): /* is babel-types.babel-types.Loop */ Boolean = js.native
    def isLoop(node: js.Object): /* is babel-types.babel-types.Loop */ Boolean = js.native
    def isLoop(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Loop */ Boolean = js.native
    def isLoop(node: Null, opts: js.Object): /* is babel-types.babel-types.Loop */ Boolean = js.native
    def isLoop(node: Unit, opts: js.Object): /* is babel-types.babel-types.Loop */ Boolean = js.native
    
    def isMemberExpression(): /* is babel-types.babel-types.MemberExpression */ Boolean = js.native
    def isMemberExpression(node: js.Object): /* is babel-types.babel-types.MemberExpression */ Boolean = js.native
    def isMemberExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.MemberExpression */ Boolean = js.native
    def isMemberExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.MemberExpression */ Boolean = js.native
    def isMemberExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.MemberExpression */ Boolean = js.native
    
    def isMetaProperty(): /* is babel-types.babel-types.MetaProperty */ Boolean = js.native
    def isMetaProperty(node: js.Object): /* is babel-types.babel-types.MetaProperty */ Boolean = js.native
    def isMetaProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types.MetaProperty */ Boolean = js.native
    def isMetaProperty(node: Null, opts: js.Object): /* is babel-types.babel-types.MetaProperty */ Boolean = js.native
    def isMetaProperty(node: Unit, opts: js.Object): /* is babel-types.babel-types.MetaProperty */ Boolean = js.native
    
    def isMethod(): /* is babel-types.babel-types.Method */ Boolean = js.native
    def isMethod(node: js.Object): /* is babel-types.babel-types.Method */ Boolean = js.native
    def isMethod(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Method */ Boolean = js.native
    def isMethod(node: Null, opts: js.Object): /* is babel-types.babel-types.Method */ Boolean = js.native
    def isMethod(node: Unit, opts: js.Object): /* is babel-types.babel-types.Method */ Boolean = js.native
    
    def isMixedTypeAnnotation(): /* is babel-types.babel-types.MixedTypeAnnotation */ Boolean = js.native
    def isMixedTypeAnnotation(node: js.Object): /* is babel-types.babel-types.MixedTypeAnnotation */ Boolean = js.native
    def isMixedTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.MixedTypeAnnotation */ Boolean = js.native
    def isMixedTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.MixedTypeAnnotation */ Boolean = js.native
    def isMixedTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.MixedTypeAnnotation */ Boolean = js.native
    
    def isModuleDeclaration(): /* is babel-types.babel-types.ModuleDeclaration */ Boolean = js.native
    def isModuleDeclaration(node: js.Object): /* is babel-types.babel-types.ModuleDeclaration */ Boolean = js.native
    def isModuleDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ModuleDeclaration */ Boolean = js.native
    def isModuleDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.ModuleDeclaration */ Boolean = js.native
    def isModuleDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.ModuleDeclaration */ Boolean = js.native
    
    def isModuleSpecifier(): /* is babel-types.babel-types.ModuleSpecifier */ Boolean = js.native
    def isModuleSpecifier(node: js.Object): /* is babel-types.babel-types.ModuleSpecifier */ Boolean = js.native
    def isModuleSpecifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ModuleSpecifier */ Boolean = js.native
    def isModuleSpecifier(node: Null, opts: js.Object): /* is babel-types.babel-types.ModuleSpecifier */ Boolean = js.native
    def isModuleSpecifier(node: Unit, opts: js.Object): /* is babel-types.babel-types.ModuleSpecifier */ Boolean = js.native
    
    def isNewExpression(): /* is babel-types.babel-types.NewExpression */ Boolean = js.native
    def isNewExpression(node: js.Object): /* is babel-types.babel-types.NewExpression */ Boolean = js.native
    def isNewExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.NewExpression */ Boolean = js.native
    def isNewExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.NewExpression */ Boolean = js.native
    def isNewExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.NewExpression */ Boolean = js.native
    
    def isNoop(): /* is babel-types.babel-types.Noop */ Boolean = js.native
    def isNoop(node: js.Object): /* is babel-types.babel-types.Noop */ Boolean = js.native
    def isNoop(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Noop */ Boolean = js.native
    def isNoop(node: Null, opts: js.Object): /* is babel-types.babel-types.Noop */ Boolean = js.native
    def isNoop(node: Unit, opts: js.Object): /* is babel-types.babel-types.Noop */ Boolean = js.native
    
    def isNullLiteral(): /* is babel-types.babel-types.NullLiteral */ Boolean = js.native
    def isNullLiteral(node: js.Object): /* is babel-types.babel-types.NullLiteral */ Boolean = js.native
    def isNullLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.NullLiteral */ Boolean = js.native
    def isNullLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types.NullLiteral */ Boolean = js.native
    def isNullLiteral(node: Unit, opts: js.Object): /* is babel-types.babel-types.NullLiteral */ Boolean = js.native
    
    def isNullLiteralTypeAnnotation(): /* is babel-types.babel-types.NullLiteralTypeAnnotation */ Boolean = js.native
    def isNullLiteralTypeAnnotation(node: js.Object): /* is babel-types.babel-types.NullLiteralTypeAnnotation */ Boolean = js.native
    def isNullLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.NullLiteralTypeAnnotation */ Boolean = js.native
    def isNullLiteralTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.NullLiteralTypeAnnotation */ Boolean = js.native
    def isNullLiteralTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.NullLiteralTypeAnnotation */ Boolean = js.native
    
    def isNullableTypeAnnotation(): /* is babel-types.babel-types.NullableTypeAnnotation */ Boolean = js.native
    def isNullableTypeAnnotation(node: js.Object): /* is babel-types.babel-types.NullableTypeAnnotation */ Boolean = js.native
    def isNullableTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.NullableTypeAnnotation */ Boolean = js.native
    def isNullableTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.NullableTypeAnnotation */ Boolean = js.native
    def isNullableTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.NullableTypeAnnotation */ Boolean = js.native
    
    def isNumberLiteral(): /* is babel-types.babel-types.NumericLiteral */ Boolean = js.native
    def isNumberLiteral(node: js.Object): /* is babel-types.babel-types.NumericLiteral */ Boolean = js.native
    def isNumberLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.NumericLiteral */ Boolean = js.native
    def isNumberLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types.NumericLiteral */ Boolean = js.native
    def isNumberLiteral(node: Unit, opts: js.Object): /* is babel-types.babel-types.NumericLiteral */ Boolean = js.native
    
    def isNumberTypeAnnotation(): /* is babel-types.babel-types.NumberTypeAnnotation */ Boolean = js.native
    def isNumberTypeAnnotation(node: js.Object): /* is babel-types.babel-types.NumberTypeAnnotation */ Boolean = js.native
    def isNumberTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.NumberTypeAnnotation */ Boolean = js.native
    def isNumberTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.NumberTypeAnnotation */ Boolean = js.native
    def isNumberTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.NumberTypeAnnotation */ Boolean = js.native
    
    def isNumericLiteral(): /* is babel-types.babel-types.NumericLiteral */ Boolean = js.native
    def isNumericLiteral(node: js.Object): /* is babel-types.babel-types.NumericLiteral */ Boolean = js.native
    def isNumericLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.NumericLiteral */ Boolean = js.native
    def isNumericLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types.NumericLiteral */ Boolean = js.native
    def isNumericLiteral(node: Unit, opts: js.Object): /* is babel-types.babel-types.NumericLiteral */ Boolean = js.native
    
    def isNumericLiteralTypeAnnotation(): /* is babel-types.babel-types.NumericLiteralTypeAnnotation */ Boolean = js.native
    def isNumericLiteralTypeAnnotation(node: js.Object): /* is babel-types.babel-types.NumericLiteralTypeAnnotation */ Boolean = js.native
    def isNumericLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.NumericLiteralTypeAnnotation */ Boolean = js.native
    def isNumericLiteralTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.NumericLiteralTypeAnnotation */ Boolean = js.native
    def isNumericLiteralTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.NumericLiteralTypeAnnotation */ Boolean = js.native
    
    def isObjectExpression(): /* is babel-types.babel-types.ObjectExpression */ Boolean = js.native
    def isObjectExpression(node: js.Object): /* is babel-types.babel-types.ObjectExpression */ Boolean = js.native
    def isObjectExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ObjectExpression */ Boolean = js.native
    def isObjectExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.ObjectExpression */ Boolean = js.native
    def isObjectExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.ObjectExpression */ Boolean = js.native
    
    def isObjectMember(): /* is babel-types.babel-types.ObjectMember */ Boolean = js.native
    def isObjectMember(node: js.Object): /* is babel-types.babel-types.ObjectMember */ Boolean = js.native
    def isObjectMember(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ObjectMember */ Boolean = js.native
    def isObjectMember(node: Null, opts: js.Object): /* is babel-types.babel-types.ObjectMember */ Boolean = js.native
    def isObjectMember(node: Unit, opts: js.Object): /* is babel-types.babel-types.ObjectMember */ Boolean = js.native
    
    def isObjectMethod(): /* is babel-types.babel-types.ObjectMethod */ Boolean = js.native
    def isObjectMethod(node: js.Object): /* is babel-types.babel-types.ObjectMethod */ Boolean = js.native
    def isObjectMethod(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ObjectMethod */ Boolean = js.native
    def isObjectMethod(node: Null, opts: js.Object): /* is babel-types.babel-types.ObjectMethod */ Boolean = js.native
    def isObjectMethod(node: Unit, opts: js.Object): /* is babel-types.babel-types.ObjectMethod */ Boolean = js.native
    
    def isObjectPattern(): /* is babel-types.babel-types.ObjectPattern */ Boolean = js.native
    def isObjectPattern(node: js.Object): /* is babel-types.babel-types.ObjectPattern */ Boolean = js.native
    def isObjectPattern(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ObjectPattern */ Boolean = js.native
    def isObjectPattern(node: Null, opts: js.Object): /* is babel-types.babel-types.ObjectPattern */ Boolean = js.native
    def isObjectPattern(node: Unit, opts: js.Object): /* is babel-types.babel-types.ObjectPattern */ Boolean = js.native
    
    def isObjectProperty(): /* is babel-types.babel-types.ObjectProperty */ Boolean = js.native
    def isObjectProperty(node: js.Object): /* is babel-types.babel-types.ObjectProperty */ Boolean = js.native
    def isObjectProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ObjectProperty */ Boolean = js.native
    def isObjectProperty(node: Null, opts: js.Object): /* is babel-types.babel-types.ObjectProperty */ Boolean = js.native
    def isObjectProperty(node: Unit, opts: js.Object): /* is babel-types.babel-types.ObjectProperty */ Boolean = js.native
    
    def isObjectTypeAnnotation(): /* is babel-types.babel-types.ObjectTypeAnnotation */ Boolean = js.native
    def isObjectTypeAnnotation(node: js.Object): /* is babel-types.babel-types.ObjectTypeAnnotation */ Boolean = js.native
    def isObjectTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ObjectTypeAnnotation */ Boolean = js.native
    def isObjectTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.ObjectTypeAnnotation */ Boolean = js.native
    def isObjectTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.ObjectTypeAnnotation */ Boolean = js.native
    
    def isObjectTypeCallProperty(): /* is babel-types.babel-types.ObjectTypeCallProperty */ Boolean = js.native
    def isObjectTypeCallProperty(node: js.Object): /* is babel-types.babel-types.ObjectTypeCallProperty */ Boolean = js.native
    def isObjectTypeCallProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ObjectTypeCallProperty */ Boolean = js.native
    def isObjectTypeCallProperty(node: Null, opts: js.Object): /* is babel-types.babel-types.ObjectTypeCallProperty */ Boolean = js.native
    def isObjectTypeCallProperty(node: Unit, opts: js.Object): /* is babel-types.babel-types.ObjectTypeCallProperty */ Boolean = js.native
    
    def isObjectTypeIndexer(): /* is babel-types.babel-types.ObjectTypeIndexer */ Boolean = js.native
    def isObjectTypeIndexer(node: js.Object): /* is babel-types.babel-types.ObjectTypeIndexer */ Boolean = js.native
    def isObjectTypeIndexer(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ObjectTypeIndexer */ Boolean = js.native
    def isObjectTypeIndexer(node: Null, opts: js.Object): /* is babel-types.babel-types.ObjectTypeIndexer */ Boolean = js.native
    def isObjectTypeIndexer(node: Unit, opts: js.Object): /* is babel-types.babel-types.ObjectTypeIndexer */ Boolean = js.native
    
    def isObjectTypeProperty(): /* is babel-types.babel-types.ObjectTypeProperty */ Boolean = js.native
    def isObjectTypeProperty(node: js.Object): /* is babel-types.babel-types.ObjectTypeProperty */ Boolean = js.native
    def isObjectTypeProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ObjectTypeProperty */ Boolean = js.native
    def isObjectTypeProperty(node: Null, opts: js.Object): /* is babel-types.babel-types.ObjectTypeProperty */ Boolean = js.native
    def isObjectTypeProperty(node: Unit, opts: js.Object): /* is babel-types.babel-types.ObjectTypeProperty */ Boolean = js.native
    
    def isParenthesizedExpression(): /* is babel-types.babel-types.ParenthesizedExpression */ Boolean = js.native
    def isParenthesizedExpression(node: js.Object): /* is babel-types.babel-types.ParenthesizedExpression */ Boolean = js.native
    def isParenthesizedExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ParenthesizedExpression */ Boolean = js.native
    def isParenthesizedExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.ParenthesizedExpression */ Boolean = js.native
    def isParenthesizedExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.ParenthesizedExpression */ Boolean = js.native
    
    def isPattern(): /* is babel-types.babel-types.Pattern */ Boolean = js.native
    def isPattern(node: js.Object): /* is babel-types.babel-types.Pattern */ Boolean = js.native
    def isPattern(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Pattern */ Boolean = js.native
    def isPattern(node: Null, opts: js.Object): /* is babel-types.babel-types.Pattern */ Boolean = js.native
    def isPattern(node: Unit, opts: js.Object): /* is babel-types.babel-types.Pattern */ Boolean = js.native
    
    def isProgram(): /* is babel-types.babel-types.Program */ Boolean = js.native
    def isProgram(node: js.Object): /* is babel-types.babel-types.Program */ Boolean = js.native
    def isProgram(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Program */ Boolean = js.native
    def isProgram(node: Null, opts: js.Object): /* is babel-types.babel-types.Program */ Boolean = js.native
    def isProgram(node: Unit, opts: js.Object): /* is babel-types.babel-types.Program */ Boolean = js.native
    
    def isProperty(): /* is babel-types.babel-types.Property */ Boolean = js.native
    def isProperty(node: js.Object): /* is babel-types.babel-types.Property */ Boolean = js.native
    def isProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Property */ Boolean = js.native
    def isProperty(node: Null, opts: js.Object): /* is babel-types.babel-types.Property */ Boolean = js.native
    def isProperty(node: Unit, opts: js.Object): /* is babel-types.babel-types.Property */ Boolean = js.native
    
    def isPure(): Boolean = js.native
    def isPure(node: js.Object): Boolean = js.native
    def isPure(node: js.Object, opts: js.Object): Boolean = js.native
    def isPure(node: Null, opts: js.Object): Boolean = js.native
    def isPure(node: Unit, opts: js.Object): Boolean = js.native
    
    def isPureish(): /* is babel-types.babel-types.Pureish */ Boolean = js.native
    def isPureish(node: js.Object): /* is babel-types.babel-types.Pureish */ Boolean = js.native
    def isPureish(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Pureish */ Boolean = js.native
    def isPureish(node: Null, opts: js.Object): /* is babel-types.babel-types.Pureish */ Boolean = js.native
    def isPureish(node: Unit, opts: js.Object): /* is babel-types.babel-types.Pureish */ Boolean = js.native
    
    def isQualifiedTypeIdentifier(): /* is babel-types.babel-types.QualifiedTypeIdentifier */ Boolean = js.native
    def isQualifiedTypeIdentifier(node: js.Object): /* is babel-types.babel-types.QualifiedTypeIdentifier */ Boolean = js.native
    def isQualifiedTypeIdentifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.QualifiedTypeIdentifier */ Boolean = js.native
    def isQualifiedTypeIdentifier(node: Null, opts: js.Object): /* is babel-types.babel-types.QualifiedTypeIdentifier */ Boolean = js.native
    def isQualifiedTypeIdentifier(node: Unit, opts: js.Object): /* is babel-types.babel-types.QualifiedTypeIdentifier */ Boolean = js.native
    
    def isReferenced(): Boolean = js.native
    def isReferenced(node: js.Object): Boolean = js.native
    def isReferenced(node: js.Object, opts: js.Object): Boolean = js.native
    def isReferenced(node: Null, opts: js.Object): Boolean = js.native
    def isReferenced(node: Unit, opts: js.Object): Boolean = js.native
    
    def isReferencedIdentifier(): Boolean = js.native
    def isReferencedIdentifier(node: js.Object): Boolean = js.native
    def isReferencedIdentifier(node: js.Object, opts: js.Object): Boolean = js.native
    def isReferencedIdentifier(node: Null, opts: js.Object): Boolean = js.native
    def isReferencedIdentifier(node: Unit, opts: js.Object): Boolean = js.native
    
    def isReferencedMemberExpression(): /* is babel-types.babel-types.MemberExpression */ Boolean = js.native
    def isReferencedMemberExpression(node: js.Object): /* is babel-types.babel-types.MemberExpression */ Boolean = js.native
    def isReferencedMemberExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.MemberExpression */ Boolean = js.native
    def isReferencedMemberExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.MemberExpression */ Boolean = js.native
    def isReferencedMemberExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.MemberExpression */ Boolean = js.native
    
    def isRegExpLiteral(): /* is babel-types.babel-types.RegExpLiteral */ Boolean = js.native
    def isRegExpLiteral(node: js.Object): /* is babel-types.babel-types.RegExpLiteral */ Boolean = js.native
    def isRegExpLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.RegExpLiteral */ Boolean = js.native
    def isRegExpLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types.RegExpLiteral */ Boolean = js.native
    def isRegExpLiteral(node: Unit, opts: js.Object): /* is babel-types.babel-types.RegExpLiteral */ Boolean = js.native
    
    def isRegexLiteral(): /* is babel-types.babel-types.RegExpLiteral */ Boolean = js.native
    def isRegexLiteral(node: js.Object): /* is babel-types.babel-types.RegExpLiteral */ Boolean = js.native
    def isRegexLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.RegExpLiteral */ Boolean = js.native
    def isRegexLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types.RegExpLiteral */ Boolean = js.native
    def isRegexLiteral(node: Unit, opts: js.Object): /* is babel-types.babel-types.RegExpLiteral */ Boolean = js.native
    
    def isRestElement(): /* is babel-types.babel-types.RestElement */ Boolean = js.native
    def isRestElement(node: js.Object): /* is babel-types.babel-types.RestElement */ Boolean = js.native
    def isRestElement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.RestElement */ Boolean = js.native
    def isRestElement(node: Null, opts: js.Object): /* is babel-types.babel-types.RestElement */ Boolean = js.native
    def isRestElement(node: Unit, opts: js.Object): /* is babel-types.babel-types.RestElement */ Boolean = js.native
    
    def isRestProperty(): /* is babel-types.babel-types.RestProperty */ Boolean = js.native
    def isRestProperty(node: js.Object): /* is babel-types.babel-types.RestProperty */ Boolean = js.native
    def isRestProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types.RestProperty */ Boolean = js.native
    def isRestProperty(node: Null, opts: js.Object): /* is babel-types.babel-types.RestProperty */ Boolean = js.native
    def isRestProperty(node: Unit, opts: js.Object): /* is babel-types.babel-types.RestProperty */ Boolean = js.native
    
    def isReturnStatement(): /* is babel-types.babel-types.ReturnStatement */ Boolean = js.native
    def isReturnStatement(node: js.Object): /* is babel-types.babel-types.ReturnStatement */ Boolean = js.native
    def isReturnStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ReturnStatement */ Boolean = js.native
    def isReturnStatement(node: Null, opts: js.Object): /* is babel-types.babel-types.ReturnStatement */ Boolean = js.native
    def isReturnStatement(node: Unit, opts: js.Object): /* is babel-types.babel-types.ReturnStatement */ Boolean = js.native
    
    def isScopable(): /* is babel-types.babel-types.Scopable */ Boolean = js.native
    def isScopable(node: js.Object): /* is babel-types.babel-types.Scopable */ Boolean = js.native
    def isScopable(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Scopable */ Boolean = js.native
    def isScopable(node: Null, opts: js.Object): /* is babel-types.babel-types.Scopable */ Boolean = js.native
    def isScopable(node: Unit, opts: js.Object): /* is babel-types.babel-types.Scopable */ Boolean = js.native
    
    def isScope(): /* is babel-types.babel-types.Scopable */ Boolean = js.native
    def isScope(node: js.Object): /* is babel-types.babel-types.Scopable */ Boolean = js.native
    def isScope(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Scopable */ Boolean = js.native
    def isScope(node: Null, opts: js.Object): /* is babel-types.babel-types.Scopable */ Boolean = js.native
    def isScope(node: Unit, opts: js.Object): /* is babel-types.babel-types.Scopable */ Boolean = js.native
    
    def isSequenceExpression(): /* is babel-types.babel-types.SequenceExpression */ Boolean = js.native
    def isSequenceExpression(node: js.Object): /* is babel-types.babel-types.SequenceExpression */ Boolean = js.native
    def isSequenceExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.SequenceExpression */ Boolean = js.native
    def isSequenceExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.SequenceExpression */ Boolean = js.native
    def isSequenceExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.SequenceExpression */ Boolean = js.native
    
    def isSpreadElement(): /* is babel-types.babel-types.SpreadElement */ Boolean = js.native
    def isSpreadElement(node: js.Object): /* is babel-types.babel-types.SpreadElement */ Boolean = js.native
    def isSpreadElement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.SpreadElement */ Boolean = js.native
    def isSpreadElement(node: Null, opts: js.Object): /* is babel-types.babel-types.SpreadElement */ Boolean = js.native
    def isSpreadElement(node: Unit, opts: js.Object): /* is babel-types.babel-types.SpreadElement */ Boolean = js.native
    
    def isSpreadProperty(): /* is babel-types.babel-types.SpreadProperty */ Boolean = js.native
    def isSpreadProperty(node: js.Object): /* is babel-types.babel-types.SpreadProperty */ Boolean = js.native
    def isSpreadProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types.SpreadProperty */ Boolean = js.native
    def isSpreadProperty(node: Null, opts: js.Object): /* is babel-types.babel-types.SpreadProperty */ Boolean = js.native
    def isSpreadProperty(node: Unit, opts: js.Object): /* is babel-types.babel-types.SpreadProperty */ Boolean = js.native
    
    def isStatement(): /* is babel-types.babel-types.Statement */ Boolean = js.native
    def isStatement(node: js.Object): /* is babel-types.babel-types.Statement */ Boolean = js.native
    def isStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Statement */ Boolean = js.native
    def isStatement(node: Null, opts: js.Object): /* is babel-types.babel-types.Statement */ Boolean = js.native
    def isStatement(node: Unit, opts: js.Object): /* is babel-types.babel-types.Statement */ Boolean = js.native
    
    def isStringLiteral(): /* is babel-types.babel-types.StringLiteral */ Boolean = js.native
    def isStringLiteral(node: js.Object): /* is babel-types.babel-types.StringLiteral */ Boolean = js.native
    def isStringLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.StringLiteral */ Boolean = js.native
    def isStringLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types.StringLiteral */ Boolean = js.native
    def isStringLiteral(node: Unit, opts: js.Object): /* is babel-types.babel-types.StringLiteral */ Boolean = js.native
    
    def isStringLiteralTypeAnnotation(): /* is babel-types.babel-types.StringLiteralTypeAnnotation */ Boolean = js.native
    def isStringLiteralTypeAnnotation(node: js.Object): /* is babel-types.babel-types.StringLiteralTypeAnnotation */ Boolean = js.native
    def isStringLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.StringLiteralTypeAnnotation */ Boolean = js.native
    def isStringLiteralTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.StringLiteralTypeAnnotation */ Boolean = js.native
    def isStringLiteralTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.StringLiteralTypeAnnotation */ Boolean = js.native
    
    def isStringTypeAnnotation(): /* is babel-types.babel-types.StringTypeAnnotation */ Boolean = js.native
    def isStringTypeAnnotation(node: js.Object): /* is babel-types.babel-types.StringTypeAnnotation */ Boolean = js.native
    def isStringTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.StringTypeAnnotation */ Boolean = js.native
    def isStringTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.StringTypeAnnotation */ Boolean = js.native
    def isStringTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.StringTypeAnnotation */ Boolean = js.native
    
    def isSuper(): /* is babel-types.babel-types.Super */ Boolean = js.native
    def isSuper(node: js.Object): /* is babel-types.babel-types.Super */ Boolean = js.native
    def isSuper(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Super */ Boolean = js.native
    def isSuper(node: Null, opts: js.Object): /* is babel-types.babel-types.Super */ Boolean = js.native
    def isSuper(node: Unit, opts: js.Object): /* is babel-types.babel-types.Super */ Boolean = js.native
    
    def isSwitchCase(): /* is babel-types.babel-types.SwitchCase */ Boolean = js.native
    def isSwitchCase(node: js.Object): /* is babel-types.babel-types.SwitchCase */ Boolean = js.native
    def isSwitchCase(node: js.Object, opts: js.Object): /* is babel-types.babel-types.SwitchCase */ Boolean = js.native
    def isSwitchCase(node: Null, opts: js.Object): /* is babel-types.babel-types.SwitchCase */ Boolean = js.native
    def isSwitchCase(node: Unit, opts: js.Object): /* is babel-types.babel-types.SwitchCase */ Boolean = js.native
    
    def isSwitchStatement(): /* is babel-types.babel-types.SwitchStatement */ Boolean = js.native
    def isSwitchStatement(node: js.Object): /* is babel-types.babel-types.SwitchStatement */ Boolean = js.native
    def isSwitchStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.SwitchStatement */ Boolean = js.native
    def isSwitchStatement(node: Null, opts: js.Object): /* is babel-types.babel-types.SwitchStatement */ Boolean = js.native
    def isSwitchStatement(node: Unit, opts: js.Object): /* is babel-types.babel-types.SwitchStatement */ Boolean = js.native
    
    def isTSAnyKeyword(): /* is babel-types.babel-types.TSAnyKeyword */ Boolean = js.native
    def isTSAnyKeyword(node: js.Object): /* is babel-types.babel-types.TSAnyKeyword */ Boolean = js.native
    def isTSAnyKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSAnyKeyword */ Boolean = js.native
    def isTSAnyKeyword(node: Null, opts: js.Object): /* is babel-types.babel-types.TSAnyKeyword */ Boolean = js.native
    def isTSAnyKeyword(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSAnyKeyword */ Boolean = js.native
    
    def isTSArrayType(): /* is babel-types.babel-types.TSArrayType */ Boolean = js.native
    def isTSArrayType(node: js.Object): /* is babel-types.babel-types.TSArrayType */ Boolean = js.native
    def isTSArrayType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSArrayType */ Boolean = js.native
    def isTSArrayType(node: Null, opts: js.Object): /* is babel-types.babel-types.TSArrayType */ Boolean = js.native
    def isTSArrayType(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSArrayType */ Boolean = js.native
    
    def isTSAsExpression(): /* is babel-types.babel-types.TSAsExpression */ Boolean = js.native
    def isTSAsExpression(node: js.Object): /* is babel-types.babel-types.TSAsExpression */ Boolean = js.native
    def isTSAsExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSAsExpression */ Boolean = js.native
    def isTSAsExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.TSAsExpression */ Boolean = js.native
    def isTSAsExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSAsExpression */ Boolean = js.native
    
    def isTSBooleanKeyword(): /* is babel-types.babel-types.TSBooleanKeyword */ Boolean = js.native
    def isTSBooleanKeyword(node: js.Object): /* is babel-types.babel-types.TSBooleanKeyword */ Boolean = js.native
    def isTSBooleanKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSBooleanKeyword */ Boolean = js.native
    def isTSBooleanKeyword(node: Null, opts: js.Object): /* is babel-types.babel-types.TSBooleanKeyword */ Boolean = js.native
    def isTSBooleanKeyword(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSBooleanKeyword */ Boolean = js.native
    
    def isTSCallSignatureDeclaration(): /* is babel-types.babel-types.TSCallSignatureDeclaration */ Boolean = js.native
    def isTSCallSignatureDeclaration(node: js.Object): /* is babel-types.babel-types.TSCallSignatureDeclaration */ Boolean = js.native
    def isTSCallSignatureDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSCallSignatureDeclaration */ Boolean = js.native
    def isTSCallSignatureDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.TSCallSignatureDeclaration */ Boolean = js.native
    def isTSCallSignatureDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSCallSignatureDeclaration */ Boolean = js.native
    
    def isTSConstructSignatureDeclaration(): /* is babel-types.babel-types.TSTypeElement */ Boolean = js.native
    def isTSConstructSignatureDeclaration(node: js.Object): /* is babel-types.babel-types.TSTypeElement */ Boolean = js.native
    def isTSConstructSignatureDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeElement */ Boolean = js.native
    def isTSConstructSignatureDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.TSTypeElement */ Boolean = js.native
    def isTSConstructSignatureDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSTypeElement */ Boolean = js.native
    
    def isTSConstructorType(): /* is babel-types.babel-types.TSConstructorType */ Boolean = js.native
    def isTSConstructorType(node: js.Object): /* is babel-types.babel-types.TSConstructorType */ Boolean = js.native
    def isTSConstructorType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSConstructorType */ Boolean = js.native
    def isTSConstructorType(node: Null, opts: js.Object): /* is babel-types.babel-types.TSConstructorType */ Boolean = js.native
    def isTSConstructorType(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSConstructorType */ Boolean = js.native
    
    def isTSDeclareFunction(): /* is babel-types.babel-types.TSDeclareFunction */ Boolean = js.native
    def isTSDeclareFunction(node: js.Object): /* is babel-types.babel-types.TSDeclareFunction */ Boolean = js.native
    def isTSDeclareFunction(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSDeclareFunction */ Boolean = js.native
    def isTSDeclareFunction(node: Null, opts: js.Object): /* is babel-types.babel-types.TSDeclareFunction */ Boolean = js.native
    def isTSDeclareFunction(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSDeclareFunction */ Boolean = js.native
    
    def isTSDeclareMethod(): /* is babel-types.babel-types.TSDeclareMethod */ Boolean = js.native
    def isTSDeclareMethod(node: js.Object): /* is babel-types.babel-types.TSDeclareMethod */ Boolean = js.native
    def isTSDeclareMethod(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSDeclareMethod */ Boolean = js.native
    def isTSDeclareMethod(node: Null, opts: js.Object): /* is babel-types.babel-types.TSDeclareMethod */ Boolean = js.native
    def isTSDeclareMethod(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSDeclareMethod */ Boolean = js.native
    
    def isTSEnumDeclaration(): /* is babel-types.babel-types.TSEnumDeclaration */ Boolean = js.native
    def isTSEnumDeclaration(node: js.Object): /* is babel-types.babel-types.TSEnumDeclaration */ Boolean = js.native
    def isTSEnumDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSEnumDeclaration */ Boolean = js.native
    def isTSEnumDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.TSEnumDeclaration */ Boolean = js.native
    def isTSEnumDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSEnumDeclaration */ Boolean = js.native
    
    def isTSEnumMember(): /* is babel-types.babel-types.TSEnumMember */ Boolean = js.native
    def isTSEnumMember(node: js.Object): /* is babel-types.babel-types.TSEnumMember */ Boolean = js.native
    def isTSEnumMember(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSEnumMember */ Boolean = js.native
    def isTSEnumMember(node: Null, opts: js.Object): /* is babel-types.babel-types.TSEnumMember */ Boolean = js.native
    def isTSEnumMember(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSEnumMember */ Boolean = js.native
    
    def isTSExportAssignment(): /* is babel-types.babel-types.TSExportAssignment */ Boolean = js.native
    def isTSExportAssignment(node: js.Object): /* is babel-types.babel-types.TSExportAssignment */ Boolean = js.native
    def isTSExportAssignment(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSExportAssignment */ Boolean = js.native
    def isTSExportAssignment(node: Null, opts: js.Object): /* is babel-types.babel-types.TSExportAssignment */ Boolean = js.native
    def isTSExportAssignment(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSExportAssignment */ Boolean = js.native
    
    def isTSExpressionWithTypeArguments(): /* is babel-types.babel-types.TSExpressionWithTypeArguments */ Boolean = js.native
    def isTSExpressionWithTypeArguments(node: js.Object): /* is babel-types.babel-types.TSExpressionWithTypeArguments */ Boolean = js.native
    def isTSExpressionWithTypeArguments(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSExpressionWithTypeArguments */ Boolean = js.native
    def isTSExpressionWithTypeArguments(node: Null, opts: js.Object): /* is babel-types.babel-types.TSExpressionWithTypeArguments */ Boolean = js.native
    def isTSExpressionWithTypeArguments(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSExpressionWithTypeArguments */ Boolean = js.native
    
    def isTSExternalModuleReference(): /* is babel-types.babel-types.TSExternalModuleReference */ Boolean = js.native
    def isTSExternalModuleReference(node: js.Object): /* is babel-types.babel-types.TSExternalModuleReference */ Boolean = js.native
    def isTSExternalModuleReference(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSExternalModuleReference */ Boolean = js.native
    def isTSExternalModuleReference(node: Null, opts: js.Object): /* is babel-types.babel-types.TSExternalModuleReference */ Boolean = js.native
    def isTSExternalModuleReference(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSExternalModuleReference */ Boolean = js.native
    
    def isTSFunctionType(): /* is babel-types.babel-types.TSFunctionType */ Boolean = js.native
    def isTSFunctionType(node: js.Object): /* is babel-types.babel-types.TSFunctionType */ Boolean = js.native
    def isTSFunctionType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSFunctionType */ Boolean = js.native
    def isTSFunctionType(node: Null, opts: js.Object): /* is babel-types.babel-types.TSFunctionType */ Boolean = js.native
    def isTSFunctionType(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSFunctionType */ Boolean = js.native
    
    def isTSImportEqualsDeclaration(): /* is babel-types.babel-types.TSImportEqualsDeclaration */ Boolean = js.native
    def isTSImportEqualsDeclaration(node: js.Object): /* is babel-types.babel-types.TSImportEqualsDeclaration */ Boolean = js.native
    def isTSImportEqualsDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSImportEqualsDeclaration */ Boolean = js.native
    def isTSImportEqualsDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.TSImportEqualsDeclaration */ Boolean = js.native
    def isTSImportEqualsDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSImportEqualsDeclaration */ Boolean = js.native
    
    def isTSIndexSignature(): /* is babel-types.babel-types.TSIndexSignature */ Boolean = js.native
    def isTSIndexSignature(node: js.Object): /* is babel-types.babel-types.TSIndexSignature */ Boolean = js.native
    def isTSIndexSignature(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSIndexSignature */ Boolean = js.native
    def isTSIndexSignature(node: Null, opts: js.Object): /* is babel-types.babel-types.TSIndexSignature */ Boolean = js.native
    def isTSIndexSignature(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSIndexSignature */ Boolean = js.native
    
    def isTSIndexedAccessType(): /* is babel-types.babel-types.TSIndexedAccessType */ Boolean = js.native
    def isTSIndexedAccessType(node: js.Object): /* is babel-types.babel-types.TSIndexedAccessType */ Boolean = js.native
    def isTSIndexedAccessType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSIndexedAccessType */ Boolean = js.native
    def isTSIndexedAccessType(node: Null, opts: js.Object): /* is babel-types.babel-types.TSIndexedAccessType */ Boolean = js.native
    def isTSIndexedAccessType(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSIndexedAccessType */ Boolean = js.native
    
    def isTSInterfaceBody(): /* is babel-types.babel-types.TSInterfaceBody */ Boolean = js.native
    def isTSInterfaceBody(node: js.Object): /* is babel-types.babel-types.TSInterfaceBody */ Boolean = js.native
    def isTSInterfaceBody(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSInterfaceBody */ Boolean = js.native
    def isTSInterfaceBody(node: Null, opts: js.Object): /* is babel-types.babel-types.TSInterfaceBody */ Boolean = js.native
    def isTSInterfaceBody(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSInterfaceBody */ Boolean = js.native
    
    def isTSInterfaceDeclaration(): /* is babel-types.babel-types.TSInterfaceDeclaration */ Boolean = js.native
    def isTSInterfaceDeclaration(node: js.Object): /* is babel-types.babel-types.TSInterfaceDeclaration */ Boolean = js.native
    def isTSInterfaceDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSInterfaceDeclaration */ Boolean = js.native
    def isTSInterfaceDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.TSInterfaceDeclaration */ Boolean = js.native
    def isTSInterfaceDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSInterfaceDeclaration */ Boolean = js.native
    
    def isTSIntersectionType(): /* is babel-types.babel-types.TSIntersectionType */ Boolean = js.native
    def isTSIntersectionType(node: js.Object): /* is babel-types.babel-types.TSIntersectionType */ Boolean = js.native
    def isTSIntersectionType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSIntersectionType */ Boolean = js.native
    def isTSIntersectionType(node: Null, opts: js.Object): /* is babel-types.babel-types.TSIntersectionType */ Boolean = js.native
    def isTSIntersectionType(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSIntersectionType */ Boolean = js.native
    
    def isTSLiteralType(): /* is babel-types.babel-types.TSLiteralType */ Boolean = js.native
    def isTSLiteralType(node: js.Object): /* is babel-types.babel-types.TSLiteralType */ Boolean = js.native
    def isTSLiteralType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSLiteralType */ Boolean = js.native
    def isTSLiteralType(node: Null, opts: js.Object): /* is babel-types.babel-types.TSLiteralType */ Boolean = js.native
    def isTSLiteralType(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSLiteralType */ Boolean = js.native
    
    def isTSMappedType(): /* is babel-types.babel-types.TSMappedType */ Boolean = js.native
    def isTSMappedType(node: js.Object): /* is babel-types.babel-types.TSMappedType */ Boolean = js.native
    def isTSMappedType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSMappedType */ Boolean = js.native
    def isTSMappedType(node: Null, opts: js.Object): /* is babel-types.babel-types.TSMappedType */ Boolean = js.native
    def isTSMappedType(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSMappedType */ Boolean = js.native
    
    def isTSMethodSignature(): /* is babel-types.babel-types.TSMethodSignature */ Boolean = js.native
    def isTSMethodSignature(node: js.Object): /* is babel-types.babel-types.TSMethodSignature */ Boolean = js.native
    def isTSMethodSignature(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSMethodSignature */ Boolean = js.native
    def isTSMethodSignature(node: Null, opts: js.Object): /* is babel-types.babel-types.TSMethodSignature */ Boolean = js.native
    def isTSMethodSignature(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSMethodSignature */ Boolean = js.native
    
    def isTSModuleBlock(): /* is babel-types.babel-types.TSModuleBlock */ Boolean = js.native
    def isTSModuleBlock(node: js.Object): /* is babel-types.babel-types.TSModuleBlock */ Boolean = js.native
    def isTSModuleBlock(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSModuleBlock */ Boolean = js.native
    def isTSModuleBlock(node: Null, opts: js.Object): /* is babel-types.babel-types.TSModuleBlock */ Boolean = js.native
    def isTSModuleBlock(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSModuleBlock */ Boolean = js.native
    
    def isTSModuleDeclaration(): /* is babel-types.babel-types.TSModuleDeclaration */ Boolean = js.native
    def isTSModuleDeclaration(node: js.Object): /* is babel-types.babel-types.TSModuleDeclaration */ Boolean = js.native
    def isTSModuleDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSModuleDeclaration */ Boolean = js.native
    def isTSModuleDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.TSModuleDeclaration */ Boolean = js.native
    def isTSModuleDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSModuleDeclaration */ Boolean = js.native
    
    def isTSNamespaceExportDeclaration(): /* is babel-types.babel-types.TSNamespaceExportDeclaration */ Boolean = js.native
    def isTSNamespaceExportDeclaration(node: js.Object): /* is babel-types.babel-types.TSNamespaceExportDeclaration */ Boolean = js.native
    def isTSNamespaceExportDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSNamespaceExportDeclaration */ Boolean = js.native
    def isTSNamespaceExportDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.TSNamespaceExportDeclaration */ Boolean = js.native
    def isTSNamespaceExportDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSNamespaceExportDeclaration */ Boolean = js.native
    
    def isTSNeverKeyword(): /* is babel-types.babel-types.TSNeverKeyword */ Boolean = js.native
    def isTSNeverKeyword(node: js.Object): /* is babel-types.babel-types.TSNeverKeyword */ Boolean = js.native
    def isTSNeverKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSNeverKeyword */ Boolean = js.native
    def isTSNeverKeyword(node: Null, opts: js.Object): /* is babel-types.babel-types.TSNeverKeyword */ Boolean = js.native
    def isTSNeverKeyword(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSNeverKeyword */ Boolean = js.native
    
    def isTSNonNullExpression(): /* is babel-types.babel-types.TSNonNullExpression */ Boolean = js.native
    def isTSNonNullExpression(node: js.Object): /* is babel-types.babel-types.TSNonNullExpression */ Boolean = js.native
    def isTSNonNullExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSNonNullExpression */ Boolean = js.native
    def isTSNonNullExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.TSNonNullExpression */ Boolean = js.native
    def isTSNonNullExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSNonNullExpression */ Boolean = js.native
    
    def isTSNullKeyword(): /* is babel-types.babel-types.TSNullKeyword */ Boolean = js.native
    def isTSNullKeyword(node: js.Object): /* is babel-types.babel-types.TSNullKeyword */ Boolean = js.native
    def isTSNullKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSNullKeyword */ Boolean = js.native
    def isTSNullKeyword(node: Null, opts: js.Object): /* is babel-types.babel-types.TSNullKeyword */ Boolean = js.native
    def isTSNullKeyword(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSNullKeyword */ Boolean = js.native
    
    def isTSNumberKeyword(): /* is babel-types.babel-types.TSNumberKeyword */ Boolean = js.native
    def isTSNumberKeyword(node: js.Object): /* is babel-types.babel-types.TSNumberKeyword */ Boolean = js.native
    def isTSNumberKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSNumberKeyword */ Boolean = js.native
    def isTSNumberKeyword(node: Null, opts: js.Object): /* is babel-types.babel-types.TSNumberKeyword */ Boolean = js.native
    def isTSNumberKeyword(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSNumberKeyword */ Boolean = js.native
    
    def isTSObjectKeyword(): /* is babel-types.babel-types.TSObjectKeyword */ Boolean = js.native
    def isTSObjectKeyword(node: js.Object): /* is babel-types.babel-types.TSObjectKeyword */ Boolean = js.native
    def isTSObjectKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSObjectKeyword */ Boolean = js.native
    def isTSObjectKeyword(node: Null, opts: js.Object): /* is babel-types.babel-types.TSObjectKeyword */ Boolean = js.native
    def isTSObjectKeyword(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSObjectKeyword */ Boolean = js.native
    
    def isTSParameterProperty(): /* is babel-types.babel-types.TSParameterProperty */ Boolean = js.native
    def isTSParameterProperty(node: js.Object): /* is babel-types.babel-types.TSParameterProperty */ Boolean = js.native
    def isTSParameterProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSParameterProperty */ Boolean = js.native
    def isTSParameterProperty(node: Null, opts: js.Object): /* is babel-types.babel-types.TSParameterProperty */ Boolean = js.native
    def isTSParameterProperty(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSParameterProperty */ Boolean = js.native
    
    def isTSParenthesizedType(): /* is babel-types.babel-types.TSParenthesizedType */ Boolean = js.native
    def isTSParenthesizedType(node: js.Object): /* is babel-types.babel-types.TSParenthesizedType */ Boolean = js.native
    def isTSParenthesizedType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSParenthesizedType */ Boolean = js.native
    def isTSParenthesizedType(node: Null, opts: js.Object): /* is babel-types.babel-types.TSParenthesizedType */ Boolean = js.native
    def isTSParenthesizedType(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSParenthesizedType */ Boolean = js.native
    
    def isTSPropertySignature(): /* is babel-types.babel-types.TSPropertySignature */ Boolean = js.native
    def isTSPropertySignature(node: js.Object): /* is babel-types.babel-types.TSPropertySignature */ Boolean = js.native
    def isTSPropertySignature(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSPropertySignature */ Boolean = js.native
    def isTSPropertySignature(node: Null, opts: js.Object): /* is babel-types.babel-types.TSPropertySignature */ Boolean = js.native
    def isTSPropertySignature(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSPropertySignature */ Boolean = js.native
    
    def isTSQualifiedName(): /* is babel-types.babel-types.TSQualifiedName */ Boolean = js.native
    def isTSQualifiedName(node: js.Object): /* is babel-types.babel-types.TSQualifiedName */ Boolean = js.native
    def isTSQualifiedName(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSQualifiedName */ Boolean = js.native
    def isTSQualifiedName(node: Null, opts: js.Object): /* is babel-types.babel-types.TSQualifiedName */ Boolean = js.native
    def isTSQualifiedName(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSQualifiedName */ Boolean = js.native
    
    def isTSStringKeyword(): /* is babel-types.babel-types.TSStringKeyword */ Boolean = js.native
    def isTSStringKeyword(node: js.Object): /* is babel-types.babel-types.TSStringKeyword */ Boolean = js.native
    def isTSStringKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSStringKeyword */ Boolean = js.native
    def isTSStringKeyword(node: Null, opts: js.Object): /* is babel-types.babel-types.TSStringKeyword */ Boolean = js.native
    def isTSStringKeyword(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSStringKeyword */ Boolean = js.native
    
    def isTSSymbolKeyword(): /* is babel-types.babel-types.TSSymbolKeyword */ Boolean = js.native
    def isTSSymbolKeyword(node: js.Object): /* is babel-types.babel-types.TSSymbolKeyword */ Boolean = js.native
    def isTSSymbolKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSSymbolKeyword */ Boolean = js.native
    def isTSSymbolKeyword(node: Null, opts: js.Object): /* is babel-types.babel-types.TSSymbolKeyword */ Boolean = js.native
    def isTSSymbolKeyword(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSSymbolKeyword */ Boolean = js.native
    
    def isTSThisType(): /* is babel-types.babel-types.TSThisType */ Boolean = js.native
    def isTSThisType(node: js.Object): /* is babel-types.babel-types.TSThisType */ Boolean = js.native
    def isTSThisType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSThisType */ Boolean = js.native
    def isTSThisType(node: Null, opts: js.Object): /* is babel-types.babel-types.TSThisType */ Boolean = js.native
    def isTSThisType(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSThisType */ Boolean = js.native
    
    def isTSTupleType(): /* is babel-types.babel-types.TSTupleType */ Boolean = js.native
    def isTSTupleType(node: js.Object): /* is babel-types.babel-types.TSTupleType */ Boolean = js.native
    def isTSTupleType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTupleType */ Boolean = js.native
    def isTSTupleType(node: Null, opts: js.Object): /* is babel-types.babel-types.TSTupleType */ Boolean = js.native
    def isTSTupleType(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSTupleType */ Boolean = js.native
    
    def isTSTypeAliasDeclaration(): /* is babel-types.babel-types.TSTypeAliasDeclaration */ Boolean = js.native
    def isTSTypeAliasDeclaration(node: js.Object): /* is babel-types.babel-types.TSTypeAliasDeclaration */ Boolean = js.native
    def isTSTypeAliasDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeAliasDeclaration */ Boolean = js.native
    def isTSTypeAliasDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.TSTypeAliasDeclaration */ Boolean = js.native
    def isTSTypeAliasDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSTypeAliasDeclaration */ Boolean = js.native
    
    def isTSTypeAnnotation(): /* is babel-types.babel-types.TSTypeAnnotation */ Boolean = js.native
    def isTSTypeAnnotation(node: js.Object): /* is babel-types.babel-types.TSTypeAnnotation */ Boolean = js.native
    def isTSTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeAnnotation */ Boolean = js.native
    def isTSTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.TSTypeAnnotation */ Boolean = js.native
    def isTSTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSTypeAnnotation */ Boolean = js.native
    
    def isTSTypeAssertion(): /* is babel-types.babel-types.TSTypeAssertion */ Boolean = js.native
    def isTSTypeAssertion(node: js.Object): /* is babel-types.babel-types.TSTypeAssertion */ Boolean = js.native
    def isTSTypeAssertion(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeAssertion */ Boolean = js.native
    def isTSTypeAssertion(node: Null, opts: js.Object): /* is babel-types.babel-types.TSTypeAssertion */ Boolean = js.native
    def isTSTypeAssertion(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSTypeAssertion */ Boolean = js.native
    
    def isTSTypeLiteral(): /* is babel-types.babel-types.TSTypeLiteral */ Boolean = js.native
    def isTSTypeLiteral(node: js.Object): /* is babel-types.babel-types.TSTypeLiteral */ Boolean = js.native
    def isTSTypeLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeLiteral */ Boolean = js.native
    def isTSTypeLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types.TSTypeLiteral */ Boolean = js.native
    def isTSTypeLiteral(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSTypeLiteral */ Boolean = js.native
    
    def isTSTypeOperator(): /* is babel-types.babel-types.TSTypeOperator */ Boolean = js.native
    def isTSTypeOperator(node: js.Object): /* is babel-types.babel-types.TSTypeOperator */ Boolean = js.native
    def isTSTypeOperator(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeOperator */ Boolean = js.native
    def isTSTypeOperator(node: Null, opts: js.Object): /* is babel-types.babel-types.TSTypeOperator */ Boolean = js.native
    def isTSTypeOperator(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSTypeOperator */ Boolean = js.native
    
    def isTSTypeParameter(): /* is babel-types.babel-types.TSTypeParameter */ Boolean = js.native
    def isTSTypeParameter(node: js.Object): /* is babel-types.babel-types.TSTypeParameter */ Boolean = js.native
    def isTSTypeParameter(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeParameter */ Boolean = js.native
    def isTSTypeParameter(node: Null, opts: js.Object): /* is babel-types.babel-types.TSTypeParameter */ Boolean = js.native
    def isTSTypeParameter(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSTypeParameter */ Boolean = js.native
    
    def isTSTypeParameterDeclaration(): /* is babel-types.babel-types.TSTypeParameterDeclaration */ Boolean = js.native
    def isTSTypeParameterDeclaration(node: js.Object): /* is babel-types.babel-types.TSTypeParameterDeclaration */ Boolean = js.native
    def isTSTypeParameterDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeParameterDeclaration */ Boolean = js.native
    def isTSTypeParameterDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.TSTypeParameterDeclaration */ Boolean = js.native
    def isTSTypeParameterDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSTypeParameterDeclaration */ Boolean = js.native
    
    def isTSTypeParameterInstantiation(): /* is babel-types.babel-types.TSTypeParameterInstantiation */ Boolean = js.native
    def isTSTypeParameterInstantiation(node: js.Object): /* is babel-types.babel-types.TSTypeParameterInstantiation */ Boolean = js.native
    def isTSTypeParameterInstantiation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeParameterInstantiation */ Boolean = js.native
    def isTSTypeParameterInstantiation(node: Null, opts: js.Object): /* is babel-types.babel-types.TSTypeParameterInstantiation */ Boolean = js.native
    def isTSTypeParameterInstantiation(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSTypeParameterInstantiation */ Boolean = js.native
    
    def isTSTypePredicate(): /* is babel-types.babel-types.TSTypePredicate */ Boolean = js.native
    def isTSTypePredicate(node: js.Object): /* is babel-types.babel-types.TSTypePredicate */ Boolean = js.native
    def isTSTypePredicate(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypePredicate */ Boolean = js.native
    def isTSTypePredicate(node: Null, opts: js.Object): /* is babel-types.babel-types.TSTypePredicate */ Boolean = js.native
    def isTSTypePredicate(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSTypePredicate */ Boolean = js.native
    
    def isTSTypeQuery(): /* is babel-types.babel-types.TSTypeQuery */ Boolean = js.native
    def isTSTypeQuery(node: js.Object): /* is babel-types.babel-types.TSTypeQuery */ Boolean = js.native
    def isTSTypeQuery(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeQuery */ Boolean = js.native
    def isTSTypeQuery(node: Null, opts: js.Object): /* is babel-types.babel-types.TSTypeQuery */ Boolean = js.native
    def isTSTypeQuery(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSTypeQuery */ Boolean = js.native
    
    def isTSTypeReference(): /* is babel-types.babel-types.TSTypeReference */ Boolean = js.native
    def isTSTypeReference(node: js.Object): /* is babel-types.babel-types.TSTypeReference */ Boolean = js.native
    def isTSTypeReference(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeReference */ Boolean = js.native
    def isTSTypeReference(node: Null, opts: js.Object): /* is babel-types.babel-types.TSTypeReference */ Boolean = js.native
    def isTSTypeReference(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSTypeReference */ Boolean = js.native
    
    def isTSUndefinedKeyword(): /* is babel-types.babel-types.TSUndefinedKeyword */ Boolean = js.native
    def isTSUndefinedKeyword(node: js.Object): /* is babel-types.babel-types.TSUndefinedKeyword */ Boolean = js.native
    def isTSUndefinedKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSUndefinedKeyword */ Boolean = js.native
    def isTSUndefinedKeyword(node: Null, opts: js.Object): /* is babel-types.babel-types.TSUndefinedKeyword */ Boolean = js.native
    def isTSUndefinedKeyword(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSUndefinedKeyword */ Boolean = js.native
    
    def isTSUnionType(): /* is babel-types.babel-types.TSUnionType */ Boolean = js.native
    def isTSUnionType(node: js.Object): /* is babel-types.babel-types.TSUnionType */ Boolean = js.native
    def isTSUnionType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSUnionType */ Boolean = js.native
    def isTSUnionType(node: Null, opts: js.Object): /* is babel-types.babel-types.TSUnionType */ Boolean = js.native
    def isTSUnionType(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSUnionType */ Boolean = js.native
    
    def isTSVoidKeyword(): /* is babel-types.babel-types.TSVoidKeyword */ Boolean = js.native
    def isTSVoidKeyword(node: js.Object): /* is babel-types.babel-types.TSVoidKeyword */ Boolean = js.native
    def isTSVoidKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSVoidKeyword */ Boolean = js.native
    def isTSVoidKeyword(node: Null, opts: js.Object): /* is babel-types.babel-types.TSVoidKeyword */ Boolean = js.native
    def isTSVoidKeyword(node: Unit, opts: js.Object): /* is babel-types.babel-types.TSVoidKeyword */ Boolean = js.native
    
    def isTaggedTemplateExpression(): /* is babel-types.babel-types.TaggedTemplateExpression */ Boolean = js.native
    def isTaggedTemplateExpression(node: js.Object): /* is babel-types.babel-types.TaggedTemplateExpression */ Boolean = js.native
    def isTaggedTemplateExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TaggedTemplateExpression */ Boolean = js.native
    def isTaggedTemplateExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.TaggedTemplateExpression */ Boolean = js.native
    def isTaggedTemplateExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.TaggedTemplateExpression */ Boolean = js.native
    
    def isTemplateElement(): /* is babel-types.babel-types.TemplateElement */ Boolean = js.native
    def isTemplateElement(node: js.Object): /* is babel-types.babel-types.TemplateElement */ Boolean = js.native
    def isTemplateElement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TemplateElement */ Boolean = js.native
    def isTemplateElement(node: Null, opts: js.Object): /* is babel-types.babel-types.TemplateElement */ Boolean = js.native
    def isTemplateElement(node: Unit, opts: js.Object): /* is babel-types.babel-types.TemplateElement */ Boolean = js.native
    
    def isTemplateLiteral(): /* is babel-types.babel-types.TemplateLiteral */ Boolean = js.native
    def isTemplateLiteral(node: js.Object): /* is babel-types.babel-types.TemplateLiteral */ Boolean = js.native
    def isTemplateLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TemplateLiteral */ Boolean = js.native
    def isTemplateLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types.TemplateLiteral */ Boolean = js.native
    def isTemplateLiteral(node: Unit, opts: js.Object): /* is babel-types.babel-types.TemplateLiteral */ Boolean = js.native
    
    def isTerminatorless(): /* is babel-types.babel-types.Terminatorless */ Boolean = js.native
    def isTerminatorless(node: js.Object): /* is babel-types.babel-types.Terminatorless */ Boolean = js.native
    def isTerminatorless(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Terminatorless */ Boolean = js.native
    def isTerminatorless(node: Null, opts: js.Object): /* is babel-types.babel-types.Terminatorless */ Boolean = js.native
    def isTerminatorless(node: Unit, opts: js.Object): /* is babel-types.babel-types.Terminatorless */ Boolean = js.native
    
    def isThisExpression(): /* is babel-types.babel-types.ThisExpression */ Boolean = js.native
    def isThisExpression(node: js.Object): /* is babel-types.babel-types.ThisExpression */ Boolean = js.native
    def isThisExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ThisExpression */ Boolean = js.native
    def isThisExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.ThisExpression */ Boolean = js.native
    def isThisExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.ThisExpression */ Boolean = js.native
    
    def isThisTypeAnnotation(): /* is babel-types.babel-types.ThisTypeAnnotation */ Boolean = js.native
    def isThisTypeAnnotation(node: js.Object): /* is babel-types.babel-types.ThisTypeAnnotation */ Boolean = js.native
    def isThisTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ThisTypeAnnotation */ Boolean = js.native
    def isThisTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.ThisTypeAnnotation */ Boolean = js.native
    def isThisTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.ThisTypeAnnotation */ Boolean = js.native
    
    def isThrowStatement(): /* is babel-types.babel-types.ThrowStatement */ Boolean = js.native
    def isThrowStatement(node: js.Object): /* is babel-types.babel-types.ThrowStatement */ Boolean = js.native
    def isThrowStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ThrowStatement */ Boolean = js.native
    def isThrowStatement(node: Null, opts: js.Object): /* is babel-types.babel-types.ThrowStatement */ Boolean = js.native
    def isThrowStatement(node: Unit, opts: js.Object): /* is babel-types.babel-types.ThrowStatement */ Boolean = js.native
    
    def isTryStatement(): /* is babel-types.babel-types.TryStatement */ Boolean = js.native
    def isTryStatement(node: js.Object): /* is babel-types.babel-types.TryStatement */ Boolean = js.native
    def isTryStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TryStatement */ Boolean = js.native
    def isTryStatement(node: Null, opts: js.Object): /* is babel-types.babel-types.TryStatement */ Boolean = js.native
    def isTryStatement(node: Unit, opts: js.Object): /* is babel-types.babel-types.TryStatement */ Boolean = js.native
    
    def isTupleTypeAnnotation(): /* is babel-types.babel-types.TupleTypeAnnotation */ Boolean = js.native
    def isTupleTypeAnnotation(node: js.Object): /* is babel-types.babel-types.TupleTypeAnnotation */ Boolean = js.native
    def isTupleTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TupleTypeAnnotation */ Boolean = js.native
    def isTupleTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.TupleTypeAnnotation */ Boolean = js.native
    def isTupleTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.TupleTypeAnnotation */ Boolean = js.native
    
    def isTypeAlias(): /* is babel-types.babel-types.TypeAlias */ Boolean = js.native
    def isTypeAlias(node: js.Object): /* is babel-types.babel-types.TypeAlias */ Boolean = js.native
    def isTypeAlias(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TypeAlias */ Boolean = js.native
    def isTypeAlias(node: Null, opts: js.Object): /* is babel-types.babel-types.TypeAlias */ Boolean = js.native
    def isTypeAlias(node: Unit, opts: js.Object): /* is babel-types.babel-types.TypeAlias */ Boolean = js.native
    
    def isTypeAnnotation(): /* is babel-types.babel-types.TypeAnnotation */ Boolean = js.native
    def isTypeAnnotation(node: js.Object): /* is babel-types.babel-types.TypeAnnotation */ Boolean = js.native
    def isTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TypeAnnotation */ Boolean = js.native
    def isTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.TypeAnnotation */ Boolean = js.native
    def isTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.TypeAnnotation */ Boolean = js.native
    
    def isTypeCastExpression(): /* is babel-types.babel-types.TypeCastExpression */ Boolean = js.native
    def isTypeCastExpression(node: js.Object): /* is babel-types.babel-types.TypeCastExpression */ Boolean = js.native
    def isTypeCastExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TypeCastExpression */ Boolean = js.native
    def isTypeCastExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.TypeCastExpression */ Boolean = js.native
    def isTypeCastExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.TypeCastExpression */ Boolean = js.native
    
    def isTypeParameter(): /* is babel-types.babel-types.TypeParameter */ Boolean = js.native
    def isTypeParameter(node: js.Object): /* is babel-types.babel-types.TypeParameter */ Boolean = js.native
    def isTypeParameter(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TypeParameter */ Boolean = js.native
    def isTypeParameter(node: Null, opts: js.Object): /* is babel-types.babel-types.TypeParameter */ Boolean = js.native
    def isTypeParameter(node: Unit, opts: js.Object): /* is babel-types.babel-types.TypeParameter */ Boolean = js.native
    
    def isTypeParameterDeclaration(): /* is babel-types.babel-types.TypeParameterDeclaration */ Boolean = js.native
    def isTypeParameterDeclaration(node: js.Object): /* is babel-types.babel-types.TypeParameterDeclaration */ Boolean = js.native
    def isTypeParameterDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TypeParameterDeclaration */ Boolean = js.native
    def isTypeParameterDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.TypeParameterDeclaration */ Boolean = js.native
    def isTypeParameterDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.TypeParameterDeclaration */ Boolean = js.native
    
    def isTypeParameterInstantiation(): /* is babel-types.babel-types.TypeParameterInstantiation */ Boolean = js.native
    def isTypeParameterInstantiation(node: js.Object): /* is babel-types.babel-types.TypeParameterInstantiation */ Boolean = js.native
    def isTypeParameterInstantiation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TypeParameterInstantiation */ Boolean = js.native
    def isTypeParameterInstantiation(node: Null, opts: js.Object): /* is babel-types.babel-types.TypeParameterInstantiation */ Boolean = js.native
    def isTypeParameterInstantiation(node: Unit, opts: js.Object): /* is babel-types.babel-types.TypeParameterInstantiation */ Boolean = js.native
    
    def isTypeofTypeAnnotation(): /* is babel-types.babel-types.TypeofTypeAnnotation */ Boolean = js.native
    def isTypeofTypeAnnotation(node: js.Object): /* is babel-types.babel-types.TypeofTypeAnnotation */ Boolean = js.native
    def isTypeofTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TypeofTypeAnnotation */ Boolean = js.native
    def isTypeofTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.TypeofTypeAnnotation */ Boolean = js.native
    def isTypeofTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.TypeofTypeAnnotation */ Boolean = js.native
    
    def isUnaryExpression(): /* is babel-types.babel-types.UnaryExpression */ Boolean = js.native
    def isUnaryExpression(node: js.Object): /* is babel-types.babel-types.UnaryExpression */ Boolean = js.native
    def isUnaryExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.UnaryExpression */ Boolean = js.native
    def isUnaryExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.UnaryExpression */ Boolean = js.native
    def isUnaryExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.UnaryExpression */ Boolean = js.native
    
    def isUnaryLike(): /* is babel-types.babel-types.UnaryLike */ Boolean = js.native
    def isUnaryLike(node: js.Object): /* is babel-types.babel-types.UnaryLike */ Boolean = js.native
    def isUnaryLike(node: js.Object, opts: js.Object): /* is babel-types.babel-types.UnaryLike */ Boolean = js.native
    def isUnaryLike(node: Null, opts: js.Object): /* is babel-types.babel-types.UnaryLike */ Boolean = js.native
    def isUnaryLike(node: Unit, opts: js.Object): /* is babel-types.babel-types.UnaryLike */ Boolean = js.native
    
    def isUnionTypeAnnotation(): /* is babel-types.babel-types.UnionTypeAnnotation */ Boolean = js.native
    def isUnionTypeAnnotation(node: js.Object): /* is babel-types.babel-types.UnionTypeAnnotation */ Boolean = js.native
    def isUnionTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.UnionTypeAnnotation */ Boolean = js.native
    def isUnionTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.UnionTypeAnnotation */ Boolean = js.native
    def isUnionTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.UnionTypeAnnotation */ Boolean = js.native
    
    def isUpdateExpression(): /* is babel-types.babel-types.UpdateExpression */ Boolean = js.native
    def isUpdateExpression(node: js.Object): /* is babel-types.babel-types.UpdateExpression */ Boolean = js.native
    def isUpdateExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.UpdateExpression */ Boolean = js.native
    def isUpdateExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.UpdateExpression */ Boolean = js.native
    def isUpdateExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.UpdateExpression */ Boolean = js.native
    
    def isUser(): Boolean = js.native
    def isUser(node: js.Object): Boolean = js.native
    def isUser(node: js.Object, opts: js.Object): Boolean = js.native
    def isUser(node: Null, opts: js.Object): Boolean = js.native
    def isUser(node: Unit, opts: js.Object): Boolean = js.native
    
    def isUserWhitespacable(): /* is babel-types.babel-types.UserWhitespacable */ Boolean = js.native
    def isUserWhitespacable(node: js.Object): /* is babel-types.babel-types.UserWhitespacable */ Boolean = js.native
    def isUserWhitespacable(node: js.Object, opts: js.Object): /* is babel-types.babel-types.UserWhitespacable */ Boolean = js.native
    def isUserWhitespacable(node: Null, opts: js.Object): /* is babel-types.babel-types.UserWhitespacable */ Boolean = js.native
    def isUserWhitespacable(node: Unit, opts: js.Object): /* is babel-types.babel-types.UserWhitespacable */ Boolean = js.native
    
    def isVar(): /* is babel-types.babel-types.VariableDeclaration */ Boolean = js.native
    def isVar(node: js.Object): /* is babel-types.babel-types.VariableDeclaration */ Boolean = js.native
    def isVar(node: js.Object, opts: js.Object): /* is babel-types.babel-types.VariableDeclaration */ Boolean = js.native
    def isVar(node: Null, opts: js.Object): /* is babel-types.babel-types.VariableDeclaration */ Boolean = js.native
    def isVar(node: Unit, opts: js.Object): /* is babel-types.babel-types.VariableDeclaration */ Boolean = js.native
    
    def isVariableDeclaration(): /* is babel-types.babel-types.VariableDeclaration */ Boolean = js.native
    def isVariableDeclaration(node: js.Object): /* is babel-types.babel-types.VariableDeclaration */ Boolean = js.native
    def isVariableDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.VariableDeclaration */ Boolean = js.native
    def isVariableDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types.VariableDeclaration */ Boolean = js.native
    def isVariableDeclaration(node: Unit, opts: js.Object): /* is babel-types.babel-types.VariableDeclaration */ Boolean = js.native
    
    def isVariableDeclarator(): /* is babel-types.babel-types.VariableDeclarator */ Boolean = js.native
    def isVariableDeclarator(node: js.Object): /* is babel-types.babel-types.VariableDeclarator */ Boolean = js.native
    def isVariableDeclarator(node: js.Object, opts: js.Object): /* is babel-types.babel-types.VariableDeclarator */ Boolean = js.native
    def isVariableDeclarator(node: Null, opts: js.Object): /* is babel-types.babel-types.VariableDeclarator */ Boolean = js.native
    def isVariableDeclarator(node: Unit, opts: js.Object): /* is babel-types.babel-types.VariableDeclarator */ Boolean = js.native
    
    def isVoidTypeAnnotation(): /* is babel-types.babel-types.VoidTypeAnnotation */ Boolean = js.native
    def isVoidTypeAnnotation(node: js.Object): /* is babel-types.babel-types.VoidTypeAnnotation */ Boolean = js.native
    def isVoidTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.VoidTypeAnnotation */ Boolean = js.native
    def isVoidTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types.VoidTypeAnnotation */ Boolean = js.native
    def isVoidTypeAnnotation(node: Unit, opts: js.Object): /* is babel-types.babel-types.VoidTypeAnnotation */ Boolean = js.native
    
    def isWhile(): /* is babel-types.babel-types.While */ Boolean = js.native
    def isWhile(node: js.Object): /* is babel-types.babel-types.While */ Boolean = js.native
    def isWhile(node: js.Object, opts: js.Object): /* is babel-types.babel-types.While */ Boolean = js.native
    def isWhile(node: Null, opts: js.Object): /* is babel-types.babel-types.While */ Boolean = js.native
    def isWhile(node: Unit, opts: js.Object): /* is babel-types.babel-types.While */ Boolean = js.native
    
    def isWhileStatement(): /* is babel-types.babel-types.WhileStatement */ Boolean = js.native
    def isWhileStatement(node: js.Object): /* is babel-types.babel-types.WhileStatement */ Boolean = js.native
    def isWhileStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.WhileStatement */ Boolean = js.native
    def isWhileStatement(node: Null, opts: js.Object): /* is babel-types.babel-types.WhileStatement */ Boolean = js.native
    def isWhileStatement(node: Unit, opts: js.Object): /* is babel-types.babel-types.WhileStatement */ Boolean = js.native
    
    def isWithStatement(): /* is babel-types.babel-types.WithStatement */ Boolean = js.native
    def isWithStatement(node: js.Object): /* is babel-types.babel-types.WithStatement */ Boolean = js.native
    def isWithStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.WithStatement */ Boolean = js.native
    def isWithStatement(node: Null, opts: js.Object): /* is babel-types.babel-types.WithStatement */ Boolean = js.native
    def isWithStatement(node: Unit, opts: js.Object): /* is babel-types.babel-types.WithStatement */ Boolean = js.native
    
    def isYieldExpression(): /* is babel-types.babel-types.YieldExpression */ Boolean = js.native
    def isYieldExpression(node: js.Object): /* is babel-types.babel-types.YieldExpression */ Boolean = js.native
    def isYieldExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.YieldExpression */ Boolean = js.native
    def isYieldExpression(node: Null, opts: js.Object): /* is babel-types.babel-types.YieldExpression */ Boolean = js.native
    def isYieldExpression(node: Unit, opts: js.Object): /* is babel-types.babel-types.YieldExpression */ Boolean = js.native
    
    def jSXAttribute(): JSXAttribute_ = js.native
    def jSXAttribute(name: Unit, value: JSXElement_): JSXAttribute_ = js.native
    def jSXAttribute(name: Unit, value: JSXExpressionContainer_): JSXAttribute_ = js.native
    def jSXAttribute(name: Unit, value: StringLiteral_): JSXAttribute_ = js.native
    def jSXAttribute(name: JSXIdentifier_): JSXAttribute_ = js.native
    def jSXAttribute(name: JSXIdentifier_, value: JSXElement_): JSXAttribute_ = js.native
    def jSXAttribute(name: JSXIdentifier_, value: JSXExpressionContainer_): JSXAttribute_ = js.native
    def jSXAttribute(name: JSXIdentifier_, value: StringLiteral_): JSXAttribute_ = js.native
    def jSXAttribute(name: JSXNamespacedName_): JSXAttribute_ = js.native
    def jSXAttribute(name: JSXNamespacedName_, value: JSXElement_): JSXAttribute_ = js.native
    def jSXAttribute(name: JSXNamespacedName_, value: JSXExpressionContainer_): JSXAttribute_ = js.native
    def jSXAttribute(name: JSXNamespacedName_, value: StringLiteral_): JSXAttribute_ = js.native
    
    def jSXClosingElement(): JSXClosingElement_ = js.native
    def jSXClosingElement(name: JSXIdentifier_): JSXClosingElement_ = js.native
    def jSXClosingElement(name: JSXMemberExpression_): JSXClosingElement_ = js.native
    
    def jSXElement(): JSXElement_ = js.native
    def jSXElement(
      openingElement: Unit,
      closingElement: Unit,
      children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_]
    ): JSXElement_ = js.native
    def jSXElement(
      openingElement: Unit,
      closingElement: Unit,
      children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_],
      selfClosing: Boolean
    ): JSXElement_ = js.native
    def jSXElement(openingElement: Unit, closingElement: Unit, children: Unit, selfClosing: Boolean): JSXElement_ = js.native
    def jSXElement(openingElement: Unit, closingElement: JSXClosingElement_): JSXElement_ = js.native
    def jSXElement(
      openingElement: Unit,
      closingElement: JSXClosingElement_,
      children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_]
    ): JSXElement_ = js.native
    def jSXElement(
      openingElement: Unit,
      closingElement: JSXClosingElement_,
      children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_],
      selfClosing: Boolean
    ): JSXElement_ = js.native
    def jSXElement(openingElement: Unit, closingElement: JSXClosingElement_, children: Unit, selfClosing: Boolean): JSXElement_ = js.native
    def jSXElement(openingElement: JSXOpeningElement_): JSXElement_ = js.native
    def jSXElement(
      openingElement: JSXOpeningElement_,
      closingElement: Unit,
      children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_]
    ): JSXElement_ = js.native
    def jSXElement(
      openingElement: JSXOpeningElement_,
      closingElement: Unit,
      children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_],
      selfClosing: Boolean
    ): JSXElement_ = js.native
    def jSXElement(openingElement: JSXOpeningElement_, closingElement: Unit, children: Unit, selfClosing: Boolean): JSXElement_ = js.native
    def jSXElement(openingElement: JSXOpeningElement_, closingElement: JSXClosingElement_): JSXElement_ = js.native
    def jSXElement(
      openingElement: JSXOpeningElement_,
      closingElement: JSXClosingElement_,
      children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_]
    ): JSXElement_ = js.native
    def jSXElement(
      openingElement: JSXOpeningElement_,
      closingElement: JSXClosingElement_,
      children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_],
      selfClosing: Boolean
    ): JSXElement_ = js.native
    def jSXElement(
      openingElement: JSXOpeningElement_,
      closingElement: JSXClosingElement_,
      children: Unit,
      selfClosing: Boolean
    ): JSXElement_ = js.native
    
    def jSXEmptyExpression(): JSXEmptyExpression_ = js.native
    
    def jSXExpressionContainer(): JSXExpressionContainer_ = js.native
    def jSXExpressionContainer(expression: Expression): JSXExpressionContainer_ = js.native
    
    def jSXIdentifier(): JSXIdentifier_ = js.native
    def jSXIdentifier(name: String): JSXIdentifier_ = js.native
    
    def jSXMemberExpression(): JSXMemberExpression_ = js.native
    def jSXMemberExpression(`object`: Unit, property: JSXIdentifier_): JSXMemberExpression_ = js.native
    def jSXMemberExpression(`object`: JSXIdentifier_): JSXMemberExpression_ = js.native
    def jSXMemberExpression(`object`: JSXIdentifier_, property: JSXIdentifier_): JSXMemberExpression_ = js.native
    def jSXMemberExpression(`object`: JSXMemberExpression_): JSXMemberExpression_ = js.native
    def jSXMemberExpression(`object`: JSXMemberExpression_, property: JSXIdentifier_): JSXMemberExpression_ = js.native
    
    def jSXNamespacedName(): JSXNamespacedName_ = js.native
    def jSXNamespacedName(namespace: Unit, name: JSXIdentifier_): JSXNamespacedName_ = js.native
    def jSXNamespacedName(namespace: JSXIdentifier_): JSXNamespacedName_ = js.native
    def jSXNamespacedName(namespace: JSXIdentifier_, name: JSXIdentifier_): JSXNamespacedName_ = js.native
    
    def jSXOpeningElement(): JSXOpeningElement_ = js.native
    def jSXOpeningElement(name: Unit, attributes: js.Array[JSXAttribute_]): JSXOpeningElement_ = js.native
    def jSXOpeningElement(name: Unit, attributes: js.Array[JSXAttribute_], selfClosing: Boolean): JSXOpeningElement_ = js.native
    def jSXOpeningElement(name: Unit, attributes: Unit, selfClosing: Boolean): JSXOpeningElement_ = js.native
    def jSXOpeningElement(name: JSXIdentifier_): JSXOpeningElement_ = js.native
    def jSXOpeningElement(name: JSXIdentifier_, attributes: js.Array[JSXAttribute_]): JSXOpeningElement_ = js.native
    def jSXOpeningElement(name: JSXIdentifier_, attributes: js.Array[JSXAttribute_], selfClosing: Boolean): JSXOpeningElement_ = js.native
    def jSXOpeningElement(name: JSXIdentifier_, attributes: Unit, selfClosing: Boolean): JSXOpeningElement_ = js.native
    def jSXOpeningElement(name: JSXMemberExpression_): JSXOpeningElement_ = js.native
    def jSXOpeningElement(name: JSXMemberExpression_, attributes: js.Array[JSXAttribute_]): JSXOpeningElement_ = js.native
    def jSXOpeningElement(name: JSXMemberExpression_, attributes: js.Array[JSXAttribute_], selfClosing: Boolean): JSXOpeningElement_ = js.native
    def jSXOpeningElement(name: JSXMemberExpression_, attributes: Unit, selfClosing: Boolean): JSXOpeningElement_ = js.native
    
    def jSXSpreadAttribute(): JSXSpreadAttribute_ = js.native
    def jSXSpreadAttribute(argument: Expression): JSXSpreadAttribute_ = js.native
    
    def jSXText(): JSXText_ = js.native
    def jSXText(value: String): JSXText_ = js.native
    
    def labeledStatement(): LabeledStatement_ = js.native
    def labeledStatement(label: Unit, body: Statement): LabeledStatement_ = js.native
    def labeledStatement(label: Identifier_): LabeledStatement_ = js.native
    def labeledStatement(label: Identifier_, body: Statement): LabeledStatement_ = js.native
    
    def logicalExpression(): LogicalExpression_ = js.native
    def logicalExpression(operator: VerticallineVerticalline | AmpersandAmpersand): LogicalExpression_ = js.native
    def logicalExpression(operator: VerticallineVerticalline | AmpersandAmpersand, left: Unit, right: Expression): LogicalExpression_ = js.native
    def logicalExpression(operator: VerticallineVerticalline | AmpersandAmpersand, left: Expression): LogicalExpression_ = js.native
    def logicalExpression(operator: VerticallineVerticalline | AmpersandAmpersand, left: Expression, right: Expression): LogicalExpression_ = js.native
    def logicalExpression(operator: Unit, left: Unit, right: Expression): LogicalExpression_ = js.native
    def logicalExpression(operator: Unit, left: Expression): LogicalExpression_ = js.native
    def logicalExpression(operator: Unit, left: Expression, right: Expression): LogicalExpression_ = js.native
    
    def memberExpression(): MemberExpression_ = js.native
    def memberExpression(`object`: Unit, property: Unit, computed: Boolean): MemberExpression_ = js.native
    def memberExpression(`object`: Unit, property: Expression): MemberExpression_ = js.native
    def memberExpression(`object`: Unit, property: Expression, computed: Boolean): MemberExpression_ = js.native
    def memberExpression(`object`: Expression): MemberExpression_ = js.native
    def memberExpression(`object`: Expression, property: Unit, computed: Boolean): MemberExpression_ = js.native
    def memberExpression(`object`: Expression, property: Expression): MemberExpression_ = js.native
    def memberExpression(`object`: Expression, property: Expression, computed: Boolean): MemberExpression_ = js.native
    def memberExpression(`object`: Super): MemberExpression_ = js.native
    def memberExpression(`object`: Super, property: Unit, computed: Boolean): MemberExpression_ = js.native
    def memberExpression(`object`: Super, property: Expression): MemberExpression_ = js.native
    def memberExpression(`object`: Super, property: Expression, computed: Boolean): MemberExpression_ = js.native
    
    def metaProperty(): MetaProperty_ = js.native
    def metaProperty(meta: String): MetaProperty_ = js.native
    def metaProperty(meta: String, property: String): MetaProperty_ = js.native
    def metaProperty(meta: Unit, property: String): MetaProperty_ = js.native
    
    def mixedTypeAnnotation(): MixedTypeAnnotation_ = js.native
    
    def newExpression(): NewExpression_ = js.native
    def newExpression(callee: Unit, _arguments: js.Array[Expression | SpreadElement_]): NewExpression_ = js.native
    def newExpression(callee: Expression): NewExpression_ = js.native
    def newExpression(callee: Expression, _arguments: js.Array[Expression | SpreadElement_]): NewExpression_ = js.native
    def newExpression(callee: Super): NewExpression_ = js.native
    def newExpression(callee: Super, _arguments: js.Array[Expression | SpreadElement_]): NewExpression_ = js.native
    
    def noop(): Noop_ = js.native
    
    def nullLiteral(): NullLiteral_ = js.native
    
    def nullLiteralTypeAnnotation(): NullLiteralTypeAnnotation_ = js.native
    
    def nullableTypeAnnotation(): NullableTypeAnnotation_ = js.native
    def nullableTypeAnnotation(typeAnnotation: FlowTypeAnnotation): NullableTypeAnnotation_ = js.native
    
    def numberTypeAnnotation(): NumberTypeAnnotation_ = js.native
    
    def numericLiteral(): NumericLiteral_ = js.native
    def numericLiteral(value: Double): NumericLiteral_ = js.native
    
    def numericLiteralTypeAnnotation(): NumericLiteralTypeAnnotation_ = js.native
    
    def objectExpression(): ObjectExpression_ = js.native
    def objectExpression(properties: js.Array[ObjectProperty_ | ObjectMethod_ | SpreadProperty_]): ObjectExpression_ = js.native
    
    def objectMethod(): ObjectMethod_ = js.native
    def objectMethod(kind: get | set | method): ObjectMethod_ = js.native
    def objectMethod(kind: get | set | method, key: Unit, params: js.Array[LVal]): ObjectMethod_ = js.native
    def objectMethod(kind: get | set | method, key: Unit, params: js.Array[LVal], body: Unit, computed: Boolean): ObjectMethod_ = js.native
    def objectMethod(kind: get | set | method, key: Unit, params: js.Array[LVal], body: BlockStatement_): ObjectMethod_ = js.native
    def objectMethod(
      kind: get | set | method,
      key: Unit,
      params: js.Array[LVal],
      body: BlockStatement_,
      computed: Boolean
    ): ObjectMethod_ = js.native
    def objectMethod(kind: get | set | method, key: Unit, params: Unit, body: Unit, computed: Boolean): ObjectMethod_ = js.native
    def objectMethod(kind: get | set | method, key: Unit, params: Unit, body: BlockStatement_): ObjectMethod_ = js.native
    def objectMethod(kind: get | set | method, key: Unit, params: Unit, body: BlockStatement_, computed: Boolean): ObjectMethod_ = js.native
    def objectMethod(kind: get | set | method, key: Expression): ObjectMethod_ = js.native
    def objectMethod(kind: get | set | method, key: Expression, params: js.Array[LVal]): ObjectMethod_ = js.native
    def objectMethod(kind: get | set | method, key: Expression, params: js.Array[LVal], body: Unit, computed: Boolean): ObjectMethod_ = js.native
    def objectMethod(kind: get | set | method, key: Expression, params: js.Array[LVal], body: BlockStatement_): ObjectMethod_ = js.native
    def objectMethod(
      kind: get | set | method,
      key: Expression,
      params: js.Array[LVal],
      body: BlockStatement_,
      computed: Boolean
    ): ObjectMethod_ = js.native
    def objectMethod(kind: get | set | method, key: Expression, params: Unit, body: Unit, computed: Boolean): ObjectMethod_ = js.native
    def objectMethod(kind: get | set | method, key: Expression, params: Unit, body: BlockStatement_): ObjectMethod_ = js.native
    def objectMethod(kind: get | set | method, key: Expression, params: Unit, body: BlockStatement_, computed: Boolean): ObjectMethod_ = js.native
    def objectMethod(kind: Unit, key: Unit, params: js.Array[LVal]): ObjectMethod_ = js.native
    def objectMethod(kind: Unit, key: Unit, params: js.Array[LVal], body: Unit, computed: Boolean): ObjectMethod_ = js.native
    def objectMethod(kind: Unit, key: Unit, params: js.Array[LVal], body: BlockStatement_): ObjectMethod_ = js.native
    def objectMethod(kind: Unit, key: Unit, params: js.Array[LVal], body: BlockStatement_, computed: Boolean): ObjectMethod_ = js.native
    def objectMethod(kind: Unit, key: Unit, params: Unit, body: Unit, computed: Boolean): ObjectMethod_ = js.native
    def objectMethod(kind: Unit, key: Unit, params: Unit, body: BlockStatement_): ObjectMethod_ = js.native
    def objectMethod(kind: Unit, key: Unit, params: Unit, body: BlockStatement_, computed: Boolean): ObjectMethod_ = js.native
    def objectMethod(kind: Unit, key: Expression): ObjectMethod_ = js.native
    def objectMethod(kind: Unit, key: Expression, params: js.Array[LVal]): ObjectMethod_ = js.native
    def objectMethod(kind: Unit, key: Expression, params: js.Array[LVal], body: Unit, computed: Boolean): ObjectMethod_ = js.native
    def objectMethod(kind: Unit, key: Expression, params: js.Array[LVal], body: BlockStatement_): ObjectMethod_ = js.native
    def objectMethod(kind: Unit, key: Expression, params: js.Array[LVal], body: BlockStatement_, computed: Boolean): ObjectMethod_ = js.native
    def objectMethod(kind: Unit, key: Expression, params: Unit, body: Unit, computed: Boolean): ObjectMethod_ = js.native
    def objectMethod(kind: Unit, key: Expression, params: Unit, body: BlockStatement_): ObjectMethod_ = js.native
    def objectMethod(kind: Unit, key: Expression, params: Unit, body: BlockStatement_, computed: Boolean): ObjectMethod_ = js.native
    
    def objectPattern(): ObjectPattern_ = js.native
    def objectPattern(properties: js.Array[AssignmentProperty | RestProperty_]): ObjectPattern_ = js.native
    def objectPattern(properties: js.Array[AssignmentProperty | RestProperty_], typeAnnotation: TypeAnnotation_): ObjectPattern_ = js.native
    def objectPattern(properties: Unit, typeAnnotation: TypeAnnotation_): ObjectPattern_ = js.native
    
    def objectProperty(): ObjectProperty_ = js.native
    def objectProperty(key: Unit, value: Unit, computed: Boolean): ObjectProperty_ = js.native
    def objectProperty(key: Unit, value: Unit, computed: Boolean, shorthand: Boolean): ObjectProperty_ = js.native
    def objectProperty(key: Unit, value: Unit, computed: Boolean, shorthand: Boolean, decorators: js.Array[Decorator_]): ObjectProperty_ = js.native
    def objectProperty(key: Unit, value: Unit, computed: Boolean, shorthand: Unit, decorators: js.Array[Decorator_]): ObjectProperty_ = js.native
    def objectProperty(key: Unit, value: Unit, computed: Unit, shorthand: Boolean): ObjectProperty_ = js.native
    def objectProperty(key: Unit, value: Unit, computed: Unit, shorthand: Boolean, decorators: js.Array[Decorator_]): ObjectProperty_ = js.native
    def objectProperty(key: Unit, value: Unit, computed: Unit, shorthand: Unit, decorators: js.Array[Decorator_]): ObjectProperty_ = js.native
    def objectProperty(key: Unit, value: Expression): ObjectProperty_ = js.native
    def objectProperty(key: Unit, value: Expression, computed: Boolean): ObjectProperty_ = js.native
    def objectProperty(key: Unit, value: Expression, computed: Boolean, shorthand: Boolean): ObjectProperty_ = js.native
    def objectProperty(
      key: Unit,
      value: Expression,
      computed: Boolean,
      shorthand: Boolean,
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    def objectProperty(key: Unit, value: Expression, computed: Boolean, shorthand: Unit, decorators: js.Array[Decorator_]): ObjectProperty_ = js.native
    def objectProperty(key: Unit, value: Expression, computed: Unit, shorthand: Boolean): ObjectProperty_ = js.native
    def objectProperty(key: Unit, value: Expression, computed: Unit, shorthand: Boolean, decorators: js.Array[Decorator_]): ObjectProperty_ = js.native
    def objectProperty(key: Unit, value: Expression, computed: Unit, shorthand: Unit, decorators: js.Array[Decorator_]): ObjectProperty_ = js.native
    def objectProperty(key: Expression): ObjectProperty_ = js.native
    def objectProperty(key: Expression, value: Unit, computed: Boolean): ObjectProperty_ = js.native
    def objectProperty(key: Expression, value: Unit, computed: Boolean, shorthand: Boolean): ObjectProperty_ = js.native
    def objectProperty(
      key: Expression,
      value: Unit,
      computed: Boolean,
      shorthand: Boolean,
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    def objectProperty(key: Expression, value: Unit, computed: Boolean, shorthand: Unit, decorators: js.Array[Decorator_]): ObjectProperty_ = js.native
    def objectProperty(key: Expression, value: Unit, computed: Unit, shorthand: Boolean): ObjectProperty_ = js.native
    def objectProperty(key: Expression, value: Unit, computed: Unit, shorthand: Boolean, decorators: js.Array[Decorator_]): ObjectProperty_ = js.native
    def objectProperty(key: Expression, value: Unit, computed: Unit, shorthand: Unit, decorators: js.Array[Decorator_]): ObjectProperty_ = js.native
    def objectProperty(key: Expression, value: Expression): ObjectProperty_ = js.native
    def objectProperty(key: Expression, value: Expression, computed: Boolean): ObjectProperty_ = js.native
    def objectProperty(key: Expression, value: Expression, computed: Boolean, shorthand: Boolean): ObjectProperty_ = js.native
    def objectProperty(
      key: Expression,
      value: Expression,
      computed: Boolean,
      shorthand: Boolean,
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    def objectProperty(
      key: Expression,
      value: Expression,
      computed: Boolean,
      shorthand: Unit,
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    def objectProperty(key: Expression, value: Expression, computed: Unit, shorthand: Boolean): ObjectProperty_ = js.native
    def objectProperty(
      key: Expression,
      value: Expression,
      computed: Unit,
      shorthand: Boolean,
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    def objectProperty(
      key: Expression,
      value: Expression,
      computed: Unit,
      shorthand: Unit,
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    
    def objectTypeAnnotation(): ObjectTypeAnnotation_ = js.native
    def objectTypeAnnotation(properties: js.Array[ObjectTypeProperty_]): ObjectTypeAnnotation_ = js.native
    def objectTypeAnnotation(properties: js.Array[ObjectTypeProperty_], indexers: js.Array[ObjectTypeIndexer_]): ObjectTypeAnnotation_ = js.native
    def objectTypeAnnotation(
      properties: js.Array[ObjectTypeProperty_],
      indexers: js.Array[ObjectTypeIndexer_],
      callProperties: js.Array[ObjectTypeCallProperty_]
    ): ObjectTypeAnnotation_ = js.native
    def objectTypeAnnotation(
      properties: js.Array[ObjectTypeProperty_],
      indexers: Unit,
      callProperties: js.Array[ObjectTypeCallProperty_]
    ): ObjectTypeAnnotation_ = js.native
    def objectTypeAnnotation(properties: Unit, indexers: js.Array[ObjectTypeIndexer_]): ObjectTypeAnnotation_ = js.native
    def objectTypeAnnotation(
      properties: Unit,
      indexers: js.Array[ObjectTypeIndexer_],
      callProperties: js.Array[ObjectTypeCallProperty_]
    ): ObjectTypeAnnotation_ = js.native
    def objectTypeAnnotation(properties: Unit, indexers: Unit, callProperties: js.Array[ObjectTypeCallProperty_]): ObjectTypeAnnotation_ = js.native
    
    def objectTypeCallProperty(): ObjectTypeCallProperty_ = js.native
    def objectTypeCallProperty(value: FlowTypeAnnotation): ObjectTypeCallProperty_ = js.native
    
    def objectTypeIndexer(): ObjectTypeIndexer_ = js.native
    def objectTypeIndexer(id: Unit, key: Unit, value: FlowTypeAnnotation): ObjectTypeIndexer_ = js.native
    def objectTypeIndexer(id: Unit, key: FlowTypeAnnotation): ObjectTypeIndexer_ = js.native
    def objectTypeIndexer(id: Unit, key: FlowTypeAnnotation, value: FlowTypeAnnotation): ObjectTypeIndexer_ = js.native
    def objectTypeIndexer(id: Expression): ObjectTypeIndexer_ = js.native
    def objectTypeIndexer(id: Expression, key: Unit, value: FlowTypeAnnotation): ObjectTypeIndexer_ = js.native
    def objectTypeIndexer(id: Expression, key: FlowTypeAnnotation): ObjectTypeIndexer_ = js.native
    def objectTypeIndexer(id: Expression, key: FlowTypeAnnotation, value: FlowTypeAnnotation): ObjectTypeIndexer_ = js.native
    
    def objectTypeProperty(): ObjectTypeProperty_ = js.native
    def objectTypeProperty(key: Unit, value: FlowTypeAnnotation): ObjectTypeProperty_ = js.native
    def objectTypeProperty(key: Expression): ObjectTypeProperty_ = js.native
    def objectTypeProperty(key: Expression, value: FlowTypeAnnotation): ObjectTypeProperty_ = js.native
    
    def parenthesizedExpression(): ParenthesizedExpression_ = js.native
    def parenthesizedExpression(expression: Expression): ParenthesizedExpression_ = js.native
    
    def program(): Program_ = js.native
    def program(body: js.Array[Statement | ModuleDeclaration]): Program_ = js.native
    def program(body: js.Array[Statement | ModuleDeclaration], directives: js.Array[Directive_]): Program_ = js.native
    def program(body: Unit, directives: js.Array[Directive_]): Program_ = js.native
    
    def qualifiedTypeIdentifier(): QualifiedTypeIdentifier_ = js.native
    def qualifiedTypeIdentifier(id: Unit, qualification: Identifier_): QualifiedTypeIdentifier_ = js.native
    def qualifiedTypeIdentifier(id: Unit, qualification: QualifiedTypeIdentifier_): QualifiedTypeIdentifier_ = js.native
    def qualifiedTypeIdentifier(id: Identifier_): QualifiedTypeIdentifier_ = js.native
    def qualifiedTypeIdentifier(id: Identifier_, qualification: Identifier_): QualifiedTypeIdentifier_ = js.native
    def qualifiedTypeIdentifier(id: Identifier_, qualification: QualifiedTypeIdentifier_): QualifiedTypeIdentifier_ = js.native
    
    val react: ReactHelpers = js.native
    
    def regExpLiteral(): RegExpLiteral_ = js.native
    def regExpLiteral(pattern: String): RegExpLiteral_ = js.native
    def regExpLiteral(pattern: String, flags: String): RegExpLiteral_ = js.native
    def regExpLiteral(pattern: Unit, flags: String): RegExpLiteral_ = js.native
    
    def restElement(): RestElement_ = js.native
    def restElement(argument: Unit, typeAnnotation: TypeAnnotation_): RestElement_ = js.native
    def restElement(argument: LVal): RestElement_ = js.native
    def restElement(argument: LVal, typeAnnotation: TypeAnnotation_): RestElement_ = js.native
    
    def restProperty(): RestProperty_ = js.native
    def restProperty(argument: LVal): RestProperty_ = js.native
    
    def returnStatement(): ReturnStatement_ = js.native
    def returnStatement(argument: Expression): ReturnStatement_ = js.native
    
    def sequenceExpression(): SequenceExpression_ = js.native
    def sequenceExpression(expressions: js.Array[Expression]): SequenceExpression_ = js.native
    
    def spreadElement(): SpreadElement_ = js.native
    def spreadElement(argument: Expression): SpreadElement_ = js.native
    
    def spreadProperty(): SpreadProperty_ = js.native
    def spreadProperty(argument: Expression): SpreadProperty_ = js.native
    
    def stringLiteral(): StringLiteral_ = js.native
    def stringLiteral(value: String): StringLiteral_ = js.native
    
    def stringLiteralTypeAnnotation(): StringLiteralTypeAnnotation_ = js.native
    
    def stringTypeAnnotation(): StringTypeAnnotation_ = js.native
    
    def switchCase(): SwitchCase_ = js.native
    def switchCase(test: Unit, consequent: js.Array[Statement]): SwitchCase_ = js.native
    def switchCase(test: Expression): SwitchCase_ = js.native
    def switchCase(test: Expression, consequent: js.Array[Statement]): SwitchCase_ = js.native
    
    def switchStatement(): SwitchStatement_ = js.native
    def switchStatement(discriminant: Unit, cases: js.Array[SwitchCase_]): SwitchStatement_ = js.native
    def switchStatement(discriminant: Expression): SwitchStatement_ = js.native
    def switchStatement(discriminant: Expression, cases: js.Array[SwitchCase_]): SwitchStatement_ = js.native
    
    def taggedTemplateExpression(): TaggedTemplateExpression_ = js.native
    def taggedTemplateExpression(tag: Unit, quasi: TemplateLiteral_): TaggedTemplateExpression_ = js.native
    def taggedTemplateExpression(tag: Expression): TaggedTemplateExpression_ = js.native
    def taggedTemplateExpression(tag: Expression, quasi: TemplateLiteral_): TaggedTemplateExpression_ = js.native
    
    def templateElement(): TemplateElement_ = js.native
    def templateElement(value: Unit, tail: Boolean): TemplateElement_ = js.native
    def templateElement(value: Raw): TemplateElement_ = js.native
    def templateElement(value: Raw, tail: Boolean): TemplateElement_ = js.native
    
    def templateLiteral(): TemplateLiteral_ = js.native
    def templateLiteral(quasis: js.Array[TemplateElement_]): TemplateLiteral_ = js.native
    def templateLiteral(quasis: js.Array[TemplateElement_], expressions: js.Array[Expression]): TemplateLiteral_ = js.native
    def templateLiteral(quasis: Unit, expressions: js.Array[Expression]): TemplateLiteral_ = js.native
    
    def thisExpression(): ThisExpression_ = js.native
    
    def thisTypeAnnotation(): ThisTypeAnnotation_ = js.native
    
    def throwStatement(): ThrowStatement_ = js.native
    def throwStatement(argument: Expression): ThrowStatement_ = js.native
    
    def tryStatement(): TryStatement_ = js.native
    def tryStatement(block: Unit, handler: Unit, finalizer: BlockStatement_): TryStatement_ = js.native
    def tryStatement(block: Unit, handler: CatchClause_): TryStatement_ = js.native
    def tryStatement(block: Unit, handler: CatchClause_, finalizer: BlockStatement_): TryStatement_ = js.native
    def tryStatement(block: BlockStatement_): TryStatement_ = js.native
    def tryStatement(block: BlockStatement_, handler: Unit, finalizer: BlockStatement_): TryStatement_ = js.native
    def tryStatement(block: BlockStatement_, handler: CatchClause_): TryStatement_ = js.native
    def tryStatement(block: BlockStatement_, handler: CatchClause_, finalizer: BlockStatement_): TryStatement_ = js.native
    
    def tupleTypeAnnotation(): TupleTypeAnnotation_ = js.native
    def tupleTypeAnnotation(types: js.Array[FlowTypeAnnotation]): TupleTypeAnnotation_ = js.native
    
    def typeAlias(): TypeAlias_ = js.native
    def typeAlias(id: Unit, typeParameters: Unit, right: FlowTypeAnnotation): TypeAlias_ = js.native
    def typeAlias(id: Unit, typeParameters: TypeParameterDeclaration_): TypeAlias_ = js.native
    def typeAlias(id: Unit, typeParameters: TypeParameterDeclaration_, right: FlowTypeAnnotation): TypeAlias_ = js.native
    def typeAlias(id: Identifier_): TypeAlias_ = js.native
    def typeAlias(id: Identifier_, typeParameters: Unit, right: FlowTypeAnnotation): TypeAlias_ = js.native
    def typeAlias(id: Identifier_, typeParameters: TypeParameterDeclaration_): TypeAlias_ = js.native
    def typeAlias(id: Identifier_, typeParameters: TypeParameterDeclaration_, right: FlowTypeAnnotation): TypeAlias_ = js.native
    
    def typeAnnotation(): TypeAnnotation_ = js.native
    def typeAnnotation(typeAnnotation: FlowTypeAnnotation): TypeAnnotation_ = js.native
    
    def typeCastExpression(): TypeCastExpression_ = js.native
    def typeCastExpression(expression: Unit, typeAnnotation: FlowTypeAnnotation): TypeCastExpression_ = js.native
    def typeCastExpression(expression: Expression): TypeCastExpression_ = js.native
    def typeCastExpression(expression: Expression, typeAnnotation: FlowTypeAnnotation): TypeCastExpression_ = js.native
    
    def typeParameter(): TypeParameter_ = js.native
    def typeParameter(bound: Unit, default_ : Flow): TypeParameter_ = js.native
    def typeParameter(bound: TypeAnnotation_): TypeParameter_ = js.native
    def typeParameter(bound: TypeAnnotation_, default_ : Flow): TypeParameter_ = js.native
    
    def typeParameterDeclaration(): TypeParameterDeclaration_ = js.native
    def typeParameterDeclaration(params: js.Array[Identifier_]): TypeParameterDeclaration_ = js.native
    
    def typeParameterInstantiation(): TypeParameterInstantiation_ = js.native
    def typeParameterInstantiation(params: js.Array[FlowTypeAnnotation]): TypeParameterInstantiation_ = js.native
    
    def typeofTypeAnnotation(): TypeofTypeAnnotation_ = js.native
    def typeofTypeAnnotation(argument: FlowTypeAnnotation): TypeofTypeAnnotation_ = js.native
    
    def unaryExpression(): UnaryExpression_ = js.native
    def unaryExpression(
      operator: void | delete | Exclamationmark | Plussign | `-_` | PlussignPlussign | `--` | Tilde | typeof
    ): UnaryExpression_ = js.native
    def unaryExpression(
      operator: void | delete | Exclamationmark | Plussign | `-_` | PlussignPlussign | `--` | Tilde | typeof,
      argument: Unit,
      prefix: Boolean
    ): UnaryExpression_ = js.native
    def unaryExpression(
      operator: void | delete | Exclamationmark | Plussign | `-_` | PlussignPlussign | `--` | Tilde | typeof,
      argument: Expression
    ): UnaryExpression_ = js.native
    def unaryExpression(
      operator: void | delete | Exclamationmark | Plussign | `-_` | PlussignPlussign | `--` | Tilde | typeof,
      argument: Expression,
      prefix: Boolean
    ): UnaryExpression_ = js.native
    def unaryExpression(operator: Unit, argument: Unit, prefix: Boolean): UnaryExpression_ = js.native
    def unaryExpression(operator: Unit, argument: Expression): UnaryExpression_ = js.native
    def unaryExpression(operator: Unit, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
    
    def unionTypeAnnotation(): UnionTypeAnnotation_ = js.native
    def unionTypeAnnotation(types: js.Array[FlowTypeAnnotation]): UnionTypeAnnotation_ = js.native
    
    def updateExpression(): UpdateExpression_ = js.native
    def updateExpression(operator: PlussignPlussign | `--`): UpdateExpression_ = js.native
    def updateExpression(operator: PlussignPlussign | `--`, argument: Unit, prefix: Boolean): UpdateExpression_ = js.native
    def updateExpression(operator: PlussignPlussign | `--`, argument: Expression): UpdateExpression_ = js.native
    def updateExpression(operator: PlussignPlussign | `--`, argument: Expression, prefix: Boolean): UpdateExpression_ = js.native
    def updateExpression(operator: Unit, argument: Unit, prefix: Boolean): UpdateExpression_ = js.native
    def updateExpression(operator: Unit, argument: Expression): UpdateExpression_ = js.native
    def updateExpression(operator: Unit, argument: Expression, prefix: Boolean): UpdateExpression_ = js.native
    
    def variableDeclaration(): VariableDeclaration_ = js.native
    def variableDeclaration(kind: `var` | let | const): VariableDeclaration_ = js.native
    def variableDeclaration(kind: `var` | let | const, declarations: js.Array[VariableDeclarator_]): VariableDeclaration_ = js.native
    def variableDeclaration(kind: Unit, declarations: js.Array[VariableDeclarator_]): VariableDeclaration_ = js.native
    
    def variableDeclarator(): VariableDeclarator_ = js.native
    def variableDeclarator(id: Unit, init: Expression): VariableDeclarator_ = js.native
    def variableDeclarator(id: LVal): VariableDeclarator_ = js.native
    def variableDeclarator(id: LVal, init: Expression): VariableDeclarator_ = js.native
    
    def voidTypeAnnotation(): VoidTypeAnnotation_ = js.native
    
    def whileStatement(): WhileStatement_ = js.native
    def whileStatement(test: Unit, body: BlockStatement_): WhileStatement_ = js.native
    def whileStatement(test: Unit, body: Statement): WhileStatement_ = js.native
    def whileStatement(test: Expression): WhileStatement_ = js.native
    def whileStatement(test: Expression, body: BlockStatement_): WhileStatement_ = js.native
    def whileStatement(test: Expression, body: Statement): WhileStatement_ = js.native
    
    def withStatement(): WithStatement_ = js.native
    def withStatement(`object`: Unit, body: BlockStatement_): WithStatement_ = js.native
    def withStatement(`object`: Unit, body: Statement): WithStatement_ = js.native
    def withStatement(`object`: Expression): WithStatement_ = js.native
    def withStatement(`object`: Expression, body: BlockStatement_): WithStatement_ = js.native
    def withStatement(`object`: Expression, body: Statement): WithStatement_ = js.native
    
    def yieldExpression(): YieldExpression_ = js.native
    def yieldExpression(argument: Unit, delegate: Boolean): YieldExpression_ = js.native
    def yieldExpression(argument: Expression): YieldExpression_ = js.native
    def yieldExpression(argument: Expression, delegate: Boolean): YieldExpression_ = js.native
  }
}
