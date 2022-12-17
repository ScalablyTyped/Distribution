package typings.inquirer.mod

import typings.inquirer.anon.IsFinal
import typings.inquirer.inquirerStrings.`type`
import typings.inquirer.mod.^
import typings.inquirer.mod.inquirer.prompts.PromptConstructor
import typings.rxjs.mod.Observable_
import typings.std.Extract
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createPromptModule(): PromptModule = ^.asInstanceOf[js.Dynamic].applyDynamic("createPromptModule")().asInstanceOf[PromptModule]
inline def createPromptModule(opt: StreamOptions): PromptModule = ^.asInstanceOf[js.Dynamic].applyDynamic("createPromptModule")(opt.asInstanceOf[js.Any]).asInstanceOf[PromptModule]

type Answers = Record[String, Any]

type AsyncDynamicQuestionProperty[T, TAnswers /* <: Answers */] = DynamicQuestionProperty[T | js.Promise[T], TAnswers]

type CheckboxQuestionOptions[T /* <: Answers */] = LoopableListQuestionOptionsBase[T, CheckboxChoiceMap[T]]

type ChoiceCollection[T /* <: Answers */] = js.Array[DistinctChoice[T, AllChoiceMap[T]]]

type ConfirmQuestionOptions[T /* <: Answers */] = Question[T]

type DistinctChoice[TAnswers /* <: Answers */, TChoiceMap] = String | (/* import warning: importer.ImportType#apply Failed type conversion: TChoiceMap[keyof TChoiceMap] */ js.Any)

/* Inlined inquirer.inquirer.QuestionMap<T>[keyof inquirer.inquirer.QuestionMap<T>] */
type DistinctQuestion[T /* <: Answers */] = `type`

type DynamicQuestionProperty[T, TAnswers /* <: Answers */] = T | (js.Function1[/* answers */ TAnswers, T])

type ExpandQuestionOptions[T /* <: Answers */] = ListQuestionOptionsBase[T, ExpandChoiceMap[T]]

type KeyUnion[T] = LiteralUnion[Extract[/* keyof T */ String, String], String]

type ListQuestionOptions[T /* <: Answers */] = LoopableListQuestionOptionsBase[T, ListChoiceMap[T]]

/**
  * Represents a union which preserves autocompletion.
  *
  * @template T
  * The keys which are available for autocompletion.
  *
  * @template F
  * The fallback-type.
  */
type LiteralUnion[T /* <: F */, F] = T | F

type NumberQuestionOptions[T /* <: Answers */] = InputQuestionOptions[T]

type PromptFunction = js.Function2[
/* questions */ QuestionCollection[Answers], 
/* initialAnswers */ js.UndefOr[Partial[Answers]], 
js.Promise[Answers]]

/**
  * A component for creating {@link PromptModule `PromptModule`}s.
  */
type PromptModuleCreator = js.Function1[/* opt */ js.UndefOr[StreamOptions], PromptModule]

type QuestionAnswer[T /* <: Answers */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: {  name :K,   answer :T[K]}}[keyof T] */ js.Any

type QuestionCollection[T /* <: Answers */] = DistinctQuestion[T] | js.Array[DistinctQuestion[T]] | Observable_[DistinctQuestion[T]] | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in inquirer.inquirer.KeyUnion<T> ]:? inquirer.inquirer.DistinctQuestion<T> & {  name :never | undefined}} */ js.Any)

type QuestionTypeName = /* import warning: importer.ImportType#apply Failed type conversion: inquirer.inquirer.DistinctQuestion<inquirer.inquirer.Answers>['type'] */ js.Any

type RawListQuestionOptions[T /* <: Answers */] = ListQuestionOptions[T]

/**
  * Represents a function for registering a prompt.
  */
type RegisterFunction = js.Function2[/* name */ String, /* prompt */ PromptConstructor, Unit]

/**
  * Represents a function for restoring a prompt.
  */
type RestoreFunction = js.Function0[Unit]

type Transformer[T /* <: Answers */] = js.UndefOr[
js.Function3[/* input */ Any, /* answers */ T, /* flags */ IsFinal, String | js.Promise[String]]]

type Validator[T /* <: Answers */] = js.UndefOr[
js.Function2[
  /* input */ Any, 
  /* answers */ js.UndefOr[T], 
  Boolean | String | (js.Promise[Boolean | String])
]]
