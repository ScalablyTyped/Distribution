package typings.hyperformula

import typings.hyperformula.hyperformulaStrings.evaluationResumed
import typings.hyperformula.hyperformulaStrings.evaluationSuspended
import typings.hyperformula.hyperformulaStrings.namedExpressionAdded
import typings.hyperformula.hyperformulaStrings.namedExpressionRemoved
import typings.hyperformula.hyperformulaStrings.sheetAdded
import typings.hyperformula.hyperformulaStrings.sheetRemoved
import typings.hyperformula.hyperformulaStrings.sheetRenamed
import typings.hyperformula.hyperformulaStrings.valuesUpdated
import typings.hyperformula.typingsExporterMod.ExportedChange
import typings.std.Parameters
import typings.tinyEmitter.mod.TinyEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsEmitterMod {
  
  @JSImport("hyperformula/typings/Emitter", "Emitter")
  @js.native
  open class Emitter ()
    extends TinyEmitter
       with TypedEmitter {
    
    def emit[Event /* <: /* keyof hyperformula.hyperformula/typings/Emitter.Listeners */ sheetAdded | sheetRemoved | sheetRenamed | namedExpressionAdded | namedExpressionRemoved | valuesUpdated | evaluationSuspended | evaluationResumed */](
      event: Event,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Listeners[Event]> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: hyperformula.hyperformula/typings/Emitter.Listeners[Event] */ js.Any
        ]
    ): this.type = js.native
    
    /* CompleteClass */
    override def off[Event /* <: /* keyof hyperformula.hyperformula/typings/Emitter.Listeners */ sheetAdded | sheetRemoved | sheetRenamed | namedExpressionAdded | namedExpressionRemoved | valuesUpdated | evaluationSuspended | evaluationResumed */](
      s: Event,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: hyperformula.hyperformula/typings/Emitter.Listeners[Event] */ js.Any
    ): Unit = js.native
    
    /* CompleteClass */
    override def on[Event /* <: /* keyof hyperformula.hyperformula/typings/Emitter.Listeners */ sheetAdded | sheetRemoved | sheetRenamed | namedExpressionAdded | namedExpressionRemoved | valuesUpdated | evaluationSuspended | evaluationResumed */](
      s: Event,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: hyperformula.hyperformula/typings/Emitter.Listeners[Event] */ js.Any
    ): Unit = js.native
    
    /* CompleteClass */
    override def once[Event /* <: /* keyof hyperformula.hyperformula/typings/Emitter.Listeners */ sheetAdded | sheetRemoved | sheetRenamed | namedExpressionAdded | namedExpressionRemoved | valuesUpdated | evaluationSuspended | evaluationResumed */](
      s: Event,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: hyperformula.hyperformula/typings/Emitter.Listeners[Event] */ js.Any
    ): Unit = js.native
  }
  
  @js.native
  sealed trait Events extends StObject
  @JSImport("hyperformula/typings/Emitter", "Events")
  @js.native
  object Events extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Events & String] = js.native
    
    @js.native
    sealed trait EvaluationResumed
      extends StObject
         with Events
    /* "evaluationResumed" */ val EvaluationResumed: typings.hyperformula.typingsEmitterMod.Events.EvaluationResumed & String = js.native
    
    @js.native
    sealed trait EvaluationSuspended
      extends StObject
         with Events
    /* "evaluationSuspended" */ val EvaluationSuspended: typings.hyperformula.typingsEmitterMod.Events.EvaluationSuspended & String = js.native
    
    @js.native
    sealed trait NamedExpressionAdded
      extends StObject
         with Events
    /* "namedExpressionAdded" */ val NamedExpressionAdded: typings.hyperformula.typingsEmitterMod.Events.NamedExpressionAdded & String = js.native
    
    @js.native
    sealed trait NamedExpressionRemoved
      extends StObject
         with Events
    /* "namedExpressionRemoved" */ val NamedExpressionRemoved: typings.hyperformula.typingsEmitterMod.Events.NamedExpressionRemoved & String = js.native
    
    @js.native
    sealed trait SheetAdded
      extends StObject
         with Events
    /* "sheetAdded" */ val SheetAdded: typings.hyperformula.typingsEmitterMod.Events.SheetAdded & String = js.native
    
    @js.native
    sealed trait SheetRemoved
      extends StObject
         with Events
    /* "sheetRemoved" */ val SheetRemoved: typings.hyperformula.typingsEmitterMod.Events.SheetRemoved & String = js.native
    
    @js.native
    sealed trait SheetRenamed
      extends StObject
         with Events
    /* "sheetRenamed" */ val SheetRenamed: typings.hyperformula.typingsEmitterMod.Events.SheetRenamed & String = js.native
    
    @js.native
    sealed trait ValuesUpdated
      extends StObject
         with Events
    /* "valuesUpdated" */ val ValuesUpdated: typings.hyperformula.typingsEmitterMod.Events.ValuesUpdated & String = js.native
  }
  
  trait Listeners extends StObject {
    
    /**
      * Occurs when evaluation is resumed.
      *
      * @event
      *
      * @param {ExportedChange[]} changes the values and location of applied changes
      *
      * @example
      * ```js
      * const hfInstance = HyperFormula.buildFromSheets({
      *   MySheet1: [ ['1'] ],
      *   MySheet2: [ ['10'] ]
      * });
      *
      * // define a function to be called when the event occurs
      * const handler = (changes) => { console.log('baz') }
      *
      * // subscribe to the 'evaluationResumed' event, pass the handler
      * hfInstance.on('evaluationResumed', handler);
      *
      * // first, suspend evaluation
      * hfInstance.suspendEvaluation();
      *
      * // now, resume evaluation
      * // the console prints 'baz' each time evaluation is resumed
      * hfInstance.resumeEvaluation();
      *
      * // unsubscribe from the 'evaluationResumed' event
      * hfInstance.off('evaluationResumed', handler);
      *
      * // suspend evaluation again
      * hfInstance.suspendEvaluation();
      *
      * // resume evaluation again
      * // this time, the console doesn't print anything
      * hfInstance.resumeEvaluation();;
      * ```
      *
      * @category Batch
      */
    def evaluationResumed(changes: js.Array[ExportedChange]): Any
    
    /**
      * Occurs when evaluation is suspended.
      *
      * @event
      *
      * @example
      * ```js
      * const hfInstance = HyperFormula.buildFromSheets({
      *   MySheet1: [ ['1'] ],
      *   MySheet2: [ ['10'] ]
      * });
      *
      * // define a function to be called when the event occurs
      * const handler = ( ) => { console.log('baz') }
      *
      * // subscribe to the 'evaluationSuspended' event, pass the handler
      * hfInstance.on('evaluationSuspended', handler);
      *
      * // suspend evaluation
      * // the console prints 'baz' each time evaluation is suspended
      * hfInstance.suspendEvaluation();
      *
      * // resume evaluation
      * hfInstance.resumeEvaluation();
      *
      * // unsubscribe from the 'evaluationSuspended' event
      * hfInstance.off('evaluationSuspended', handler);
      *
      * // suspend evaluation again
      * // this time, the console doesn't print anything
      * hfInstance.suspendEvaluation();;
      * ```
      *
      * @category Batch
      */
    def evaluationSuspended(): Any
    
    /**
      * Occurs when a named expression with specified values and location is added.
      *
      * @event
      *
      * @param {string} namedExpressionName the name of added expression
      * @param {ExportedChange[]} changes the values and location of applied changes
      *
      * @example
      * ```js
      * const hfInstance = HyperFormula.buildFromArray([
      *   ['42'],
      * ]);
      *
      * // define a function to be called when the event occurs
      * const handler = (namedExpressionName, changes) => { console.log('baz') }
      *
      * // subscribe to the 'namedExpressionAdded' event, pass the handler
      * hfInstance.on('namedExpressionAdded', handler);
      *
      * // add a named expression
      * // the console prints 'baz' each time a named expression is added
      * const changes = hfInstance.addNamedExpression('prettyName', '=Sheet1!$A$1+100', 0);
      *
      * // unsubscribe from the 'namedExpressionAdded' event
      * hfInstance.off('namedExpressionAdded', handler);
      *
      * // add another named expression
      * // this time, the console doesn't print anything
      * const changes = hfInstance.addNamedExpression('uglyName', '=Sheet1!$A$1+100', 0);
      * ```
      *
      * @category Named Expression
      */
    def namedExpressionAdded(namedExpressionName: String, changes: js.Array[ExportedChange]): Any
    
    /**
      * Occurs when a named expression with specified values is removed and from an indicated location.
      *
      * @event
      *
      * @param {string} namedExpressionName the name of removed expression
      * @param {ExportedChange[]} changes the values and location of applied changes
      *
      * @example
      * ```js
      * const hfInstance = HyperFormula.buildFromArray([
      *   ['42'],
      * ]);
      *
      * // define a function to be called when the event occurs
      * const handler = (namedExpressionName, changes) => { console.log('baz') }
      *
      * // subscribe to the 'namedExpressionRemoved' event, pass the handler
      * hfInstance.on('namedExpressionRemoved', handler);
      *
      * // add some named expressions
      * hfInstance.addNamedExpression('prettyName', '=Sheet1!$A$1+100', 0);
      * hfInstance.addNamedExpression('uglyName', '=Sheet1!$A$1+100', 0);
      *
      * // remove a named expression
      * // the console prints 'baz' each time a named expression is removed
      * const changes = hfInstance.removeNamedExpression('prettyName', 0);
      *
      * // unsubscribe from the 'namedExpressionRemoved' event
      * hfInstance.off('namedExpressionRemoved', handler);
      *
      * // remove another named expression
      * // this time, the console doesn't print anything
      * const changes = hfInstance.removeNamedExpression('uglyName', 0);
      * ```
      *
      * @category Named Expression
      */
    def namedExpressionRemoved(namedExpressionName: String, changes: js.Array[ExportedChange]): Any
    
    /**
      * Occurs when a sheet is added anywhere inside the workbook.
      *
      * @event
      *
      * @param {string} addedSheetDisplayName the name of added sheet
      *
      * @example
      * ```js
      * const hfInstance = HyperFormula.buildEmpty();
      *
      * // define a function to be called when the event occurs
      * const handler = (addedSheetDisplayName) => { console.log('baz') }
      *
      * // subscribe to the 'sheetAdded' event, pass the handler
      * hfInstance.on('sheetAdded', handler);
      *
      * // add a sheet to trigger the 'sheetAdded' event,
      * // the console prints 'baz' each time a sheet is added
      * hfInstance.addSheet('FooBar');
      *
      * // unsubscribe from the 'sheetAdded' event
      * hfInstance.off('sheetAdded', handler);
      *
      * // add a sheet
      * // this time, the console doesn't print anything
      * hfInstance.addSheet('FooBaz');
      * ```
      *
      * @category Sheet
      */
    def sheetAdded(addedSheetDisplayName: String): Any
    
    /**
      * Occurs when a sheet is removed from anywhere inside the workbook.
      *
      * @event
      *
      * @param {string} removedSheetDisplayName the name of removed sheet
      * @param {ExportedChange[]} changes the values and location of applied changes
      *
      * @example
      * ```js
      * const hfInstance = HyperFormula.buildFromSheets({
      *   MySheet1: [ ['=SUM(MySheet2!A1:A2)'] ],
      *   MySheet2: [ ['10'] ],
      * });
      *
      * // define a function to be called when the event occurs
      * const handler = (removedSheetDisplayName, changes) => { console.log('baz') }
      *
      * // subscribe to the 'sheetRemoved' event, pass the handler
      * hfInstance.on('sheetRemoved', handler);
      *
      * // remove a sheet to trigger the 'sheetRemoved' event,
      * // the console prints 'baz' each time a sheet is removed
      * hfInstance.removeSheet(0);
      *
      * // unsubscribe from the 'sheetRemoved' event
      * hfInstance.off('sheetRemoved', handler);
      *
      * // remove a sheet
      * // this time, the console doesn't print anything
      * hfInstance.removeSheet(1);
      * ```
      *
      * @category Sheet
      */
    def sheetRemoved(removedSheetDisplayName: String, changes: js.Array[ExportedChange]): Any
    
    /**
      * Occurs when a sheet is renamed anywhere inside the workbook.
      *
      * @event
      *
      * @param {string} oldDisplayName the old name of a sheet before renaming
      * @param {string} newDisplayName the new name of the sheet after renaming
      *
      * @example
      * ```js
      * const hfInstance = HyperFormula.buildFromSheets({
      *   MySheet1: [ ['=SUM(MySheet2!A1:A2)'] ],
      *   MySheet2: [ ['10'] ],
      * });
      *
      * // define a function to be called when the event occurs
      * const handler = (oldName, newName) => { console.log(`Sheet ${oldName} was renamed to ${newName}`) }
      *
      * // subscribe to the 'sheetRenamed' event, pass the handler
      * hfInstance.on('sheetRenamed', handler);
      *
      * // rename a sheet to trigger the 'sheetRenamed' event,
      * // the console prints `Sheet ${oldName} was renamed to ${newName}` each time a sheet is renamed
      * hfInstance.renameSheet(0, 'MySheet0');
      *
      * // unsubscribe from the 'sheetRenamed' event
      * hfInstance.off('sheetRenamed', handler);
      *
      * // rename a sheet
      * // this time, the console doesn't print anything
      * hfInstance.renameSheet(1, 'MySheet1');
      * ```
      *
      * @category Sheet
      */
    def sheetRenamed(oldDisplayName: String, newDisplayName: String): Any
    
    /**
      * Occurs when values in a specified location are changed and cause recalculation.
      *
      * @event
      *
      * @param {ExportedChange[]} changes the values and location of applied changes
      *
      * @example
      * ```js
      * const hfInstance = HyperFormula.buildFromArray([
      *   ['1', '2', '=A1'],
      * ]);
      *
      * // define a function to be called when the event occurs
      * const handler = (changes) => { console.log('baz') }
      *
      * // subscribe to the 'valuesUpdated' event, pass the handler
      * hfInstance.on('valuesUpdated', handler);
      *
      * // trigger recalculation, for example, with the 'setCellContents' method
      * // the console prints 'baz' each time a value change triggers recalculation
      * const changes = hfInstance.setCellContents({ col: 3, row: 0, sheet: 0 }, [['=B1']]);
      *
      * // unsubscribe from the 'valuesUpdated' event
      * hfInstance.off('valuesUpdated', handler);
      *
      * // trigger another recalculation
      * // this time, the console doesn't print anything
      * const changes = hfInstance.setCellContents({ col: 3, row: 0, sheet: 0 }, [['=A1']]);
      * ```
      *
      * @category Values
      */
    def valuesUpdated(changes: js.Array[ExportedChange]): Any
  }
  object Listeners {
    
    inline def apply(
      evaluationResumed: js.Array[ExportedChange] => Any,
      evaluationSuspended: () => Any,
      namedExpressionAdded: (String, js.Array[ExportedChange]) => Any,
      namedExpressionRemoved: (String, js.Array[ExportedChange]) => Any,
      sheetAdded: String => Any,
      sheetRemoved: (String, js.Array[ExportedChange]) => Any,
      sheetRenamed: (String, String) => Any,
      valuesUpdated: js.Array[ExportedChange] => Any
    ): Listeners = {
      val __obj = js.Dynamic.literal(evaluationResumed = js.Any.fromFunction1(evaluationResumed), evaluationSuspended = js.Any.fromFunction0(evaluationSuspended), namedExpressionAdded = js.Any.fromFunction2(namedExpressionAdded), namedExpressionRemoved = js.Any.fromFunction2(namedExpressionRemoved), sheetAdded = js.Any.fromFunction1(sheetAdded), sheetRemoved = js.Any.fromFunction2(sheetRemoved), sheetRenamed = js.Any.fromFunction2(sheetRenamed), valuesUpdated = js.Any.fromFunction1(valuesUpdated))
      __obj.asInstanceOf[Listeners]
    }
    
    extension [Self <: Listeners](x: Self) {
      
      inline def setEvaluationResumed(value: js.Array[ExportedChange] => Any): Self = StObject.set(x, "evaluationResumed", js.Any.fromFunction1(value))
      
      inline def setEvaluationSuspended(value: () => Any): Self = StObject.set(x, "evaluationSuspended", js.Any.fromFunction0(value))
      
      inline def setNamedExpressionAdded(value: (String, js.Array[ExportedChange]) => Any): Self = StObject.set(x, "namedExpressionAdded", js.Any.fromFunction2(value))
      
      inline def setNamedExpressionRemoved(value: (String, js.Array[ExportedChange]) => Any): Self = StObject.set(x, "namedExpressionRemoved", js.Any.fromFunction2(value))
      
      inline def setSheetAdded(value: String => Any): Self = StObject.set(x, "sheetAdded", js.Any.fromFunction1(value))
      
      inline def setSheetRemoved(value: (String, js.Array[ExportedChange]) => Any): Self = StObject.set(x, "sheetRemoved", js.Any.fromFunction2(value))
      
      inline def setSheetRenamed(value: (String, String) => Any): Self = StObject.set(x, "sheetRenamed", js.Any.fromFunction2(value))
      
      inline def setValuesUpdated(value: js.Array[ExportedChange] => Any): Self = StObject.set(x, "valuesUpdated", js.Any.fromFunction1(value))
    }
  }
  
  trait TypedEmitter extends StObject {
    
    def off[Event /* <: /* keyof hyperformula.hyperformula/typings/Emitter.Listeners */ sheetAdded | sheetRemoved | sheetRenamed | namedExpressionAdded | namedExpressionRemoved | valuesUpdated | evaluationSuspended | evaluationResumed */](
      s: Event,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: hyperformula.hyperformula/typings/Emitter.Listeners[Event] */ js.Any
    ): Unit
    
    def on[Event /* <: /* keyof hyperformula.hyperformula/typings/Emitter.Listeners */ sheetAdded | sheetRemoved | sheetRenamed | namedExpressionAdded | namedExpressionRemoved | valuesUpdated | evaluationSuspended | evaluationResumed */](
      s: Event,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: hyperformula.hyperformula/typings/Emitter.Listeners[Event] */ js.Any
    ): Unit
    
    def once[Event /* <: /* keyof hyperformula.hyperformula/typings/Emitter.Listeners */ sheetAdded | sheetRemoved | sheetRenamed | namedExpressionAdded | namedExpressionRemoved | valuesUpdated | evaluationSuspended | evaluationResumed */](
      s: Event,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: hyperformula.hyperformula/typings/Emitter.Listeners[Event] */ js.Any
    ): Unit
  }
  object TypedEmitter {
    
    inline def apply(
      off: (Any, /* import warning: importer.ImportType#apply Failed type conversion: hyperformula.hyperformula/typings/Emitter.Listeners[Event] */ js.Any) => Unit,
      on: (Any, /* import warning: importer.ImportType#apply Failed type conversion: hyperformula.hyperformula/typings/Emitter.Listeners[Event] */ js.Any) => Unit,
      once: (Any, /* import warning: importer.ImportType#apply Failed type conversion: hyperformula.hyperformula/typings/Emitter.Listeners[Event] */ js.Any) => Unit
    ): TypedEmitter = {
      val __obj = js.Dynamic.literal(off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once))
      __obj.asInstanceOf[TypedEmitter]
    }
    
    extension [Self <: TypedEmitter](x: Self) {
      
      inline def setOff(
        value: (Any, /* import warning: importer.ImportType#apply Failed type conversion: hyperformula.hyperformula/typings/Emitter.Listeners[Event] */ js.Any) => Unit
      ): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      inline def setOn(
        value: (Any, /* import warning: importer.ImportType#apply Failed type conversion: hyperformula.hyperformula/typings/Emitter.Listeners[Event] */ js.Any) => Unit
      ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnce(
        value: (Any, /* import warning: importer.ImportType#apply Failed type conversion: hyperformula.hyperformula/typings/Emitter.Listeners[Event] */ js.Any) => Unit
      ): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
    }
  }
}
