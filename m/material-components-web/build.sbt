organization := "com.scalablytyped"
name := "material-components-web"
version := "0.35-dt-20181102Z-5815bd"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "material__auto-init" % "0.35-dt-20181102Z-b272f5",
  "com.scalablytyped" %%% "material__base" % "0.35-dt-20181102Z-479e75",
  "com.scalablytyped" %%% "material__checkbox" % "0.35-dt-20181102Z-f52ae7",
  "com.scalablytyped" %%% "material__chips" % "0.35-dt-20181102Z-61e039",
  "com.scalablytyped" %%% "material__dialog" % "0.35-dt-20181102Z-634172",
  "com.scalablytyped" %%% "material__drawer" % "0.35-dt-20181102Z-e7c37c",
  "com.scalablytyped" %%% "material__floating-label" % "0.35-dt-20181102Z-164df8",
  "com.scalablytyped" %%% "material__form-field" % "0.35-dt-20181102Z-b4c272",
  "com.scalablytyped" %%% "material__grid-list" % "0.35-dt-20181102Z-19825d",
  "com.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20181102Z-fccbc8",
  "com.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20181102Z-1da475",
  "com.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20181102Z-557b76",
  "com.scalablytyped" %%% "material__menu" % "0.35-dt-20181102Z-3e34ef",
  "com.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20181102Z-8b206c",
  "com.scalablytyped" %%% "material__radio" % "0.35-dt-20181102Z-e7e896",
  "com.scalablytyped" %%% "material__ripple" % "0.35-dt-20181102Z-4659ee",
  "com.scalablytyped" %%% "material__select" % "0.35-dt-20181102Z-d432f1",
  "com.scalablytyped" %%% "material__selection-control" % "0.35-dt-20181102Z-a43c7a",
  "com.scalablytyped" %%% "material__slider" % "0.35-dt-20181102Z-9d310e",
  "com.scalablytyped" %%% "material__snackbar" % "0.35-dt-20181102Z-8ee594",
  "com.scalablytyped" %%% "material__tabs" % "0.35-dt-20181102Z-0c382d",
  "com.scalablytyped" %%% "material__textfield" % "0.35-dt-20181102Z-a453d3",
  "com.scalablytyped" %%% "material__toolbar" % "0.35-dt-20181102Z-28eb71",
  "com.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20181102Z-da7a9b",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        