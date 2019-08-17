package typings.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inquirerMod {
  import typings.inquirer.Anon_IsFinal
  import typings.rxjs.rxjsMod.Observable
  import typings.std.Extract
  import typings.std.Record

  /**
    * A set of answers.
    */
  type Answers = Record[String, js.Any]
  /**
    * Represents a dynamic property for a question which can be fetched asynchronously.
    */
  type AsyncDynamicQuestionProperty[T, TAnswers /* <: Answers */] = DynamicQuestionProperty[T | js.Promise[T], TAnswers]
  /**
    * Provides options for a question for the `CheckboxPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type CheckboxQuestionOptions[T /* <: Answers */] = ListQuestionOptionsBase[T, CheckboxChoiceMap[T]]
  /**
    * Represents a set of choices.
    */
  type ChoiceCollection[T /* <: Answers */] = js.Array[DistinctChoice[AllChoiceMap[Answers]]]
  /**
    * Provides options for a question for the `ConfirmPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type ConfirmQuestionOptions[T /* <: Answers */] = Question[T]
  /**
    * Provides valid choices for the question of the `TChoiceMap`.
    *
    * @template TChoiceMap
    * The choice-types to provide.
    */
  type DistinctChoice[TChoiceMap] = String | (/* import warning: ImportType.apply Failed type conversion: TChoiceMap[keyof TChoiceMap] */ js.Any)
  /**
    * Represents a dynamic property for a question.
    */
  type DynamicQuestionProperty[T, TAnswers /* <: Answers */] = T | (js.Function1[/* answers */ TAnswers, T])
  /**
    * Provides options for a question for the `EditorPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type EditorQuestionOptions[T /* <: Answers */] = Question[T]
  /**
    * Provides options for a question for the `ExpandPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type ExpandQuestionOptions[T /* <: Answers */] = ListQuestionOptionsBase[T, ExpandChoiceMap[T]]
  /**
    * Represents either a key of `T` or a `string`.
    *
    * @template T
    * The type of the keys to suggest.
    */
  type KeyUnion[T] = LiteralUnion[Extract[String, String], String]
  /**
    * Provides options for a question for the `ListPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type ListQuestionOptions[T /* <: Answers */] = ListQuestionOptionsBase[T, ListChoiceMap[T]]
  /**
    * Represents a union which preserves autocompletion.
    *
    * @template T
    * The keys which are available for autocompletion.
    *
    * @template F
    * The fallback-type.
    */
  type LiteralUnion[T /* <: F */, F] = T | (F with js.Object)
  /**
    * Provides options for a question for the `NumberPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type NumberQuestionOptions[T /* <: Answers */] = InputQuestionOptions[T]
  /**
    * Represents a collection of questions.
    *
    * @template T
    * The type of the answers.
    */
  type QuestionCollection[T /* <: Answers */] = DistinctQuestion[T] | js.Array[DistinctQuestion[T]] | Observable[DistinctQuestion[T]]
  /**
    * Provides options for a question for the `RawListPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type RawListQuestionOptions[T /* <: Answers */] = ListQuestionOptions[T]
  /**
    * Provides the functionality to transform an answer.
    *
    * @template T
    * The type of the answers.
    */
  type Transformer[T /* <: Answers */] = js.UndefOr[
    js.Function3[
      /* input */ js.Any, 
      /* answers */ T, 
      /* flags */ Anon_IsFinal, 
      String | js.Promise[String]
    ]
  ]
  /**
    * Converts the specified union-type `U` to an intersection-type.
    *
    * @template U
    * The union to convert to an intersection.
    */
  type UnionToIntersection[U] = js.Any
  /**
    * Provides the functionality to validate answers.
    *
    * @template T
    * The type of the answers.
    */
  type Validator[T /* <: Answers */] = js.UndefOr[
    js.Function2[
      /* input */ js.Any, 
      /* answers */ js.UndefOr[T], 
      Boolean | String | (js.Promise[Boolean | String])
    ]
  ]
}
