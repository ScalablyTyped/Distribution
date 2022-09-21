package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import typings.vscode.Thenable
import typings.vscode.mod.CallHierarchyProvider
import typings.vscode.mod.CodeActionProvider
import typings.vscode.mod.CodeActionProviderMetadata
import typings.vscode.mod.CodeLensProvider
import typings.vscode.mod.CompletionItemProvider
import typings.vscode.mod.DeclarationProvider
import typings.vscode.mod.DefinitionProvider
import typings.vscode.mod.DiagnosticChangeEvent
import typings.vscode.mod.DiagnosticCollection
import typings.vscode.mod.DocumentColorProvider
import typings.vscode.mod.DocumentDropEditProvider
import typings.vscode.mod.DocumentFormattingEditProvider
import typings.vscode.mod.DocumentHighlightProvider
import typings.vscode.mod.DocumentLinkProvider
import typings.vscode.mod.DocumentRangeFormattingEditProvider
import typings.vscode.mod.DocumentRangeSemanticTokensProvider
import typings.vscode.mod.DocumentSelector
import typings.vscode.mod.DocumentSemanticTokensProvider
import typings.vscode.mod.DocumentSymbolProvider
import typings.vscode.mod.DocumentSymbolProviderMetadata
import typings.vscode.mod.EvaluatableExpressionProvider
import typings.vscode.mod.Event
import typings.vscode.mod.FoldingRangeProvider
import typings.vscode.mod.HoverProvider
import typings.vscode.mod.ImplementationProvider
import typings.vscode.mod.InlayHintsProvider
import typings.vscode.mod.InlineCompletionItemProvider
import typings.vscode.mod.InlineValuesProvider
import typings.vscode.mod.LanguageConfiguration
import typings.vscode.mod.LanguageStatusItem
import typings.vscode.mod.LinkedEditingRangeProvider
import typings.vscode.mod.OnTypeFormattingEditProvider
import typings.vscode.mod.ReferenceProvider
import typings.vscode.mod.RenameProvider
import typings.vscode.mod.SelectionRangeProvider
import typings.vscode.mod.SignatureHelpProvider
import typings.vscode.mod.SignatureHelpProviderMetadata
import typings.vscode.mod.TextDocument
import typings.vscode.mod.TypeDefinitionProvider
import typings.vscode.mod.TypeHierarchyProvider
import typings.vscode.mod.WorkspaceSymbolProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object languages {
  
  @JSGlobal("vscode.languages")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDiagnosticCollection(): DiagnosticCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiagnosticCollection")().asInstanceOf[DiagnosticCollection]
  inline def createDiagnosticCollection(name: String): DiagnosticCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiagnosticCollection")(name.asInstanceOf[js.Any]).asInstanceOf[DiagnosticCollection]
  
  inline def createLanguageStatusItem(id: String, selector: DocumentSelector): LanguageStatusItem = (^.asInstanceOf[js.Dynamic].applyDynamic("createLanguageStatusItem")(id.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[LanguageStatusItem]
  
  inline def getDiagnostics(): js.Array[js.Tuple2[typings.vscode.mod.Uri, js.Array[typings.vscode.mod.Diagnostic]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDiagnostics")().asInstanceOf[js.Array[js.Tuple2[typings.vscode.mod.Uri, js.Array[typings.vscode.mod.Diagnostic]]]]
  inline def getDiagnostics(resource: typings.vscode.mod.Uri): js.Array[typings.vscode.mod.Diagnostic] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDiagnostics")(resource.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.vscode.mod.Diagnostic]]
  
  inline def getLanguages(): Thenable[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguages")().asInstanceOf[Thenable[js.Array[String]]]
  
  inline def `match`(selector: DocumentSelector, document: TextDocument): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(selector.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSGlobal("vscode.languages.onDidChangeDiagnostics")
  @js.native
  val onDidChangeDiagnostics: Event[DiagnosticChangeEvent] = js.native
  
  inline def registerCallHierarchyProvider(selector: DocumentSelector, provider: CallHierarchyProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCallHierarchyProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerCodeActionsProvider(selector: DocumentSelector, provider: CodeActionProvider[typings.vscode.mod.CodeAction]): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCodeActionsProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  inline def registerCodeActionsProvider(
    selector: DocumentSelector,
    provider: CodeActionProvider[typings.vscode.mod.CodeAction],
    metadata: CodeActionProviderMetadata
  ): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCodeActionsProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerCodeLensProvider(selector: DocumentSelector, provider: CodeLensProvider[typings.vscode.mod.CodeLens]): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCodeLensProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerColorProvider(selector: DocumentSelector, provider: DocumentColorProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerColorProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerCompletionItemProvider(
    selector: DocumentSelector,
    provider: CompletionItemProvider[typings.vscode.mod.CompletionItem],
    triggerCharacters: String*
  ): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCompletionItemProvider")((List(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).`++`(triggerCharacters.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerDeclarationProvider(selector: DocumentSelector, provider: DeclarationProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDeclarationProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerDefinitionProvider(selector: DocumentSelector, provider: DefinitionProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDefinitionProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerDocumentDropEditProvider(selector: DocumentSelector, provider: DocumentDropEditProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentDropEditProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerDocumentFormattingEditProvider(selector: DocumentSelector, provider: DocumentFormattingEditProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentFormattingEditProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerDocumentHighlightProvider(selector: DocumentSelector, provider: DocumentHighlightProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentHighlightProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerDocumentLinkProvider(selector: DocumentSelector, provider: DocumentLinkProvider[typings.vscode.mod.DocumentLink]): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentLinkProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerDocumentRangeFormattingEditProvider(selector: DocumentSelector, provider: DocumentRangeFormattingEditProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentRangeFormattingEditProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerDocumentRangeSemanticTokensProvider(
    selector: DocumentSelector,
    provider: DocumentRangeSemanticTokensProvider,
    legend: typings.vscode.mod.SemanticTokensLegend
  ): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentRangeSemanticTokensProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], legend.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerDocumentSemanticTokensProvider(
    selector: DocumentSelector,
    provider: DocumentSemanticTokensProvider,
    legend: typings.vscode.mod.SemanticTokensLegend
  ): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentSemanticTokensProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], legend.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerDocumentSymbolProvider(selector: DocumentSelector, provider: DocumentSymbolProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentSymbolProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  inline def registerDocumentSymbolProvider(
    selector: DocumentSelector,
    provider: DocumentSymbolProvider,
    metaData: DocumentSymbolProviderMetadata
  ): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentSymbolProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], metaData.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerEvaluatableExpressionProvider(selector: DocumentSelector, provider: EvaluatableExpressionProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerEvaluatableExpressionProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerFoldingRangeProvider(selector: DocumentSelector, provider: FoldingRangeProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFoldingRangeProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerHoverProvider(selector: DocumentSelector, provider: HoverProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHoverProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerImplementationProvider(selector: DocumentSelector, provider: ImplementationProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerImplementationProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerInlayHintsProvider(selector: DocumentSelector, provider: InlayHintsProvider[typings.vscode.mod.InlayHint]): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInlayHintsProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerInlineCompletionItemProvider(selector: DocumentSelector, provider: InlineCompletionItemProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInlineCompletionItemProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerInlineValuesProvider(selector: DocumentSelector, provider: InlineValuesProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInlineValuesProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerLinkedEditingRangeProvider(selector: DocumentSelector, provider: LinkedEditingRangeProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLinkedEditingRangeProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerOnTypeFormattingEditProvider(
    selector: DocumentSelector,
    provider: OnTypeFormattingEditProvider,
    firstTriggerCharacter: String,
    moreTriggerCharacter: String*
  ): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerOnTypeFormattingEditProvider")((List(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], firstTriggerCharacter.asInstanceOf[js.Any])).`++`(moreTriggerCharacter.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerReferenceProvider(selector: DocumentSelector, provider: ReferenceProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerReferenceProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerRenameProvider(selector: DocumentSelector, provider: RenameProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRenameProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerSelectionRangeProvider(selector: DocumentSelector, provider: SelectionRangeProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSelectionRangeProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerSignatureHelpProvider(
    selector: DocumentSelector,
    provider: SignatureHelpProvider,
    metadata: SignatureHelpProviderMetadata
  ): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSignatureHelpProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  inline def registerSignatureHelpProvider(selector: DocumentSelector, provider: SignatureHelpProvider, triggerCharacters: String*): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSignatureHelpProvider")((List(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).`++`(triggerCharacters.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerTypeDefinitionProvider(selector: DocumentSelector, provider: TypeDefinitionProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTypeDefinitionProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerTypeHierarchyProvider(selector: DocumentSelector, provider: TypeHierarchyProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTypeHierarchyProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerWorkspaceSymbolProvider(provider: WorkspaceSymbolProvider[typings.vscode.mod.SymbolInformation]): typings.vscode.mod.Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerWorkspaceSymbolProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def setLanguageConfiguration(language: String, configuration: LanguageConfiguration): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("setLanguageConfiguration")(language.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def setTextDocumentLanguage(document: TextDocument, languageId: String): Thenable[TextDocument] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTextDocumentLanguage")(document.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any])).asInstanceOf[Thenable[TextDocument]]
}
