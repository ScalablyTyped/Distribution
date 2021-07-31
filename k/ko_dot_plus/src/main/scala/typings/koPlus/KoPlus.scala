package typings.koPlus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// namespace for ko.plus types
//
object KoPlus {
  
  @js.native
  trait Command extends StObject {
    
    // execute the command
    def apply(): Unit = js.native
    
    def always(callback: js.Function): Command = js.native
    
    var canExecute: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any = js.native
    
    var completed: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
    
    //
    // functions
    // see https://github.com/stevegreatrex/ko.plus#functions
    //
    def done(callback: js.Function1[/* data */ js.Any, Unit]): Command = js.native
    
    def fail(
      callback: js.Function3[
          /* response */ js.Any, 
          /* status */ js.UndefOr[String], 
          /* statusText */ js.UndefOr[String], 
          Unit
        ]
    ): Command = js.native
    
    var failed: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
    
    //
    // properties: https://github.com/stevegreatrex/ko.plus#properties
    //
    var isRunning: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
    
    def `then`(resolve: js.Function, reject: js.Function): Command = js.native
  }
  
  trait CommandOptions extends StObject {
    
    // [required] sets the command action method
    var action: js.Function
    
    // [optional] function to determine if command can be executed
    var canExecute: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    // [optional] context to use in the command
    var context: js.UndefOr[js.Any] = js.undefined
  }
  object CommandOptions {
    
    @scala.inline
    def apply(action: js.Function): CommandOptions = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandOptions]
    }
    
    @scala.inline
    implicit class CommandOptionsMutableBuilder[Self <: CommandOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: js.Function): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanExecute(value: () => Boolean): Self = StObject.set(x, "canExecute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCanExecuteUndefined: Self = StObject.set(x, "canExecute", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<T> * / any */ trait Editable[T]
    extends StObject
       with EditableFunctions
  object Editable {
    
    @scala.inline
    def apply[T](
      beginEdit: () => Unit,
      cancelEdit: () => Unit,
      endEdit: () => Unit,
      isEditing: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
      rollback: () => Unit
    ): Editable[T] = {
      val __obj = js.Dynamic.literal(beginEdit = js.Any.fromFunction0(beginEdit), cancelEdit = js.Any.fromFunction0(cancelEdit), endEdit = js.Any.fromFunction0(endEdit), isEditing = isEditing.asInstanceOf[js.Any], rollback = js.Any.fromFunction0(rollback))
      __obj.asInstanceOf[Editable[T]]
    }
  }
  
  trait EditableArray[T]
    extends StObject
       with KnockoutObservableArray[T]
       with EditableFunctions
  object EditableArray {
    
    @scala.inline
    def apply[T](
      beginEdit: () => Unit,
      cancelEdit: () => Unit,
      endEdit: () => Unit,
      isEditing: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
      rollback: () => Unit,
      setSourceKey: String => Unit,
      sortDescending: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
      sortKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any
    ): EditableArray[T] = {
      val __obj = js.Dynamic.literal(beginEdit = js.Any.fromFunction0(beginEdit), cancelEdit = js.Any.fromFunction0(cancelEdit), endEdit = js.Any.fromFunction0(endEdit), isEditing = isEditing.asInstanceOf[js.Any], rollback = js.Any.fromFunction0(rollback), setSourceKey = js.Any.fromFunction1(setSourceKey), sortDescending = sortDescending.asInstanceOf[js.Any], sortKey = sortKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditableArray[T]]
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArrayStatic * / any */ @js.native
  trait EditableArrayStatic extends StObject {
    
    def apply[T](): EditableArray[T] = js.native
    def apply[T](value: js.Array[T]): EditableArray[T] = js.native
    
    def makeEditable(target: js.Any): Unit = js.native
  }
  
  trait EditableFunctions extends StObject {
    
    def beginEdit(): Unit
    
    def cancelEdit(): Unit
    
    def endEdit(): Unit
    
    var isEditing: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    
    def rollback(): Unit
  }
  object EditableFunctions {
    
    @scala.inline
    def apply(
      beginEdit: () => Unit,
      cancelEdit: () => Unit,
      endEdit: () => Unit,
      isEditing: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
      rollback: () => Unit
    ): EditableFunctions = {
      val __obj = js.Dynamic.literal(beginEdit = js.Any.fromFunction0(beginEdit), cancelEdit = js.Any.fromFunction0(cancelEdit), endEdit = js.Any.fromFunction0(endEdit), isEditing = isEditing.asInstanceOf[js.Any], rollback = js.Any.fromFunction0(rollback))
      __obj.asInstanceOf[EditableFunctions]
    }
    
    @scala.inline
    implicit class EditableFunctionsMutableBuilder[Self <: EditableFunctions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeginEdit(value: () => Unit): Self = StObject.set(x, "beginEdit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCancelEdit(value: () => Unit): Self = StObject.set(x, "cancelEdit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEndEdit(value: () => Unit): Self = StObject.set(x, "endEdit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsEditing(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
      ): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRollback(value: () => Unit): Self = StObject.set(x, "rollback", js.Any.fromFunction0(value))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableStatic * / any */ @js.native
  trait EditableStatic extends StObject {
    
    def apply[T](): Editable[T] = js.native
    def apply[T](value: T): Editable[T] = js.native
    
    def makeEditable(target: js.Any): Unit = js.native
  }
}
