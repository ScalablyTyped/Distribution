organization := "com.scalablytyped"
name := "material-components-web"
version := "0.35-dt-20180910Z-77330f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "material__auto-init" % "0.35-dt-20180910Z-d82a2b",
  "com.scalablytyped" %%% "material__base" % "0.35-dt-20180910Z-ce1a76",
  "com.scalablytyped" %%% "material__checkbox" % "0.35-dt-20180910Z-94715c",
  "com.scalablytyped" %%% "material__chips" % "0.35-dt-20180910Z-99bd3e",
  "com.scalablytyped" %%% "material__dialog" % "0.35-dt-20180910Z-915d6d",
  "com.scalablytyped" %%% "material__drawer" % "0.35-dt-20180910Z-28a627",
  "com.scalablytyped" %%% "material__floating-label" % "0.35-dt-20180910Z-d392db",
  "com.scalablytyped" %%% "material__form-field" % "0.35-dt-20180910Z-cbfdb6",
  "com.scalablytyped" %%% "material__grid-list" % "0.35-dt-20180910Z-a1dcc8",
  "com.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20180910Z-1efcef",
  "com.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20180910Z-99105e",
  "com.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20180910Z-ba39a8",
  "com.scalablytyped" %%% "material__menu" % "0.35-dt-20180910Z-eaabfe",
  "com.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20180910Z-ec9f2c",
  "com.scalablytyped" %%% "material__radio" % "0.35-dt-20180910Z-1cd98a",
  "com.scalablytyped" %%% "material__ripple" % "0.35-dt-20180910Z-974ad6",
  "com.scalablytyped" %%% "material__select" % "0.35-dt-20180910Z-414507",
  "com.scalablytyped" %%% "material__selection-control" % "0.35-dt-20180910Z-7378e8",
  "com.scalablytyped" %%% "material__slider" % "0.35-dt-20180910Z-34f3fe",
  "com.scalablytyped" %%% "material__snackbar" % "0.35-dt-20180910Z-b01e7d",
  "com.scalablytyped" %%% "material__tabs" % "0.35-dt-20180910Z-d27571",
  "com.scalablytyped" %%% "material__textfield" % "0.35-dt-20180910Z-1a198f",
  "com.scalablytyped" %%% "material__toolbar" % "0.35-dt-20180910Z-d4e06e",
  "com.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20180910Z-8f0035",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        