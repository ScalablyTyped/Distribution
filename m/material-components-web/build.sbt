organization := "org.scalablytyped"
name := "material-components-web"
version := "14.0.0-aaff65"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__auto-init" % "14.0.0-920e28",
  "org.scalablytyped" %%% "material__banner" % "14.0.0-7ae104",
  "org.scalablytyped" %%% "material__base" % "14.0.0-e5693b",
  "org.scalablytyped" %%% "material__checkbox" % "14.0.0-e36e7b",
  "org.scalablytyped" %%% "material__chips" % "14.0.0-384b3a",
  "org.scalablytyped" %%% "material__circular-progress" % "14.0.0-71fda6",
  "org.scalablytyped" %%% "material__data-table" % "14.0.0-d0b9f7",
  "org.scalablytyped" %%% "material__dialog" % "14.0.0-cea267",
  "org.scalablytyped" %%% "material__dom" % "14.0.0-af3058",
  "org.scalablytyped" %%% "material__drawer" % "14.0.0-f0263d",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-09fcf2",
  "org.scalablytyped" %%% "material__form-field" % "14.0.0-adaa24",
  "org.scalablytyped" %%% "material__icon-button" % "14.0.0-b827d6",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-22e100",
  "org.scalablytyped" %%% "material__linear-progress" % "14.0.0-a94300",
  "org.scalablytyped" %%% "material__list" % "14.0.0-6d5a58",
  "org.scalablytyped" %%% "material__menu" % "14.0.0-995d74",
  "org.scalablytyped" %%% "material__menu-surface" % "14.0.0-c35780",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-7f9e35",
  "org.scalablytyped" %%% "material__progress-indicator" % "14.0.0-bb4c94",
  "org.scalablytyped" %%% "material__radio" % "14.0.0-de9fb2",
  "org.scalablytyped" %%% "material__ripple" % "14.0.0-dfbf52",
  "org.scalablytyped" %%% "material__segmented-button" % "14.0.0-def03a",
  "org.scalablytyped" %%% "material__select" % "14.0.0-856012",
  "org.scalablytyped" %%% "material__slider" % "14.0.0-c9b824",
  "org.scalablytyped" %%% "material__snackbar" % "14.0.0-db51c6",
  "org.scalablytyped" %%% "material__switch" % "14.0.0-0d577f",
  "org.scalablytyped" %%% "material__tab" % "14.0.0-b8bb55",
  "org.scalablytyped" %%% "material__tab-bar" % "14.0.0-6a8503",
  "org.scalablytyped" %%% "material__tab-indicator" % "14.0.0-5e5110",
  "org.scalablytyped" %%% "material__tab-scroller" % "14.0.0-92a5c4",
  "org.scalablytyped" %%% "material__textfield" % "14.0.0-be56dc",
  "org.scalablytyped" %%% "material__tooltip" % "14.0.0-66e7a3",
  "org.scalablytyped" %%% "material__top-app-bar" % "14.0.0-68527b",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
