organization := "org.scalablytyped"
name := "material-components-web"
version := "0.35-dt-20180910Z-611ab6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20180910Z-bdc360",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180910Z-f5b3ba",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20180910Z-92b488",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20180910Z-4695f6",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20180910Z-9ed01d",
  "org.scalablytyped" %%% "material__drawer" % "0.35-dt-20180910Z-b46a8a",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20180910Z-b58a57",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20180910Z-4b966a",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20180910Z-5768c1",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20180910Z-0864ab",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20180910Z-57059f",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20180910Z-a735e2",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20180910Z-db66dd",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20180910Z-81f14f",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20180910Z-c6f111",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20180910Z-7815c0",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20180910Z-b60f8d",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20180910Z-a8af80",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20180910Z-31836e",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20180910Z-46c833",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20180910Z-e363a8",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20180910Z-ede0af",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20180910Z-58d3aa",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20180910Z-d11067",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        